package co.com.sofka.domains.luthier.value;

import co.com.sofka.domain.generic.Identity;

public class LuthierId extends Identity {
    
    public LuthierId(){}

    private LuthierId(String value) {
        super(value);
    }

    public static LuthierId of(String value) {
        return new LuthierId(value);
    }

}
