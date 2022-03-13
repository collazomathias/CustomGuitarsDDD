package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.values.ComponenteId;
import co.com.sofka.domains.guitarra.values.GuitarraId;

public class QuitarComponente extends Command {

    private final GuitarraId guitarraId;
    private final ComponenteId componenteId;

    public QuitarComponente(GuitarraId guitarraId, ComponenteId componenteId) {
        this.guitarraId = guitarraId;
        this.componenteId = componenteId;
    }

    public ComponenteId getComponenteId() {
        return componenteId;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }
    
}
