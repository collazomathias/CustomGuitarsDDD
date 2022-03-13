package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class CantidadCuerdas implements ValueObject<Integer> {
    
    private final Integer value;

    public CantidadCuerdas(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

}
