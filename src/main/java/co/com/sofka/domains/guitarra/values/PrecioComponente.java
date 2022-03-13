package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class PrecioComponente implements ValueObject<Float> {
    
    private final Float value;

    public PrecioComponente(Float value) {
        this.value = value;
    }

    @Override
    public Float value() {
        return value;
    }

}
