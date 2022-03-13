package co.com.sofka.domains.luthier.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.luthier.value.CertificacionId;
import co.com.sofka.domains.luthier.value.Especialidad;
import co.com.sofka.domains.luthier.value.FechaEmision;
import co.com.sofka.domains.luthier.value.LuthierId;

public class CertificacionAgregada extends DomainEvent {
    
    private final LuthierId luthierId;
    private final CertificacionId certificacionId;
    private final Especialidad especialidad;
    private final FechaEmision fechaEmision;

    public CertificacionAgregada(LuthierId luthierId, CertificacionId certificacionId, Especialidad especialidad, FechaEmision fechaEmision) {
        super("luthier.events.certificacionagregada");
        this.luthierId = luthierId;
        this.certificacionId = certificacionId;
        this.especialidad = especialidad;
        this.fechaEmision = fechaEmision;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public FechaEmision getFechaEmision() {
        return fechaEmision;
    }

    public LuthierId getLuthierId() {
        return luthierId;
    }

}
