package co.com.sofka.domains.guitarra;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.events.GuitarraCreada;
import co.com.sofka.domains.guitarra.values.Afinado;
import co.com.sofka.domains.guitarra.values.Estado;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.PrecioGuitarra;
import co.com.sofka.domains.luthier.value.LuthierId;

public class Guitarra extends AggregateEvent<GuitarraId> {

    protected LuthierId luthierId;
    protected ArrayList<Componente> componentes;
    protected Garantia garantia;
    protected Tipo tipo;
    protected PrecioGuitarra precioGuitarra;
    protected Estado estado;
    protected Afinado afinado;

    public Guitarra(GuitarraId guitarraId, LuthierId luthierId, Garantia garantia, Tipo tipo, Estado estado, Afinado afinado) {
        super(guitarraId);
        appendChange(new GuitarraCreada(garantia, luthierId, tipo, estado, afinado)).apply();
        subscribe(new GuitarraEventChange(this));
    }

    private Guitarra(GuitarraId guitarraId) {
        super(guitarraId);
        subscribe(new GuitarraEventChange(this));
    }

    public static Guitarra from(GuitarraId guitarraId, List<DomainEvent> events) {
        var guitarra = new Guitarra(guitarraId);
        events.forEach(guitarra::applyEvent);
        return guitarra;
    }

    public Afinado afinado() {
        return afinado;
    }

    public ArrayList<Componente> componentes() {
        return componentes;
    }

    public Estado estado() {
        return estado;
    }

    public Garantia garantia() {
        return garantia;
    }

    public LuthierId luthierId() {
        return luthierId;
    }

    public PrecioGuitarra precioGuitarra() {
        return precioGuitarra;
    }

    public Tipo tipo() {
        return tipo;
    }
    
}
