package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.values.Estado;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class ModificarEstado extends Command {
    
    private final GuitarraId guitarraId;
    private final Estado estado;

    public ModificarEstado(GuitarraId guitarraId, Estado estado) {
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
