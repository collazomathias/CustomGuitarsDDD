package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.Identity;

public class TipoId extends Identity {
    
    private TipoId(String tipoId){
        super(tipoId);
    }

    public TipoId(){}

    public static TipoId of(String tipoId) {
        return new TipoId(tipoId);
    }

}
