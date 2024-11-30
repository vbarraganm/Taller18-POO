
package ejercicio2;

public class GestorRetiros implements Retirar {
    private double monto;
    
    public GestorRetiros(double monto) {
        this.monto = monto;
    }
    
    @Override
    public void retirar() {
        System.out.println("Retirando $" + monto + " de la cuenta");
    }
}
