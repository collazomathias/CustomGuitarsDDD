package co.com.sofka.domains.luthier.value;

import co.com.sofka.domain.generic.ValueObject;

public class Especialidad implements ValueObject<String> {
    
    private final String value;

    public Especialidad(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
