package co.com.sofka.domains.luthier.value;

import java.sql.Date;

import co.com.sofka.domain.generic.ValueObject;

public class FechaEmision implements ValueObject<Date> {
    
    private final Date value;

    public FechaEmision(Date value) {
        this.value = value;
    }

    @Override
    public Date value() {
        return value;
    }

}
