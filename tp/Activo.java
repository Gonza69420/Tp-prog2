package prog2.TP;

public abstract class Activo {
    private final int costo;
    private final Location localizacion;
    private boolean estaAlquilado;

    public Activo(int costo, Location localizacion){
        this.costo = costo;
        this.localizacion = localizacion;
        this.estaAlquilado = false;
    }

    public int tarifarioPorMinuto(int minutos){
        return costo*minutos + localizacion.valorZona*minutos;
    }

    public int puntosOtorgar(int minutos){
        return costo*minutos;
    }
}
