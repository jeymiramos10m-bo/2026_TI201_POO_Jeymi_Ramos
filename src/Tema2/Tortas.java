//TecNM-ITESS-TICS-TI201
//Programación Orientada a Objetos
//Docente: Francisco Javier Montecillo Puente
//Email: famontecillo@itess.com
//Tema 2: Clases y Objetos
//Objetivo 
//Crear una aplicación de escritorio donde se utilicen los conceptos de clases y objetos
//Utilizar clases y objetos para crear una aplicación de escritorio para un negocio de emprendimiento en comida rápida, “Tortería Doña-Juana”. 
//(SpecificMeasurableArchiavailableRelevantTime)
 	//Crear una aplicación de escritorio para la Torteria Doña-Juana con fecha de entrega de 29 de mayo de 2026.

package Tema2;

public class Tortas {
    public static final int MAX_INGREDIENTES=10;
    private String nombre;
    private String[] ingredientes;
    private int numIngredientes;
    private float precio;

public Tortas(){
    ingredientes =new String[MAX_INGREDIENTES];
    numIngredientes = 0;
    
}

    public Tortas(String nombre, int pre, String[] ingredientes, float precio) {
        this.nombre = nombre;
        
        //copiar los ingredientes de entrada a mi lista de ingredientes
        this.numIngredientes=ingredientes.length;
        this.ingredientes = new String[MAX_INGREDIENTES];
        for (int i=0; i<numIngredientes; i++)
        this.ingredientes[i] = ingredientes[i];
        
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    public void setNumIngredientes(int numIngredientes) {
        this.numIngredientes = numIngredientes;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tortas{" + "nombre=" + nombre + ", ingredientes=" + ingredientes + ", numIngredientes=" + numIngredientes + ", precio=" + precio + '}';
    }
    public void agregarIngredientes(String ingrediente)throws Exception{
        if(numIngredientes >=MAX_INGREDIENTES){
            throw new Exception("Maxima cantidad de ingredientes");
        
        }
        ingredientes[numIngredientes]=ingrediente;
        numIngredientes++;
    }
}