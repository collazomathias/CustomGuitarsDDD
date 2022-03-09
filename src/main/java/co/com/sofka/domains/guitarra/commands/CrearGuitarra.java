package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.values.guitarra.GuitarraId;
import co.com.sofka.domains.guitarra.values.guitarra.LuthierId;

//Comando para crear una guitarra
public class CrearGuitarra extends Command {
    private final GuitarraId guitarraId;
    private final LuthierId luthierId;

    public CrearGuitarra(GuitarraId guitarraId, LuthierId luthierId) {
        this.guitarraId = guitarraId;
        this.luthierId = luthierId;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public LuthierId getLuthierId() {
        return luthierId;
    }
}
