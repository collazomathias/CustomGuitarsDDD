package co.com.sofka.domains.luthier.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.values.GuitarraId;
import co.com.sofka.domains.luthier.value.LuthierId;

public class AgregarGuitarra extends Command {
    
    private final LuthierId luthierId;
    private final GuitarraId guitarraId;

    public AgregarGuitarra(LuthierId luthierId, GuitarraId guitarraId) {
        this.luthierId = luthierId;
        this.guitarraId = guitarraId;
    }

    public GuitarraId getGuitarraId() {
        return guitarraId;
    }

    public LuthierId getLuthierId() {
        return luthierId;
    }

}
