package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Garantia;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class ModificarGarantia extends Command {
    
    private final GuitarraId guitarraId;
    private final Garantia garantia;

    public ModificarGarantia(GuitarraId guitarraId, Garantia garantia) {
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
