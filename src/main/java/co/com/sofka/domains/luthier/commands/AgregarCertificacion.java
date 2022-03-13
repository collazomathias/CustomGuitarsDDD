package co.com.sofka.domains.luthier.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.luthier.value.CertificacionId;
import co.com.sofka.domains.luthier.value.Especialidad;
import co.com.sofka.domains.luthier.value.FechaEmision;
import co.com.sofka.domains.luthier.value.LuthierId;

public class AgregarCertificacion extends Command {
    
    private final LuthierId luthierId;
    private final CertificacionId certificacionId;
    private final Especialidad especialidad;
    private final FechaEmision fechaEmision;

    public AgregarCertificacion(LuthierId luthierId, CertificacionId certificacionId, Especialidad especialidad, FechaEmision fechaEmision) {
        this.certificacionId = certificacionId;
        this.luthierId = luthierId;
        this.especialidad = especialidad;
        this.fechaEmision = fechaEmision;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public FechaEmision getFechaEmision() {
        return fechaEmision;
    }

    public LuthierId getLuthierId() {
        return luthierId;
    }

}
