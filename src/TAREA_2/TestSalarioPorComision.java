
package TAREA_2;

public class TestSalarioPorComision {
    public static void main(String[] args) {
        SalarioPorComisionTest();
    }
    public static void SalarioPorComisionTest(){
        int []  ventas = {5000, 230, 430, 590};
        System.out.println(" E3: SALARIO POR COMISION----------");
        SalarioPorComision spc = new SalarioPorComision(ventas);
        spc.CalcularSalario();
        spc.imprimir();
    }
}
