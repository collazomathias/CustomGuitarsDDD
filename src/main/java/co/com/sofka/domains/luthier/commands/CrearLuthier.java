package co.com.sofka.domains.luthier.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.luthier.value.LuthierId;
import co.com.sofka.domains.luthier.value.NombreLuthier;

public class CrearLuthier extends Command {

    private final LuthierId luthierId;
    private final NombreLuthier nombreLuthier;

    public CrearLuthier(LuthierId luthierId, NombreLuthier nombreLuthier) {
        this.luthierId = luthierId;
        this.nombreLuthier = nombreLuthier;
    }

    public LuthierId getLuthierId() {
        return luthierId;
    }

    public NombreLuthier getNombreLuthier() {
        return nombreLuthier;
    }
    
}
