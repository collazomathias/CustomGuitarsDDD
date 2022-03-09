package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.values.guitarra.Estado;

public class ActualizarEstado extends Command {
    public void actualizarEstado(Guitarra guitarra) {
        guitarra = new Guitarra(
                guitarra.guitarraId(),
                guitarra.afinado(),
                (guitarra.estado().value()) ? new Estado(false) : new Estado(true),
                guitarra.precio(),
                guitarra.luthierId(),
                guitarra.tipo(),
                guitarra.garantia(),
                guitarra.componentes()
        );
    }
}
