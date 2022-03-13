package co.com.sofka.domains.luthier.value;

import co.com.sofka.domain.generic.ValueObject;

public class NombreLuthier implements ValueObject<String> {
    
    private final String value;

    public NombreLuthier(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
