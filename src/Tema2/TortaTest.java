
package Tema2;

import java.util.Scanner;

public class TortaTest {

    public static void main(String[] args) {

        // Introducimos la libreria Scanner para permitir al usuario ingresar valores
        Scanner leer = new Scanner(System.in);

        // Definimos los objetos que el metodo main mandara a llamar
        Usuario usuario = null;
        Tortas torta = new Tortas();
        Pedido pedido = null;
        Orden orden = null;
          //Introducimos una variable de tipo entero que servira como un metodo de elegir una opcion
        int opcion;

        do {
            System.out.println("\n____ MENU ____");
            System.out.println("1. Crear usuario");
            System.out.println("2. Crear torta");
            System.out.println("3. Agregar ingrediente");
            System.out.println("4. Crear pedido");
            System.out.println("5. Crear orden");
            System.out.println("6. Mostrar orden");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            // Control de error si no ingresan número valido
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Debes ingresar un numero");
                leer.nextLine(); 
                opcion = -1;
                continue;
            }

            leer.nextLine(); 
            // Introducimos una estructura de control
            switch (opcion) {

                case 1:
                    
                    System.out.print("Nombre del usuario: ");
                    String nombreUsuario = leer.nextLine();

                 // Excepsion en t¿caso de que el nombre no sea valido
                    if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
                        System.out.println("Ingrese un nombre valido:/");
                    } else {
                        usuario = new Usuario(nombreUsuario);
                        System.out.println("Usuario creado con exito");
                    }
                    break;

                case 2:
                   
                    System.out.print("Nombre de la torta: ");
                    String nombreTorta = leer.nextLine();

                    System.out.print("Precio: ");
                    try {
                        float precio = leer.nextFloat();
                        leer.nextLine();
                        //Metemos una excesion en caso de que el precio sea negativo
                        if (precio < 0) {
                            throw new IllegalArgumentException("El precio es negativo");
                        }

                        torta.setNombre(nombreTorta);
                        torta.setPrecio(precio);

                        System.out.println("Torta creada");
                    } catch (Exception e) {
                        System.out.println("Error en precio: " + e.getMessage());
                        leer.nextLine();
                    }
                    break;

                case 3:
                  
                    try {
                        System.out.print("Ingrediente: ");
                        String ingrediente = leer.nextLine();

                        if (ingrediente.isEmpty()) {
                            throw new IllegalArgumentException("Ingrediente vacio");
                        }

                        torta.agregarIngredientes(ingrediente);
                        System.out.println("Ingrediente agregado");

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                   //Esto permite que al no tener un usuario creado mande una advertencia
                    if (usuario == null || torta.getNombre() == null) {
                        System.out.println("Primero crea usuario y torta");
                    } else {
                        pedido = new Pedido(usuario, torta);
                        System.out.println("Pedido creado!");
                    }
                    break;

                case 5:
                    //Esto permite que al no tener un usuario creado mande una advertencia
                    if (pedido == null) {
                        System.out.println("Primero crea un pedido");
                    } else {
                        try {
                            System.out.print("Prioridad (numero): ");
                            int prioridad = leer.nextInt();

                            System.out.print("Pagado? (true/false): ");
                            boolean pago = leer.nextBoolean();
                            leer.nextLine();

                            System.out.print("Estatus (cocina, entregado, etc): ");
                            String estatus = leer.nextLine();

                            orden = new Orden(pedido, prioridad, pago, estatus);
                            System.out.println("Orden creada!");

                        } catch (Exception e) {
                            System.out.println("Error al crear orden");
                            leer.nextLine();
                        }
                    }
                    break;

                case 6:
                    //Imprimimos la orden
                    if (orden != null) {
                        System.out.println("\n--- ORDEN ---");
                        System.out.println(orden);
                    } else {
                        System.out.println("No hay orden creada");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        leer.close();
    }
}