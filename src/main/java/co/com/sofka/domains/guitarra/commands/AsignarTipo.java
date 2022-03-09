package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.Tipo;

public class AsignarTipo extends Command {
    public void asignarTipo(Guitarra guitarra, Tipo tipo) {
        guitarra = new Guitarra(
                guitarra.guitarraId(),
                guitarra.afinado(),
                guitarra.estado(),
                guitarra.precio(),
                guitarra.luthierId(),
                tipo,
                guitarra.garantia(),
                guitarra.componentes()
        );
    }
}
