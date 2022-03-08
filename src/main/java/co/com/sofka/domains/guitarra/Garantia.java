package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.value.garantia.FechaEmision;
import co.com.sofka.domains.guitarra.value.garantia.GarantiaId;
import co.com.sofka.domains.guitarra.value.garantia.Vigencia;

public class Garantia extends Entity<GarantiaId> {

    private FechaEmision fechaEmision;
    private Vigencia vigencia;

    public Garantia(GarantiaId entityId) {
        super(entityId);
        //TODO Auto-generated constructor stub
    }

    public FechaEmision fechaEmision() {
        return fechaEmision;
    }

    public Vigencia vigencia() {
        return vigencia;
    }
    
}
