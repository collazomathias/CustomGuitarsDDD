package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.values.Afinado;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class AfinarGuitarra extends Command {
    
    private final GuitarraId guitarraId;
    private final Afinado afinado;

    public AfinarGuitarra(GuitarraId guitarraId, Afinado afinado) {
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
