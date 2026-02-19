package Tema2_Clases_Y_Objetos;

public class MainPanaderia {

    public static void main(String[] args) {

        // Crear una instancia de la panadería
        Panaderia panaderia = new Panaderia("POCHOCLO", 8);

        // Vender pan
        panaderia.venderPan(30);
        panaderia.venderPan(20);

        // Mostrar el resumen de la panadería
        System.out.println(panaderia.toString());
    }
}