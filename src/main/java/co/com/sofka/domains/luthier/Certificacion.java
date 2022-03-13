package co.com.sofka.domains.luthier;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.luthier.value.CertificacionId;
import co.com.sofka.domains.luthier.value.Especialidad;
import co.com.sofka.domains.luthier.value.FechaEmision;
import co.com.sofka.domains.luthier.value.LuthierId;

public class Certificacion extends Entity<CertificacionId> {

    private final LuthierId luthierId;
    private final Especialidad especialidad;
    private final FechaEmision fechaEmision;

    public Certificacion(CertificacionId certificacionId, LuthierId luthierId, Especialidad especialidad, FechaEmision fechaEmision) {
        super(certificacionId);
        this.luthierId = luthierId;
        this.especialidad = especialidad;
        this.fechaEmision = fechaEmision;
    }

    public Especialidad especialidad() {
        return especialidad;
    }

    public FechaEmision fechaEmision() {
        return fechaEmision;
    }

    public LuthierId luthierId() {
        return luthierId;
    }
    
}
