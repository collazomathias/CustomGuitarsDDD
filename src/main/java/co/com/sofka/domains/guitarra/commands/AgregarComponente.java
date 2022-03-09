package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Componente;
import co.com.sofka.domains.guitarra.Guitarra;

import java.util.List;

public class AgregarComponente extends Command {
    public void agregarComponente(Guitarra guitarra, Componente componente) {
        // TODO: hacer las verificaciones

        List<Componente> nuevaListaComponentes = guitarra.componentes();
        nuevaListaComponentes.add(componente);
        guitarra = new Guitarra(
                guitarra.guitarraId(),
                guitarra.afinado(),
                guitarra.estado(),
                guitarra.precio(),
                guitarra.luthierId(),
                guitarra.tipo(),
                guitarra.garantia(),
                nuevaListaComponentes
        );
    }
}
