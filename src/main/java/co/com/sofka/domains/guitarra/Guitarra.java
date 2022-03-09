package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.guitarra.values.guitarra.Afinado;
import co.com.sofka.domains.guitarra.values.guitarra.Estado;
import co.com.sofka.domains.guitarra.values.guitarra.GuitarraId;
import co.com.sofka.domains.guitarra.values.guitarra.LuthierId;
import co.com.sofka.domains.guitarra.values.shared.Precio;

import java.util.List;

public class Guitarra extends AggregateEvent<GuitarraId> {

    private Afinado afinado;
    private Estado estado;
    private Precio precio;
    private LuthierId luthierId;
    private Tipo tipo;
    private Garantia garantia;
    private List<Componente> componentes;

    public Guitarra(GuitarraId entityId, Afinado afinado, Estado estado, Precio precio, LuthierId luthierId,
                    Tipo tipo, Garantia garantia, List<Componente> componentes) {
        super(entityId);

        this.afinado = afinado;
        this.estado = estado;
        this.precio = precio;
        this.luthierId = luthierId;
        this.tipo = tipo;
        this.garantia = garantia;
        this.componentes = componentes;
    }

    public Afinado afinado() {
        return afinado;
    }

    public Estado estado() {
        return estado;
    }

    public LuthierId luthierId() {
        return luthierId;
    }

    public Precio precio() {
        return precio;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Garantia garantia() {
        return garantia;
    }

    public GuitarraId guitarraId() {
        return guitarraId();
    }

    //Lista de componentes?
    public List<Componente> componentes() {
        return componentes;
    }
}
