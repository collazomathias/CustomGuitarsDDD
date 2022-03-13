package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.Estado;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class EstadoModificado extends DomainEvent {

    private final GuitarraId guitarraId;
    private final Estado estado;

    public EstadoModificado(GuitarraId guitarraId, Estado estado) {
        super("guitarra.events.estadomodificado");
        this.guitarraId = guitarraId;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }
    
}
