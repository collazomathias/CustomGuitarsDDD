package co.com.sofka.domains.guitarra.values.shared;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Float> {
    public final Float value;

    public Precio(Float value) {
        this.value = value;
    }

    @Override
    public Float value() {
        return this.value;
    }
}
