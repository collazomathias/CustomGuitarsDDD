package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.Identity;

public class GarantiaId extends Identity {
    
    private GarantiaId(String garantiaId){
        super(garantiaId);
    }

    public GarantiaId(){}

    public static GarantiaId of(String garantiaId) {
        return new GarantiaId(garantiaId);
    }

}
