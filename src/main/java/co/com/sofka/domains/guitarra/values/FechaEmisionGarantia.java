package co.com.sofka.domains.guitarra.values;

import java.sql.Date;

import co.com.sofka.domain.generic.ValueObject;

public class FechaEmisionGarantia implements ValueObject<Date> {
    
    private final Date value;

    public FechaEmisionGarantia(Date value) {
        this.value = value;
    }

    @Override
    public Date value() {
        return value;
    }

}
