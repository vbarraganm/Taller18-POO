
package ejercicio3;

public class Principal {

    public static void main(String[] args) {
        Conducir automovil = new Automovil();
        CargarMercancia camion = new CamionDeCarga();
        
        automovil.conducir();
        camion.cargarMercancia();
    }
}
