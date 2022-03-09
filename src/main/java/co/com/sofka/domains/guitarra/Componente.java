package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.values.componente.ComponenteId;
import co.com.sofka.domains.guitarra.values.componente.Descripcion;
import co.com.sofka.domains.guitarra.values.componente.NombreComponente;

public class Componente extends Entity<ComponenteId> {

    private final Descripcion descripcion;
    private final NombreComponente nombre;

    public Componente(ComponenteId entityId, Descripcion descripcion, NombreComponente nombre) {
        super(entityId);
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public NombreComponente nombre() {
        return nombre;
    }

    public ComponenteId componenteId() {
        return this.componenteId();
    }

}
