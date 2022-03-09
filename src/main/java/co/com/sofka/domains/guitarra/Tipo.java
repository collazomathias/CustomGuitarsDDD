package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.values.tipo.CantidadCuerdas;
import co.com.sofka.domains.guitarra.values.tipo.TipoCuerdas;
import co.com.sofka.domains.guitarra.values.tipo.TipoGuitarra;
import co.com.sofka.domains.guitarra.values.tipo.TipoId;

public class Tipo extends Entity<TipoId> {

    private final CantidadCuerdas cantidadCuerdas;
    private final TipoCuerdas tipoCuerdas;
    private final TipoGuitarra tipoGuitarra;

    public Tipo(TipoId entityId, CantidadCuerdas cantidadCuerdas, TipoCuerdas tipoCuerdas, TipoGuitarra tipoGuitarra) {
        super(entityId);
        this.cantidadCuerdas = cantidadCuerdas;
        this.tipoCuerdas = tipoCuerdas;
        this.tipoGuitarra = tipoGuitarra;
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
