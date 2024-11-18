
package Unidad2;


public class MetodoAbstracto {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido(); 
        gato.hacerSonido();  
    }
}
// Clase abstracta
abstract class Animal {
    
    public abstract void hacerSonido();
}


class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }
}


class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }
}

