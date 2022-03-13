package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.ComponenteId;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class ComponenteQuitado extends DomainEvent {

    private final GuitarraId guitarraId;
    private final ComponenteId componenteId;

    public ComponenteQuitado(GuitarraId guitarraId, ComponenteId componenteId) {
        super("guitarra.events.componentequitado");
        this.guitarraId = guitarraId;
        this.componenteId = componenteId;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }
    
    public ComponenteId getComponenteId() {
        return componenteId;
    }
    
}
