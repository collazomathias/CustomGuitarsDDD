package co.com.sofka.domains.guitarra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.guitarra.value.guitarra.Afinado;
import co.com.sofka.domains.guitarra.value.guitarra.Estado;
import co.com.sofka.domains.guitarra.value.guitarra.GuitarraId;
import co.com.sofka.domains.guitarra.value.guitarra.LuthierId;

public class Guitarra extends Entity<GuitarraId> {

    private Afinado afinado;
    private Estado estado;
    private LuthierId luthierId;

    public Guitarra(GuitarraId entityId) {
        super(entityId);
        //TODO Auto-generated constructor stub
    }

    public Afinado afinado() {
        return afinado;
    }

    public Estado estado() {
        return estado;
    }

    public LuthierId luthierId() {
        return luthierId;
    }

    public void actualizarEstado(){
        if(this.estado.value() == true){
            this.estado = new Estado(false);
        } else {
            this.estado = new Estado(true);
        }
    }

    public void actualizarAfinado(){
        if(this.afinado.value() == true){
            this.afinado = new Afinado(false);
        } else {
            this.afinado = new Afinado(true);
        }
    }
    
}
