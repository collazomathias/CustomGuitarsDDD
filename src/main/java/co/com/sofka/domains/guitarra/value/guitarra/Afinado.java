package co.com.sofka.domains.guitarra.value.guitarra;

import co.com.sofka.domain.generic.ValueObject;

public class Afinado implements ValueObject<Boolean> {
    private final Boolean value;

    public Afinado(){
        this.value = false;
    }
    
    public Afinado(Boolean afinado){
        this.value = afinado;
    }

    @Override
    public Boolean value(){
        return this.value;
    }
}
