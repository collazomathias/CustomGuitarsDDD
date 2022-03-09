package co.com.sofka.domains.guitarra.values.componente;

import co.com.sofka.domain.generic.Identity;

public class ComponenteId extends Identity {
    private ComponenteId(String id) {
        super(id);
    }

    public ComponenteId() {
    }

    public static ComponenteId of(String id) {
        return new ComponenteId(id);
    }

}
