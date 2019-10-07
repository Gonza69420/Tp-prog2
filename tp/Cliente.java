package prog2.TP;

public class Cliente extends Usuario {
    private boolean estaBloqueado;

    public Cliente(int telefono) {
        super(telefono);
        this.estaBloqueado = false;
    }

    public void cambiarEstado() {
        if (this.estaBloqueado == true){
            this.estaBloqueado = false;
        } else {
            this.estaBloqueado = true;
        }
    }

    public void alquilarActivo(Activo activo){}//falta tiempo
}
