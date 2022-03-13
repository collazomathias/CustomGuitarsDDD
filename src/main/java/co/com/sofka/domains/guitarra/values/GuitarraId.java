package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.Identity;

public class GuitarraId extends Identity {
    
    public GuitarraId(){}

    private GuitarraId(String value) {
        super(value);
    }

    public static GuitarraId of(String value) {
        return new GuitarraId(value);
    }

}
