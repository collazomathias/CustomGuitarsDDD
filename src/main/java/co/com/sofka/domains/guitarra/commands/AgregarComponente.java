package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.values.ComponenteId;
import co.com.sofka.domains.guitarra.values.DescripcionComponente;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.NombreComponente;
import co.com.sofka.domains.guitarra.values.PrecioComponente;

public class AgregarComponente extends Command {

    private final GuitarraId guitarraId;
    private final ComponenteId componenteId;
    private final PrecioComponente precioComponente;
    private final DescripcionComponente descripcionComponente;
    private final NombreComponente nombreComponente;

    public AgregarComponente(GuitarraId guitarraId, ComponenteId componenteId, PrecioComponente precioComponente, DescripcionComponente descripcionComponente, NombreComponente nombreComponente) {
        this.guitarraId = guitarraId;
        this.componenteId = componenteId;
        this.precioComponente = precioComponente;
        this.descripcionComponente = descripcionComponente;
        this.nombreComponente = nombreComponente;
    }

    public DescripcionComponente getDescripcionComponente() {
        return descripcionComponente;
    }

    public ComponenteId getComponenteId() {
        return componenteId;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public NombreComponente getNombreComponente() {
        return nombreComponente;
    }

    public PrecioComponente getPrecioComponente() {
        return precioComponente;
    }
    
}
