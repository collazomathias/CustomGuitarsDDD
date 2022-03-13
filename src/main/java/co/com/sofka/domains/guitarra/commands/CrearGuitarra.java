package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Garantia;
import co.com.sofka.domains.guitarra.Tipo;
import co.com.sofka.domains.guitarra.values.Afinado;
import co.com.sofka.domains.guitarra.values.Estado;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.luthier.value.LuthierId;

public class CrearGuitarra extends Command {
    
    private final GuitarraId guitarraId;
    private final LuthierId luthierId;
    private final Garantia garantia;
    private final Tipo tipo;
    private final Estado estado;
    private final Afinado afinado;

    public CrearGuitarra(GuitarraId guitarraId, LuthierId luthierId, Garantia garantia, Tipo tipo, Estado estado, Afinado afinado) {
        this.garantia = garantia;
        this.luthierId = luthierId;
        this.afinado = afinado;
        this.guitarraId = guitarraId;
        this.estado = estado;
        this.tipo = tipo;
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

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
