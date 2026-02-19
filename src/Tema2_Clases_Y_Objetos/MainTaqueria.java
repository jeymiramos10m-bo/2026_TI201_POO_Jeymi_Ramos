package Tema2_Clases_Y_Objetos;

public class MainTaqueria {

    public static void main(String[] args) {

        // Crear una instancia de la taquería
        Taqueria taqueria = new Taqueria("El Buen Taco", 25);

        // Vender tacos
        taqueria.venderTacos(10);
        taqueria.venderTacos(5);

        // Mostrar el resumen de la taquería
        System.out.println(taqueria.toString());
    }
}