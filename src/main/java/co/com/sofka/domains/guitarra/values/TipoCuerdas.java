package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoCuerdas implements ValueObject<String> {
    
    private final String value;

    public TipoCuerdas(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
