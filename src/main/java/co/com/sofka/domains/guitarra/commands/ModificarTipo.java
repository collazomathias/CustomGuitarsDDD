package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Tipo;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class ModificarTipo extends Command {
    
    private final GuitarraId guitarraId;
    private final Tipo tipo;

    public ModificarTipo(GuitarraId guitarraId, Tipo tipo) {
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
