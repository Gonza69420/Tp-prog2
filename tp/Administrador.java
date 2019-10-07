package prog2.TP;

import java.util.ArrayList;

public class Administrador extends Usuario{
    ArrayList<Activo> activos;

    public Administrador(int telefono) {
        super(telefono);
    }

    public void matar/*bloquear*/(Cliente cliente){
        cliente.cambiarEstado();
    }
    public void revivir/*desbloquear*/(Cliente cliente){
        cliente.cambiarEstado();
    }

    public void MultarUsuario(Usuario usuario){
        usuario.cambiarEstado();
    }

    public void comprarActivos(Activo activo, int cantidad){ //falta que retorne el codigo incremental
        for (int i = 0; i < cantidad; i++){
            activos.add(activo);
        }
    }


}
