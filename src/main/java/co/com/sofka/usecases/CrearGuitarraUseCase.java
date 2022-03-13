package co.com.sofka.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.commands.CrearGuitarra;

public class CrearGuitarraUseCase extends UseCase<RequestCommand<CrearGuitarra>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearGuitarra> input) {
        CrearGuitarra crearGuitarra = input.getCommand();

        Guitarra guitarra = new Guitarra(
                crearGuitarra.getGuitarraId(),
                crearGuitarra.getLuthierId(),
                crearGuitarra.getGarantia(),
                crearGuitarra.getTipo(),
                crearGuitarra.getEstado(),
                crearGuitarra.getAfinado()
        );
        emit().onResponse(new ResponseEvents(guitarra.getUncommittedChanges()));
    }
}
