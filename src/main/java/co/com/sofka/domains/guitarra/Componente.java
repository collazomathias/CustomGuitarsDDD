package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.values.ComponenteId;
import co.com.sofka.domains.guitarra.values.DescripcionComponente;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.NombreComponente;
import co.com.sofka.domains.guitarra.values.PrecioComponente;

public class Componente extends Entity<ComponenteId> {

    private final GuitarraId guitarraId;
    private final NombreComponente nombreComponente;
    private final DescripcionComponente descripcionComponente;
    private final PrecioComponente precioComponente;

    public Componente(ComponenteId componenteId, GuitarraId guitarraId, NombreComponente nombreComponente, DescripcionComponente descripcionComponente, PrecioComponente precioComponente) {
        super(componenteId);
        this.guitarraId = guitarraId;
        this.nombreComponente = nombreComponente;
        this.precioComponente = precioComponente;
        this.descripcionComponente = descripcionComponente;
    }

    public DescripcionComponente descripcionComponente() {
        return descripcionComponente;
    }

    public GuitarraId guitarraId() {
        return guitarraId;
    }

    public NombreComponente nombreComponente() {
        return nombreComponente;
    }

    public PrecioComponente precioComponente() {
        return precioComponente;
    }
    
}
