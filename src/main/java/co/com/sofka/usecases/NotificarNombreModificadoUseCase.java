package co.com.sofka.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.luthier.Luthier;
import co.com.sofka.domains.luthier.events.NombreModificado;
import co.com.sofka.domains.luthier.value.LuthierId;

import java.util.List;

public class NotificarNombreModificadoUseCase extends UseCase<TriggeredEvent<NombreModificado>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<NombreModificado> input) {
        var evento = input.getDomainEvent();
        var servicio = getService(SMSService.class).orElseThrow();

        var eventos = repository().getEventsBy(evento.aggregateRootId());
        var luthier = Luthier.from(LuthierId.of(evento.aggregateRootId()), eventos);

        var resultado = servicio.enviarMensajeLuthier(luthier.identity(), "Se cambio el nombre del luthier");

        if (resultado) {
            emit().onResponse(new ResponseEvents(List.of()));
        } else {
            throw new BusinessException(evento.aggregateRootId(), "No se pudo enviar el mensaje");
        }
    }
}
