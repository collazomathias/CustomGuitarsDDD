package co.com.sofka.domains.luthier;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.luthier.value.certificacion.CertificacionId;
import co.com.sofka.domains.luthier.value.certificacion.Especialidad;
import co.com.sofka.domains.luthier.value.certificacion.FechaEmision;


public class Certificacion extends Entity<CertificacionId> {
    
    private final Especialidad especialidad;
    private final FechaEmision fechaEmision;

    public Certificacion(CertificacionId entityId, Especialidad especialidad, FechaEmision fechaEmision) {
        super(entityId);
        this.especialidad = especialidad;
        this.fechaEmision = fechaEmision;
    }

    public Especialidad especialidad() {
        return especialidad;
    }

    public FechaEmision fechaEmision() {
        return fechaEmision;
    }

    public CertificacionId certificacionId() {
        return this.certificacionId();
    }
    
}
