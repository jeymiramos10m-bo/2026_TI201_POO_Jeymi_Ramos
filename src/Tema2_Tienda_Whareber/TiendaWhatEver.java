/*
    Instituto Tecnológico Superior de Salvatierra
    Semestre Enero Junio 2026
    Materia: Programación Orientada a Objetos 
    Profesor: Dr. Francisco Javier Montecillo Puente  
    TI-201
    Tema2 Clases y objetos
    Jeymi Jimena Ramos Martínez
 */
package Tema2_Tienda_Whareber;

public class TiendaWhatEver {

    public static final int NumeroMaxCamisas = 10;
    public static final int NumeroMaxSudaderas = 10;

    private FastReader fr = new FastReader();

    private Camisa camisas[] = new Camisa[NumeroMaxCamisas];
    private Sudadera sudaderas[] = new Sudadera[NumeroMaxSudaderas];

    private int numCamisas = 0;
    private int numSudaderas = 0;

    private int ventasCamisas = 0;
    private int ventasSudaderas = 0;
    private double totalVentas = 0;

    public char menu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("a) Ver camisa");
        System.out.println("b) Ver sudadera");
        System.out.println("c) Agregar camisas");
        System.out.println("d) Agregar sudaderas");
        System.out.println("e) Comprar camisa");
        System.out.println("f) Comprar sudadera");
        System.out.println("g) Reporte stock");
        System.out.println("h) Reporte ventas");
        System.out.println("x) Salir");

        return fr.nextChar();
    }

    public void app() {
        char op;

        do {
            op = menu();

            switch (op) {

                case 'a':
                     verSudaderas();
                    Sudadera su = Sudadera.menuSudadera();
                    System.out.println("Sudaderas: " + su);
                    
                    break;

                case 'b':
                    verCamisas();
                    Camisa ca = Camisa.menuCamisa();
                    System.out.println("Camisas: " + ca);
                   
                    break;

                case 'c':
                    Camisa c = Camisa.menuCamisa();
                    if (c != null) {
                        camisas[numCamisas++] = c;
                        System.out.println("Agregada: " + c);
                    }

                case 'd':
                    Sudadera s = Sudadera.menuSudadera();
                    if (s != null) {
                        sudaderas[numSudaderas++] = s;
                        System.out.println("Agregada: " + s);
                    }
                   
                    break;

                case 'e':
                    comprarCamisa();
                    
                    break;

                case 'f':
                    comprarSudadera();
                    break;

                case 'g':
                    System.out.println("Stock Camisas: " + numCamisas);
                    System.out.println("Stock Sudaderas: " + numSudaderas);
                    break;

                case 'h':
                    System.out.println("Ventas Camisas: " + ventasCamisas);
                    System.out.println("Ventas Sudaderas: " + ventasSudaderas);
                    System.out.println("Total: $" + totalVentas);
                    break;

                case 'x':
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (op != 'x');
    }

    public void verCamisas() {
        for (int i = 0; i < numCamisas; i++) {
            System.out.println(i + ". " + camisas[i]);
        }
    }

    public void verSudaderas() {
        for (int i = 0; i < numSudaderas; i++) {
            System.out.println(i + ". " + sudaderas[i]);
        }
    }

    public void comprarCamisa() {
        verCamisas();
        int i = Integer.parseInt(fr.next());

        if (i >= 0 && i < numCamisas) {
            ventasCamisas++;
            totalVentas += camisas[i].getPrecio();
            System.out.println("Compraste: " + camisas[i]);
        }
    }

    public void comprarSudadera() {
        verSudaderas();
        int i = Integer.parseInt(fr.next());

        if (i >= 0 && i < numSudaderas) {
            ventasSudaderas++;
            totalVentas += sudaderas[i].getPrecio();
            System.out.println("Compraste: " + sudaderas[i]);
        }
    }

    public static void main(String[] args) {
        new TiendaWhatEver().app();
    }
}