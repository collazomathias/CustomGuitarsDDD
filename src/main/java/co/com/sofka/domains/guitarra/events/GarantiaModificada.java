package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.Garantia;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class GarantiaModificada extends DomainEvent {
    
    private final GuitarraId guitarraId;
    private final Garantia garantia;

    public GarantiaModificada(GuitarraId guitarraId, Garantia garantia) {
        super("guitarra.events.garantiamodificada");
        this.guitarraId = guitarraId;
        this.garantia = garantia;
    }

    public Garantia getGarantia() {
        return garantia;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

}
