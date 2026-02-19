package aproximacioncurvas;

public class Principal {

    public static void main(String[] args) {

        // f(x) = cos(x)
        FuncionAproximada fa =
                new FuncionAproximada(0, Math.PI / 2, 6);

        System.out.println("Área aproximada = " + fa.calcularArea());
        System.out.println("Longitud aproximada = " + fa.calcularLongitud());
    }
}