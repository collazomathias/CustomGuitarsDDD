package co.com.sofka.domains.luthier.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.luthier.value.NombreLuthier;

public class LuthierCreado extends DomainEvent {

    private final NombreLuthier nombreLuthier;

    public LuthierCreado(NombreLuthier nombreLuthier) {
        super("luthier.events.luthiercreado");
        this.nombreLuthier = nombreLuthier;
    }

    public NombreLuthier getNombreLuthier() {
        return nombreLuthier;
    }
    
}
