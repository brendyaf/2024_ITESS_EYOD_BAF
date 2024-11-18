
package Unidad2.transporte;

import java.util.HashSet;
import java.util.Set;

public class EjemploJavacollections {
    public static void main(String[] args) {
        // Creación de una colección Set para almacenar nombres únicos
        Set<String> nombres = new HashSet<>();

        // Agregar nombres a la colección
        nombres.add("Cristian");
        nombres.add("Alberto");
        nombres.add("Iris");  // Intento de duplicado
        nombres.add("Brendy");

        // Mostrar nombres almacenados
        System.out.println("Nombres en la coleccion: " + nombres);
    }
}