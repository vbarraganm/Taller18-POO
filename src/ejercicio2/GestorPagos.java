
package ejercicio2;

public class GestorPagos implements PagarFactura {
    private String factura;
    private double monto;
    
    public GestorPagos(String factura, double monto) {
        this.factura = factura;
        this.monto = monto;
    }
    
    @Override
    public void pagarFactura() {
        System.out.println("Pago de factura " + factura + " por total de: $" + monto);
    }
}
