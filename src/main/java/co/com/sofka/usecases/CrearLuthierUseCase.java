package co.com.sofka.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.luthier.Luthier;
import co.com.sofka.domains.luthier.commands.CrearLuthier;
import co.com.sofka.domains.luthier.value.LuthierId;
import co.com.sofka.domains.luthier.value.NombreLuthier;

public class CrearLuthierUseCase extends UseCase<RequestCommand<CrearLuthier>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearLuthier> input) {
        CrearLuthier crearLuthier = input.getCommand();

        Luthier luthier = new Luthier(
                crearLuthier.getLuthierId(),
                crearLuthier.getNombreLuthier()
        );
        emit().onResponse(new ResponseEvents(luthier.getUncommittedChanges()));
    }
}
