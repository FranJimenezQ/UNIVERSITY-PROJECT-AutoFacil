
package proyecto_segundo_ordinario_autofacil;

/**
 *
 * @author Francisco Jimenez
 */
public class VehiculoUsado extends Cotizacion {
    private int Kilometraje;
    private String EstadoVehiculo;
    private boolean AsistenciaViaje;
    public double TarifaUsado = 0.0089;

    public VehiculoUsado(int Identificacion, String Nombre, int Edad, int anoVehiculo, int MontoVehiculo, boolean TipoVehiculo) {
        super(Identificacion, Nombre, Edad, anoVehiculo, MontoVehiculo, TipoVehiculo);
    }

    
    
    
}
