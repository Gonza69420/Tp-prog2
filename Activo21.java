package TrabajoPractico;

public abstract class Activo {
    private final int costoPorMinuto;
    private final int puntosPorMinuto;
    private final Zona zona;
    private boolean estaAlquilado;
    private final Zona ubicacion;
    private final int costoDeMulta;

    public Activo(int costoPorMinuto, int puntosPorMinuto, Zona zona, Zona ubicacion,int costoDeMulta){
        this.costoPorMinuto = costoPorMinuto;
        this.zona = zona;
        this.estaAlquilado = false;
        this.puntosPorMinuto = puntosPorMinuto;
        this.ubicacion = ubicacion;
        this.costoDeMulta= costoDeMulta;
    }

    public int tarifarioPorMinuto(int minutos){
        return costoPorMinuto*minutos + zona.valorZona*minutos;
    }

    public int puntosOtorgar(int minutos){
        return puntosPorMinuto*minutos;
    }

    public static void calucularDescuento(){

    }

    public boolean estaMultado(Zona zona, Zona ubicacion){
        if(zona!=ubicacion){

            return true;
        }else{ return false; }
    }

    public boolean isEstaAlquilado (boolean estaAlquilado){
        return estaAlquilado;
    }


}
