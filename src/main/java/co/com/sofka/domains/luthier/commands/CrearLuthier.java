package co.com.sofka.domains.luthier.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.luthier.value.luthier.LuthierId;

public class CrearLuthier extends Command {
    private final LuthierId luthierId;

    public CrearLuthier(LuthierId luthierId){
        this.luthierId = luthierId;
    }

    public LuthierId luthierId() {
        return luthierId;
    }
}
