package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Boolean> {
    
    private final Boolean value;

    public Estado(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean value() {
        return value;
    }

}
