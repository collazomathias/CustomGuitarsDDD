package co.com.sofka.domains.luthier;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.luthier.events.LuthierCreado;
import co.com.sofka.domains.luthier.value.LuthierId;
import co.com.sofka.domains.luthier.value.NombreLuthier;

public class Luthier extends AggregateEvent<LuthierId> {

    protected ArrayList<GuitarraId> guitarras;
    protected ArrayList<Certificacion> certificaciones;
    protected NombreLuthier nombreLuthier;

    public Luthier(LuthierId luthierId, NombreLuthier nombreLuthier) {
        super(luthierId);
        appendChange(new LuthierCreado(nombreLuthier)).apply();
        subscribe(new LuthierEventChange(this));
    }

    private Luthier(LuthierId luthierId) {
        super(luthierId);
        subscribe(new LuthierEventChange(this));
    }

    public static Luthier from(LuthierId luthierId, List<DomainEvent> events) {
        var luthier = new Luthier(luthierId);
        events.forEach(luthier::applyEvent);
        return luthier;
    }

    public ArrayList<GuitarraId> guitarras() {
        return guitarras;
    }

    public NombreLuthier nombreLuthier() {
        return nombreLuthier;
    }
    
}
