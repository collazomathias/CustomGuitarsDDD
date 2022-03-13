package co.com.sofka.domains.luthier;

import java.util.ArrayList;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.luthier.events.CertificacionAgregada;
import co.com.sofka.domains.luthier.events.GuitarraAgregada;
import co.com.sofka.domains.luthier.events.LuthierCreado;
import co.com.sofka.domains.luthier.events.NombreModificado;

public class LuthierEventChange extends EventChange {

    public LuthierEventChange(Luthier luthier){
        
        apply((LuthierCreado event) -> {
            if(event.getNombreLuthier() == null ||
            event.getNombreLuthier().value().isBlank()){
                throw new IllegalArgumentException("El nombre del luthier no puede ser nulo.");
            }
            luthier.guitarras = new ArrayList<GuitarraId>();
            luthier.certificaciones = new ArrayList<Certificacion>();
            luthier.nombreLuthier = event.getNombreLuthier();
        });

        apply((NombreModificado event) -> {
            if(event.getNombreLuthier() == null ||
            event.getNombreLuthier().value().isBlank()){
                throw new IllegalArgumentException("El nombre del luthier no puede ser nulo.");
            }
            luthier.nombreLuthier = event.getNombreLuthier();
        });

        apply((CertificacionAgregada event) -> {
            if(event.getEspecialidad() == null) {
                throw new IllegalArgumentException("La especialidad no puede ser nula.");
            } else if(event.getFechaEmision() == null) {
                throw new IllegalArgumentException("La fecha no puede ser nula.");
            } else if(event.getLuthierId() == null ||
            event.getLuthierId().value().isBlank()) {
                throw new IllegalArgumentException("El LuthierID del luthier no puede ser nulo.");
            }
            luthier.certificaciones.add(new Certificacion(event.getCertificacionId(), event.getLuthierId(), event.getEspecialidad(), event.getFechaEmision()));
        });

        apply((GuitarraAgregada event) -> {
            if(event.getGuitarraId() == null ||
            event.getGuitarraId().value().isBlank()) {
                throw new IllegalArgumentException("El GuitarraID no puede ser nulo.");
            }
            luthier.guitarras.add(GuitarraId.of(event.getGuitarraId().value()));
        });

    }
    
}
