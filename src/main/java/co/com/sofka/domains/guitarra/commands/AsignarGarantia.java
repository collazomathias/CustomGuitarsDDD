package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Garantia;
import co.com.sofka.domains.guitarra.Guitarra;

public class AsignarGarantia extends Command {
    public void asignarGarantia(Guitarra guitarra, Garantia garantia){
        //TODO: Validarlo despues
        guitarra = new Guitarra(
                guitarra.guitarraId(),
                guitarra.afinado(),
                guitarra.estado(),
                guitarra.precio(),
                guitarra.luthierId(),
                guitarra.tipo(),
                garantia,
                guitarra.componentes());
    }
}
