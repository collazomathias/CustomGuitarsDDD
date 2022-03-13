package co.com.sofka.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.luthier.Luthier;
import co.com.sofka.domains.luthier.commands.CrearLuthier;
import co.com.sofka.domains.luthier.events.LuthierCreado;
import co.com.sofka.domains.luthier.events.NombreModificado;
import co.com.sofka.domains.luthier.value.LuthierId;
import co.com.sofka.domains.luthier.value.NombreLuthier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.w3c.dom.events.Event;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NotificarNombreModificadoUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Mock
    private SMSService service;

    @Test
    void notificarNombreModificado() {
        var event = new NombreModificado(LuthierId.of("XXXX1"), new NombreLuthier("NOMBRE NUEVO"));
        event.setAggregateRootId("XXXX1");
        Mockito.when(repository.getEventsBy("XXXX1")).thenReturn(history());
        Mockito.when(service.enviarMensajeLuthier(Mockito.any(LuthierId.class), Mockito.anyString())).thenReturn(true);

        var useCase = new NotificarNombreModificadoUseCase();
        useCase.addRepository(repository);
        useCase.addServiceBuilder(new ServiceBuilder().addService(service));

        var isPresent = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("XXXX1")
                .syncExecutor(useCase, new TriggeredEvent<>(event)).isPresent();
        Assertions.assertTrue(isPresent);
    }

    @Test
    void problemaNotificarNombreModificado() {
        var event = new NombreModificado(LuthierId.of("XXXX1"), new NombreLuthier("NOMBRE NUEVO"));
        event.setAggregateRootId("XXXX1");
        Mockito.when(repository.getEventsBy("XXXX1")).thenReturn(history());
        Mockito.when(service.enviarMensajeLuthier(Mockito.any(LuthierId.class), Mockito.anyString())).thenReturn(false);

        var useCase = new NotificarNombreModificadoUseCase();
        useCase.addRepository(repository);
        useCase.addServiceBuilder(new ServiceBuilder().addService(service));

        var mensaje = Assertions.assertThrows(BusinessException.class, () -> {
            UseCaseHandler.getInstance()
                    .setIdentifyExecutor("XXXX1")
                    .syncExecutor(useCase, new TriggeredEvent<>(event));
        }).getMessage();

        Assertions.assertEquals("No se pudo enviar el mensaje", mensaje);
    }

    private List<DomainEvent> history() {
        NombreLuthier nombreLuthier = new NombreLuthier("Henry Ferreira");
        return List.of(new LuthierCreado(nombreLuthier));
    }
}