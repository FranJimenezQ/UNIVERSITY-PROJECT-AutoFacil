
package proyecto_segundo_ordinario_autofacil;

/**
 *
 * @author Francisco
 */
public class Cotizacion extends DatosPersonales{
    
    private int NumeroCotizacion;
    private double PrimaPura;
    private double DescuentoAplicado;
    private double IVAaplicado;
    private double ComisionAplicada;
    private double SubTotalAplicado;
    private double TotalRecargos;
    private double TotalPagar;

    public Cotizacion(int Identificacion, String Nombre, int Edad, int anoVehiculo, int MontoVehiculo, boolean TipoVehiculo) {
        super(Identificacion, Nombre, Edad, anoVehiculo, MontoVehiculo, TipoVehiculo);
    }

    

    public int getNumeroCotizacion() {
        return NumeroCotizacion;
    }

    public void setNumeroCotizacion(int NumeroCotizacion) {
        this.NumeroCotizacion = NumeroCotizacion;
    }

    public double getPrimaPura() {
        return PrimaPura;
    }

    public void setPrimaPura(double PrimaPura) {
        this.PrimaPura = PrimaPura;
    }

    public double getDescuentoAplicado() {
        return DescuentoAplicado;
    }

    public void setDescuentoAplicado(double DescuentoAplicado) {
        this.DescuentoAplicado = DescuentoAplicado;
    }

    public double getIVAaplicado() {
        return IVAaplicado;
    }

    public void setIVAaplicado(double IVAaplicado) {
        this.IVAaplicado = IVAaplicado;
    }

    public double getComisionAplicada() {
        return ComisionAplicada;
    }

    public void setComisionAplicada(double ComisionAplicada) {
        this.ComisionAplicada = ComisionAplicada;
    }

    public double getSubTotalAplicado() {
        return SubTotalAplicado;
    }

    public void setSubTotalAplicado(float SubTotalAplicado) {
        this.SubTotalAplicado = SubTotalAplicado;
    }

    public double getTotalRecargos() {
        return TotalRecargos;
    }

    public void setTotalRecargos(double TotalRecargos) {
        this.TotalRecargos = TotalRecargos;
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(double TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "NumeroCotizacion=" + NumeroCotizacion + ", PrimaPura=" + PrimaPura + ", DescuentoAplicado=" + DescuentoAplicado + ", IVAaplicado=" + IVAaplicado + ", ComisionAplicada=" + ComisionAplicada + ", SubTotalAplicado=" + SubTotalAplicado + ", TotalRecargos=" + TotalRecargos + ", TotalPagar=" + TotalPagar + '}';
    }
    
    

   
    
    
}
