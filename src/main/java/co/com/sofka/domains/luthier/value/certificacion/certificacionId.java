package co.com.sofka.domains.luthier.value.certificacion;

import co.com.sofka.domain.generic.Identity;

public class CertificacionId extends Identity {
    private CertificacionId(String id) {
        super(id);
    }

    public CertificacionId() {
    }

    public static CertificacionId of(String id) {
        return new CertificacionId(id);
    }
}
