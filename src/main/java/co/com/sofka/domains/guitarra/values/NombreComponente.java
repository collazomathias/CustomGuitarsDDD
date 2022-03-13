package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreComponente implements ValueObject<String> {
    
    private final String value;

    public NombreComponente(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
