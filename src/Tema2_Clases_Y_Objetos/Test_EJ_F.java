package Tema2_Clases_Y_Objetos;

public class Test_EJ_F {

    public static void main(String[] args) {

      
        EJ_F cargaAcademica = new EJ_F(
                "Ana López",
                "21540321",
                "Ingeniería en Sistemas Computacionales",
                "4to",
                6
        );

       
        cargaAcademica.mostrarCarga();

       
        cargaAcademica.setMateriasInscritas(7);

        System.out.println("\nCarga académica actualizada:");
        cargaAcademica.mostrarCarga();
    }
}