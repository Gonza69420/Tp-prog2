package prog2.TP;

public abstract class Usuario {
    final private int telefono;
    private int puntos;

    public Usuario(int telefono) {
        this.telefono = telefono;
    }

    public Cliente registrarCliente(int telefono){
        Cliente clienteNuevo = new Cliente(telefono);
        return clienteNuevo;
    }

    public void cambiarEstado(){}
}
