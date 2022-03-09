package co.com.sofka.domains.luthier.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.luthier.Luthier;
import co.com.sofka.domains.luthier.value.luthier.NombreLuthier;

public class ActualizarNombre extends Command {
    public void actualizarNombre(Luthier luthier, NombreLuthier nombre){
        luthier = new Luthier(
            luthier.luthierId(),
            nombre,
            luthier.certificaciones()
        );
    }
}
