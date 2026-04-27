/*
    Instituto Tecnológico Superior de Salvatierra
    Semestre Enero Junio 2026
    Materia: Programación Orientada a Objetos 
    Profesor: Dr. Francisco Javier Montecillo Puente  
    TI-201
    Tema2 Clases y objetos
    Jeymi Jimena Ramos Martínez
*/
/* 
aqui va el header
 */
package Tema2_Tienda_Whareber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//fastReader class for efficient input
public class FastReader {

    //BufferedReader to read input
    BufferedReader b;
    //StringTokenizer to tokenize input
    StringTokenizer s;

    //conctructor to inicialize BufferedReader
    public FastReader() {
        b = new BufferedReader(new InputStreamReader(System.in));
    }
    //Method to

    String next() {

        while (s == null || !s.hasMoreElements()) {
            try {
                s = new StringTokenizer(b.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return s.nextToken();
    }
    //method to read the next token as an integer

    char nextChar() {
        return next().charAt(0);
    }
}
