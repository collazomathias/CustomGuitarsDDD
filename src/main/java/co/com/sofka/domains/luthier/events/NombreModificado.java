package co.com.sofka.domains.luthier.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.luthier.value.LuthierId;
import co.com.sofka.domains.luthier.value.NombreLuthier;

public class NombreModificado extends DomainEvent {

    private final LuthierId luthierId;
    private final NombreLuthier nombreLuthier;

    public NombreModificado(LuthierId luthierId, NombreLuthier nombreLuthier) {
        super("luthier.events.nombremodificado");
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
