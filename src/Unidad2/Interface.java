
package Unidad2;

public class Interface {
    public static void main(String[] args) {
        Vehiculo carro = new Carro();
        Vehiculo bicicleta = new Bicicleta();

        carro.acelerar();   
        carro.frenar();      

        bicicleta.acelerar(); 
        bicicleta.frenar();  
    }

    
    interface Vehiculo {
        void acelerar();
        void frenar();
    }

   
    static class Carro implements Vehiculo {
        @Override
        public void acelerar() {
            System.out.println("El carro esta acelerando.");
        }

        @Override
        public void frenar() {
            System.out.println("El carro esta frenando.");
        }
    }

    // Clase Bicicleta que implementa la interfaz Vehiculo
    static class Bicicleta implements Vehiculo {
        @Override
        public void acelerar() {
            System.out.println("La bicicleta esta acelerando.");
        }

        @Override
        public void frenar() {
            System.out.println("La bicicleta esta frenando.");
        }
    }

   
    
}