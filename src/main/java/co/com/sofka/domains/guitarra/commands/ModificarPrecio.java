package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.PrecioGuitarra;

public class ModificarPrecio extends Command {
    
    private final GuitarraId guitarraId;
    private final PrecioGuitarra precioGuitarra;

    public ModificarPrecio(GuitarraId guitarraId, PrecioGuitarra precioGuitarra) {
        this.guitarraId = guitarraId;
        this.precioGuitarra = precioGuitarra;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public PrecioGuitarra getPrecioGuitarra() {
        return precioGuitarra;
    }

}
