package co.com.sofka.domains.guitarra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.guitarra.Garantia;
import co.com.sofka.domains.guitarra.Tipo;
import co.com.sofka.domains.guitarra.values.Afinado;
import co.com.sofka.domains.guitarra.values.Estado;
import co.com.sofka.domains.luthier.value.LuthierId;

public class GuitarraCreada extends DomainEvent {
    
    private final Garantia garantia;
    private final LuthierId luthierId;
    private final Tipo tipo;
    private final Estado estado;
    private final Afinado afinado;

    public GuitarraCreada(Garantia garantia, LuthierId luthierId, Tipo tipo, Estado estado, Afinado afinado) {
        super("guitarra.events.guitarracreada");
        this.garantia = garantia;
        this.luthierId = luthierId;
        this.tipo = tipo;
        this.estado = estado;
        this.afinado = afinado;
    }

    public Afinado getAfinado() {
        return afinado;
    }

    public LuthierId getLuthierId() {
        return luthierId;
    }

    public Estado getEstado() {
        return estado;
    }

    public Garantia getGarantia() {
        return garantia;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
