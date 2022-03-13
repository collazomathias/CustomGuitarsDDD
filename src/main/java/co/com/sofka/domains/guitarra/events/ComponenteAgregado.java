package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.ComponenteId;
import co.com.sofka.domains.guitarra.values.DescripcionComponente;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.NombreComponente;
import co.com.sofka.domains.guitarra.values.PrecioComponente;

public class ComponenteAgregado extends DomainEvent {
    
    private final GuitarraId guitarraId;
    private final ComponenteId componenteId;
    private final PrecioComponente precioComponente;
    private final DescripcionComponente descripcionComponente;
    private final NombreComponente nombreComponente;

    public ComponenteAgregado(GuitarraId guitarraId, ComponenteId componenteId, PrecioComponente precioComponente, DescripcionComponente descripcionComponente, NombreComponente nombreComponente) {
        super("guitarra.events.componenteagregado");
        this.guitarraId = guitarraId;
        this.componenteId = componenteId;
        this.precioComponente = precioComponente;
        this.descripcionComponente = descripcionComponente;
        this.nombreComponente = nombreComponente;
    }

    public ComponenteId getComponenteId() {
        return componenteId;
    }

    public DescripcionComponente getDescripcionComponente() {
        return descripcionComponente;
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
