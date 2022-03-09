package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.values.shared.Precio;

public class ActualizarPrecio extends Command {
    public void actualizarPrecio(Guitarra guitarra, Float precioComponente) {
        // TODO: hacer las verificaciones
        guitarra = new Guitarra(
                guitarra.guitarraId(),
                guitarra.afinado(),
                guitarra.estado(),
                new Precio(guitarra.precio().value + precioComponente),
                guitarra.luthierId(),
                guitarra.tipo(),
                guitarra.garantia(),
                guitarra.componentes()
        );
    }
}
