package TrabajoPractico;

public class Pickupydejado extends Activo{
    private boolean estaAlquilado;

    public Pickupydejado(int costoPorMinuto, int puntosPorMinuto, Zona zona, Zona ubicacion, int costoDeMulta) {
        super(costoPorMinuto, puntosPorMinuto, zona, ubicacion, costoDeMulta);
    }

    public boolean Pickup (Location location) throws Exception {
        if (estaAlquilado == true) {
            throw new Exception("ESTA ALQUILADO");
        } else {
            return true;
        }
    }
    public boolean dejado (Location location){
        return false;
    }

}
