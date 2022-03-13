package co.com.sofka.usecases;

import co.com.sofka.domains.luthier.value.LuthierId;

public interface SMSService {
    boolean enviarMensajeLuthier(LuthierId luthierId, String mensaje);

}
