package co.com.sofka.domains.guitarra.value.guitarra;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Boolean> {
    
    private final Boolean value;

    public Estado(){
        this.value = false;
    }
    
    public Estado(Boolean estado){
        this.value = estado;
    }

    @Override
    public Boolean value(){
        return this.value;
    }

}
