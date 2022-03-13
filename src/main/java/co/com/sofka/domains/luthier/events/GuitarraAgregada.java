package co.com.sofka.domains.luthier.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.luthier.value.LuthierId;

public class GuitarraAgregada extends DomainEvent {

    private final LuthierId luthierId;
    private final GuitarraId guitarraId;

    public GuitarraAgregada(LuthierId luthierId, GuitarraId guitarraId) {
        super("luthier.events.guitarraagregada");
        this.luthierId = luthierId;
        this.guitarraId = guitarraId;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public LuthierId getLuthierId() {
        return luthierId;
    }
    
}
