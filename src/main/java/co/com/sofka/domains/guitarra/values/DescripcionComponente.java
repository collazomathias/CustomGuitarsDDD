package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class DescripcionComponente implements ValueObject<String> {
    
    private final String value;

    public DescripcionComponente(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
