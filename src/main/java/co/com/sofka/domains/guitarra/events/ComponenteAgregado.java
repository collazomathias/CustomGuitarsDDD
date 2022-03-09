package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.values.componente.Descripcion;
import co.com.sofka.domains.guitarra.values.componente.Nombre;
import co.com.sofka.domains.guitarra.values.guitarra.GuitarraId;

public class ComponenteAgregado extends DomainEvent {
    private final GuitarraId guitarraId;
    private final Descripcion descripcion;
    private final Nombre nombre;

    public ComponenteAgregado(GuitarraId guitarraId, Descripcion descripcion, Nombre nombre) {
        super("guitarra.componenteagregado");
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

    public Nombre getNombre() {
        return nombre;
    }
}
