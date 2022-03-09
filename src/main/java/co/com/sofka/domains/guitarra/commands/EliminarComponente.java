package co.com.sofka.domains.guitarra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.guitarra.Componente;
import co.com.sofka.domains.guitarra.Guitarra;
import co.com.sofka.domains.guitarra.values.componente.ComponenteId;

import java.util.ArrayList;
import java.util.List;

public class EliminarComponente extends Command {
    public void eliminarComponente(Guitarra guitarra, ComponenteId componenteId) {
        //TODO: verificar que funcione y las validaciones
        List<Componente> nuevaListaComponentes = new ArrayList<>();
        for (Componente element : guitarra.componentes()) {
            if (element.componenteId() == componenteId) {
                continue;
            }
            nuevaListaComponentes.add(element);
        }

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
