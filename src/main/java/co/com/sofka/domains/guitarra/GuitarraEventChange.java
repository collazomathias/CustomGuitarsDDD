package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domains.guitarra.events.ComponenteAgregado;
import co.com.sofka.domains.guitarra.events.ComponenteQuitado;
import co.com.sofka.domains.guitarra.events.EstadoModificado;
import co.com.sofka.domains.guitarra.events.GarantiaModificada;
import co.com.sofka.domains.guitarra.events.GuitarraAfinada;
import co.com.sofka.domains.guitarra.events.GuitarraArmada;
import co.com.sofka.domains.guitarra.events.GuitarraCreada;
import co.com.sofka.domains.guitarra.events.PrecioModificado;
import co.com.sofka.domains.guitarra.events.TipoModificado;

public class GuitarraEventChange extends EventChange {

    public GuitarraEventChange(Guitarra guitarra) {

        apply((GuitarraCreada event) -> {
            if (event.getAfinado() == null) {
                throw new IllegalArgumentException("El afinado no puede ser nulo.");
            } else if (event.getEstado() == null) {
                throw new IllegalArgumentException("El estado no puede ser nulo.");
            } else if (event.getGarantia() == null) {
                throw new IllegalArgumentException("La garantia no puede ser nula.");
            } else if (event.getTipo() == null) {
                throw new IllegalArgumentException("El tipo no puede ser nulo.");
            } else if (event.getLuthierId() == null ||
                    event.getLuthierId().value().isBlank()) {
                throw new IllegalArgumentException("El LuthierID no puede ser nulo.");
            }
            guitarra.afinado = event.getAfinado();
            guitarra.estado = event.getEstado();
            guitarra.garantia = event.getGarantia();
            guitarra.tipo = event.getTipo();
            guitarra.luthierId = event.getLuthierId();
        });

        apply((ComponenteAgregado event) -> {
            if(event.getDescripcionComponente() == null) {
                throw new IllegalArgumentException("La descripcion del componente no puede ser nula.");
            } else if(event.getGuitarraId() == null) {
                throw new IllegalArgumentException("La GuitarraID no puede ser nula.");
            } else if(event.getNombreComponente() == null) {
                throw new IllegalArgumentException("El nombre del componente no puede ser nulo.");
            } else if(event.getPrecioComponente() == null) {
                throw new IllegalArgumentException("El precio del componente no puede ser nulo.");
            }
            guitarra.componentes.add(new Componente(event.getComponenteId(), event.getGuitarraId(),
                    event.getNombreComponente(), event.getDescripcionComponente(), event.getPrecioComponente()));
        });

        apply((ComponenteQuitado event) -> {
            guitarra.componentes.removeIf(componente -> componente.identity().equals(event.getComponenteId()));
        });

        apply((EstadoModificado event) -> {
            if(event.getEstado() == null) {
                throw new IllegalArgumentException("El estado no puede ser nulo.");
            }
            guitarra.estado = event.getEstado();
        });

        apply((GarantiaModificada event) -> {
            if(event.getGarantia() == null) {
                throw new IllegalArgumentException("La garantía no puede ser nula.");
            }
            guitarra.garantia = event.getGarantia();
        });

        apply((GuitarraAfinada event) -> {
            if(event.getAfinado() == null) {
                throw new IllegalArgumentException("El afinado no puede ser nulo.");
            }
            guitarra.afinado = event.getAfinado();
        });

        apply((GuitarraArmada event) -> {
            if(event.getEstado() == null) {
                throw new IllegalArgumentException("El estado no puede ser nulo.");
            }
            guitarra.estado = event.getEstado();
        });

        apply((PrecioModificado event) -> {
            if(event.getPrecioGuitarra() == null) {
                throw new IllegalArgumentException("El precio no puede ser nulo.");
            }
            guitarra.precioGuitarra = event.getPrecioGuitarra();
        });

        apply((TipoModificado event) -> {
            if(event.getTipo() == null) {
                throw new IllegalArgumentException("El tipo no puede ser nulo.");
            }
            guitarra.tipo = event.getTipo();
        });

    }

}
