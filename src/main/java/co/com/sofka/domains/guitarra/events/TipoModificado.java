package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.Tipo;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class TipoModificado extends DomainEvent {
    
    private final GuitarraId guitarraId;
    private final Tipo tipo;

    public TipoModificado(GuitarraId guitarraId, Tipo tipo) {
        super("guitarra.events.tipomodificado");
        this.guitarraId = guitarraId;
        this.tipo = tipo;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
