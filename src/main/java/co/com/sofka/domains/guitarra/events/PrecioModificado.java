package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.PrecioGuitarra;

public class PrecioModificado extends DomainEvent {
    
    private final GuitarraId guitarraId;
    private final PrecioGuitarra precioGuitarra;

    public PrecioModificado(GuitarraId guitarraId, PrecioGuitarra precioGuitarra) {
        super("guitarra.events.preciomodificado");
        this.guitarraId = guitarraId;
        this.precioGuitarra = precioGuitarra;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }
    
    public PrecioGuitarra getPrecioGuitarra() {
        return precioGuitarra;
    }

}
