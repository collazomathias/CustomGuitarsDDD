package co.com.sofka.domains.guitarra.values;

import java.sql.Date;

import co.com.sofka.domain.generic.ValueObject;

public class Vigencia implements ValueObject<Date> {
    
    private final Date value;

    public Vigencia(Date value) {
        this.value = value;
    }

    @Override
    public Date value() {
        return value;
    }

}
