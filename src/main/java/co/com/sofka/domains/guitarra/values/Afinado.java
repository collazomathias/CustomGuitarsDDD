package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class Afinado implements ValueObject<Boolean> {
    
    private final Boolean value;

    public Afinado(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean value() {
        return value;
    }

}
