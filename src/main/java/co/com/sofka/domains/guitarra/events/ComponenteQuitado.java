package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.componente.Descripcion;
import co.com.sofka.domains.guitarra.values.componente.NombreComponente;
import co.com.sofka.domains.guitarra.values.guitarra.GuitarraId;

public class ComponenteQuitado extends DomainEvent {
    private final GuitarraId guitarraId;
    private final Descripcion descripcion;
    private final NombreComponente nombre;

    public ComponenteQuitado(GuitarraId guitarraId, Descripcion descripcion, NombreComponente nombre) {
        super("guitarra.componentequitado");
        this.guitarraId = guitarraId;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public NombreComponente getNombre() {
        return nombre;
    }
}
