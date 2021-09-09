
package proyecto_segundo_ordinario_autofacil;

/**
 *
 * @author Francisco Jimenez
 */
public class VehiculoNuevo extends Cotizacion{
    private Boolean GarantiaExtendida;
    private Boolean VehiculoElectrico;
    public double TarifaNuevo = 0.0099;

    public VehiculoNuevo(int Identificacion, String Nombre, int Edad, int anoVehiculo, int MontoVehiculo, boolean TipoVehiculo) {
        super(Identificacion, Nombre, Edad, anoVehiculo, MontoVehiculo, TipoVehiculo);
    }
    
}
