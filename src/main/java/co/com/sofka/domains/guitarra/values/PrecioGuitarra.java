package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class PrecioGuitarra implements ValueObject<Float> {
    
    private final Float value;

    public PrecioGuitarra(Float value) {
        this.value = value;
    }

    @Override
    public Float value() {
        return value;
    }

}
