package co.com.sofka.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domains.luthier.commands.CrearLuthier;
import co.com.sofka.domains.luthier.events.LuthierCreado;
import co.com.sofka.domains.luthier.value.LuthierId;
import co.com.sofka.domains.luthier.value.NombreLuthier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearLuthierUseCaseTest {
    @Test
    void crearLuthier() {
        LuthierId luthierId = LuthierId.of("XXXX1");
        NombreLuthier nombreLuthier = new NombreLuthier("Henry Ferreira");

        CrearLuthier crearLuthier = new CrearLuthier(luthierId, nombreLuthier);

        CrearLuthierUseCase useCase = new CrearLuthierUseCase();
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(crearLuthier))
                .orElseThrow()
                .getDomainEvents();

        var event = (LuthierCreado) events.get(0);
        Assertions.assertEquals("luthier.events.luthiercreado", event.type);
        Assertions.assertEquals("XXXX1", event.aggregateRootId());
        Assertions.assertEquals("Henry Ferreira", event.getNombreLuthier().value());

    }
}