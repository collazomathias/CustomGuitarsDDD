package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.values.guitarra.Afinado;

public class ActualizarAfinado extends Command {
    public void actualizarAfinado(Guitarra guitarra) {
        guitarra = new Guitarra(
                guitarra.guitarraId(),
                (guitarra.afinado().value()) ? new Afinado(false) : new Afinado(true),
                guitarra.estado(),
                guitarra.precio(),
                guitarra.luthierId(),
                guitarra.tipo(),
                guitarra.garantia(),
                guitarra.componentes()
        );
    }
}
