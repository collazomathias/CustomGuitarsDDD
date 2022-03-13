package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.Afinado;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class GuitarraAfinada extends DomainEvent {
    
    private final GuitarraId guitarraId;
    private final Afinado afinado;

    public GuitarraAfinada(GuitarraId guitarraId, Afinado afinado) {
        super("guitarra.events.guitarraafinada");
        this.guitarraId = guitarraId;
        this.afinado = afinado;
    }

    public Afinado getAfinado() {
        return afinado;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

}
