package co.com.sofka.domains.luthier.commands;

import java.util.List;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.luthier.Certificacion;
import co.com.sofka.domains.luthier.Luthier;

public class AgregarCertificacion extends Command {
    public void agregarCertificacion(Luthier luthier, Certificacion certificacion){
        List<Certificacion> nuevaListaCertificaciones = luthier.certificaciones();
        nuevaListaCertificaciones.add(certificacion);
        luthier = new Luthier(
            luthier.luthierId(), 
            luthier.nombre(), 
            nuevaListaCertificaciones
        );
    }
}
