package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.values.garantia.FechaEmision;
import co.com.sofka.domains.guitarra.values.garantia.GarantiaId;
import co.com.sofka.domains.guitarra.values.garantia.Vigencia;

public class Garantia extends Entity<GarantiaId> {

    private final FechaEmision fechaEmision;
    private final Vigencia vigencia;

    public Garantia(GarantiaId entityId, FechaEmision fechaEmision, Vigencia vigencia) {
        super(entityId);
        this.fechaEmision = fechaEmision;
        this.vigencia = vigencia;
    }

    public FechaEmision fechaEmision() {
        return fechaEmision;
    }

    public Vigencia vigencia() {
        return vigencia;
    }
    
}
