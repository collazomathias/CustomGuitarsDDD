package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.value.componente.ComponenteId;
import co.com.sofka.domains.guitarra.value.componente.Descripcion;
import co.com.sofka.domains.guitarra.value.componente.Nombre;

public class Componente extends Entity<ComponenteId>{

    private Descripcion descripcion;
    private Nombre nombre;

    public Componente(ComponenteId entityId) {
        super(entityId);
        //TODO Auto-generated constructor stub
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Nombre nombre() {
        return nombre;
    }
    
}
