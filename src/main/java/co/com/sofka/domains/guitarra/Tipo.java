package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.values.CantidadCuerdas;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.guitarra.values.TipoCuerdas;
import co.com.sofka.domains.guitarra.values.TipoGuitarra;
import co.com.sofka.domains.guitarra.values.TipoId;

public class Tipo extends Entity<TipoId> {
    
    private final GuitarraId guitarraId;
    private final CantidadCuerdas cantidadCuerdas;
    private final TipoCuerdas tipoCuerdas;
    private final TipoGuitarra tipoGuitarra;

    public Tipo(TipoId tipoId, GuitarraId guitarraId, CantidadCuerdas cantidadCuerdas, TipoCuerdas tipoCuerdas, TipoGuitarra tipoGuitarra) {
        super(tipoId);
        this.guitarraId = guitarraId;
        this.cantidadCuerdas = cantidadCuerdas;
        this.tipoCuerdas = tipoCuerdas;
        this.tipoGuitarra = tipoGuitarra;
    }

    public CantidadCuerdas cantidadCuerdas() {
        return cantidadCuerdas;
    }

    public GuitarraId guitarraId() {
        return guitarraId;
    }

    public TipoCuerdas tipoCuerdas() {
        return tipoCuerdas;
    }

    public TipoGuitarra tipoGuitarra() {
        return tipoGuitarra;
    }
    
}
