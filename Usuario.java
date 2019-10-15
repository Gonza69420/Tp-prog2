package prog2.TP;

public abstract class Usuario {
    private final int telefono;
    private Puntos puntos;
    private boolean estaBloqueado;

    public Usuario(int telefono) {
        this.telefono = telefono;
        this.estaBloqueado = false;
    }

    public static void bloquearUsuario(Usuario usuario){
        usuario.estaBloqueado = true;
    }

    public static void desbloquearUsuario(Usuario usuario){
        usuario.estaBloqueado = false;
    }

}
