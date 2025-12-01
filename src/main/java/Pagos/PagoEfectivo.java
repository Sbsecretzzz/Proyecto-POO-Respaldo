package Pagos;


import Ventas.Venta;

public class PagoEfectivo extends Pago {
 
   private String numeroTarjeta;
    private String tipoTarjeta; 

    public PagoEfectivo(String numeroTarjeta, String tipoTarjeta, String codigoPago, double monto, String metodo, Venta venta) {
        super(codigoPago, monto, metodo, venta);
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
    
}
