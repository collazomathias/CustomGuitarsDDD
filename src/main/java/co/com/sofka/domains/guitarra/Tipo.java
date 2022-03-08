package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.value.tipo.CantidadCuerdas;
import co.com.sofka.domains.guitarra.value.tipo.TipoCuerdas;
import co.com.sofka.domains.guitarra.value.tipo.TipoGuitarra;
import co.com.sofka.domains.guitarra.value.tipo.TipoId;

public class Tipo extends Entity<TipoId> {

    private CantidadCuerdas cantidadCuerdas;
    private TipoCuerdas tipoCuerdas;
    private TipoGuitarra tipoGuitarra;

    public Tipo(TipoId entityId) {
        super(entityId);
    }

    public CantidadCuerdas cantidadCuerdas() {
        return cantidadCuerdas;
    }

    public TipoCuerdas tipoCuerdas() {
        return tipoCuerdas;
    }

    public TipoGuitarra tipoGuitarra() {
        return tipoGuitarra;
    }
    
}
