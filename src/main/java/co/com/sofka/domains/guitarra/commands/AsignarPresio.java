package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.values.shared.Precio;
import static co.com.sofka.domains.guitarra.values.shared.Constantes.PRECIO_BASE;

public class AsignarPresio extends Command {
    public void asignarPresio(Guitarra guitarra) {
        guitarra = new Guitarra(
                guitarra.guitarraId(),
                guitarra.afinado(),
                guitarra.estado(),
                new Precio(PRECIO_BASE),
                guitarra.luthierId(),
                guitarra.tipo(),
                guitarra.garantia(),
                guitarra.componentes()
        );
    }
}
