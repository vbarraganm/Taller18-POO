
package ejercicio2;

public class Principal {

    public static void main(String[] args) {
        Transferir transferencia = new GestorTransferencias(200000, "91220629916");
        Retirar retiro = new GestorRetiros(100000);
        PagarFactura pagoDeFactura = new GestorPagos("A9394", 56000);
        
        transferencia.transferir();
        retiro.retirar();
        pagoDeFactura.pagarFactura();
    }
}
