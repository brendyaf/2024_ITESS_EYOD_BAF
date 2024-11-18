
package TAREA_2;

import java.util.Scanner;

public class EliminacionDuplicados {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        while (contador < 5) {
            System.out.print("Ingrese un numero entre 10 y 100: ");
            int numero = scanner.nextInt();

            if (numero < 10 || numero > 100) {
                System.out.println("Numero fuera del rango. Intente otra vez.");
                continue;
            }

            boolean esDuplicado = false;
            for (int i = 0; i < contador; i++) {
                if (numeros[i] == numero) {
                    esDuplicado = true;
                    break;
                }
            }

            if (!esDuplicado) {
                numeros[contador] = numero;
                contador++;
                System.out.println("Numero aceptado: " + numero);
            } else {
                System.out.println("Numero duplicado. No se acepta.");
            }

            System.out.print("Valores unicos ingresados hasta ahora: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
        }
                
    }
}
