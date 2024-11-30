
package ejercicio2;

public class GestorTransferencias implements Transferir {
    private double monto;
    private String cuentaDestinataria;
    
    public GestorTransferencias(double monto, String cuentaDestinataria) {
        this.monto = monto;
        this.cuentaDestinataria = cuentaDestinataria;
    }
    
    @Override
    public void transferir() {
        System.out.println("Transfiriendo $" + monto + " a cuenta destinataria " + cuentaDestinataria);
    }
}
