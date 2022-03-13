package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.values.FechaEmisionGarantia;
import co.com.sofka.domains.guitarra.values.GarantiaId;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.Vigencia;

public class Garantia extends Entity<GarantiaId> {
    
    private final GuitarraId guitarraId;
    private final Vigencia vigencia;
    private final FechaEmisionGarantia fechaEmisionGarantia;

    public Garantia(GarantiaId garantiaId, GuitarraId guitarraId, Vigencia vigencia, FechaEmisionGarantia fechaEmisionGarantia) {
        super(garantiaId);
        this.guitarraId = guitarraId;
        this.vigencia = vigencia;
        this.fechaEmisionGarantia = fechaEmisionGarantia;
    }

    public FechaEmisionGarantia fechaEmisionGarantia() {
        return fechaEmisionGarantia;
    }

    public GuitarraId guitarraId() {
        return guitarraId;
    }

    public Vigencia vigencia() {
        return vigencia;
    }

}
