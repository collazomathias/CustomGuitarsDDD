package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.guitarra.LuthierId;

public class GuitarraCreada extends DomainEvent {
    private final LuthierId luthierId;

    public GuitarraCreada(LuthierId luthierId){
        super("guitarra.guitarracreada");
        this.luthierId = luthierId;
    }

    public LuthierId getLuthierId(){
        return luthierId;
    }
}
