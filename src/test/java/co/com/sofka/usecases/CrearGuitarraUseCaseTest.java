package co.com.sofka.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domains.guitarra.Garantia;
import co.com.sofka.domains.guitarra.Tipo;
import co.com.sofka.domains.guitarra.commands.CrearGuitarra;
import co.com.sofka.domains.guitarra.events.GuitarraCreada;
import co.com.sofka.domains.guitarra.values.*;
import co.com.sofka.domains.luthier.value.LuthierId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class CrearGuitarraUseCaseTest {
    @Test
    void crearGuitarra() {
        GuitarraId guitarraId = GuitarraId.of("XXXX1");
        LuthierId luthierId = LuthierId.of("XXXX2");
        Garantia garantia = new Garantia(
                GarantiaId.of("XXXX3"),
                GuitarraId.of("XXXX1"),
                new Vigencia(new Date(13032012)),
                new FechaEmisionGarantia(new Date(12022010))
        );
        Tipo tipo = new Tipo(
                TipoId.of("XXXX4"),
                GuitarraId.of("XXXX1"),
                new CantidadCuerdas(6),
                new TipoCuerdas("LONA"),
                new TipoGuitarra("ACUSTICA")
        );
        Estado estado = new Estado(false);
        Afinado afinado = new Afinado(false);

        CrearGuitarra crearGuitarra = new CrearGuitarra(guitarraId, luthierId, garantia, tipo, estado, afinado);

        CrearGuitarraUseCase useCase = new CrearGuitarraUseCase();
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(crearGuitarra))
                .orElseThrow()
                .getDomainEvents();

        var event = (GuitarraCreada) events.get(0);
        Assertions.assertEquals("guitarra.events.guitarracreada", event.type);
        Assertions.assertEquals("XXXX1", event.aggregateRootId());
        Assertions.assertEquals("XXXX2", event.getLuthierId().value());
        Assertions.assertEquals(false, event.getAfinado().value());
        Assertions.assertEquals(false, event.getEstado().value());
        Assertions.assertEquals("XXXX1", event.getGarantia().guitarraId().value());
        Assertions.assertEquals(new Date(12022010), event.getGarantia().fechaEmisionGarantia().value());
        Assertions.assertEquals(new Date(13032012), event.getGarantia().vigencia().value());
        Assertions.assertEquals("XXXX3", event.getGarantia().identity().value());
        Assertions.assertEquals("XXXX4", event.getTipo().identity().value());
        Assertions.assertEquals("XXXX1", event.getTipo().guitarraId().value());
        Assertions.assertEquals("LONA", event.getTipo().tipoCuerdas().value());
        Assertions.assertEquals("ACUSTICA", event.getTipo().tipoGuitarra().value());
        Assertions.assertEquals(6, event.getTipo().cantidadCuerdas().value());

    }
}