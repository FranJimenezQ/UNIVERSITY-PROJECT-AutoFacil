
package proyecto_segundo_ordinario_autofacil;

/**
 *
 * @author Francisco Jimenez
 */
public class DatosPersonales  {
    private int Identificacion;
    private String Nombre;
    private int Edad;
    private int anoVehiculo;
    private int MontoVehiculo;
    private boolean TipoVehiculo;


    public DatosPersonales(int Identificacion, String Nombre, int Edad, int anoVehiculo, int MontoVehiculo, boolean TipoVehiculo) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.anoVehiculo = anoVehiculo;
        this.MontoVehiculo = MontoVehiculo;
        this.TipoVehiculo = TipoVehiculo;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAnoVehiculo() {
        return anoVehiculo;
    }

    public void setAnoVehiculo(int anoVehiculo) {
        this.anoVehiculo = anoVehiculo;
    }

    public int getMontoVehiculo() {
        return MontoVehiculo;
    }

    public void setMontoVehiculo(int MontoVehiculo) {
        this.MontoVehiculo = MontoVehiculo;
    }

    public boolean isTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(boolean TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    @Override
    public String toString() {
        return "DatosPersonales{" + "Identificacion=" + Identificacion + ", Nombre=" + Nombre + ", Edad=" + Edad + ", anoVehiculo=" + anoVehiculo + ", MontoVehiculo=" + MontoVehiculo + ", TipoVehiculo=" + TipoVehiculo + '}';
    }
    

    
    
    
}
