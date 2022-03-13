package co.com.sofka.domains.guitarra.values;

import co.com.sofka.domain.generic.Identity;

public class ComponenteId extends Identity {
    
    private ComponenteId(String componenteId){
        super(componenteId);
    }

    public ComponenteId(){}

    public static ComponenteId of(String componenteId) {
        return new ComponenteId(componenteId);
    }

}
