package co.com.sofka.domains.luthier;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.luthier.value.luthier.LuthierId;
import co.com.sofka.domains.luthier.value.luthier.NombreLuthier;

public class Luthier extends AggregateEvent<LuthierId>{
    
    private NombreLuthier nombre;
    private List<Certificacion> certificaciones;

    public Luthier(LuthierId entityId, NombreLuthier nombre, List<Certificacion> certificaciones) {
        super(entityId);
        this.nombre = nombre;
        this.certificaciones = certificaciones;
    }

    public List<Certificacion> certificaciones() {
        return certificaciones;
    }

    public NombreLuthier nombre() {
        return nombre;
    }

    public LuthierId luthierId(){
        return this.luthierId();
    }

}
