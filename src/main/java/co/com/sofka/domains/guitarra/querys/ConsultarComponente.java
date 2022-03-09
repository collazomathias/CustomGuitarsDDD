package co.com.sofka.domains.guitarra.querys;

import co.com.sofka.domain.generic.Query;
import co.com.sofka.domains.guitarra.Componente;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.values.componente.ComponenteId;

import java.util.Iterator;

public class ConsultarComponente implements Query {
    public Componente consultarComponente(Guitarra guitarra, ComponenteId componenteId) {
        //TODO: comprobar que funcione y hacer las verificaciones
        for (Componente element : guitarra.componentes()) {
            if (element.componenteId() == componenteId) {
                return element;
            }
        }
        return null;
    }
}
