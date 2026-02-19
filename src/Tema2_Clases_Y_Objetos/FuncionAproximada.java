package aproximacioncurvas;

public class FuncionAproximada {

    private double a;
    private double b;
    private int n;

    // Constructor
    public FuncionAproximada(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    // f(x) = cos(x)
    private double f(double x) {
        return Math.cos(x);
    }

    // Área aproximada
    public double calcularArea() {
        double dx = (b - a) / n;
        double area = 0;

        for (int i = 0; i < n; i++) {
            double x = a + i * dx;
            area += f(x) * dx;
        }

        return area;
    }

    // Longitud aproximada
    public double calcularLongitud() {
        double dx = (b - a) / n;
        double longitud = 0;

        for (int i = 0; i < n; i++) {
            double x1 = a + i * dx;
            double x2 = x1 + dx;

            double y1 = f(x1);
            double y2 = f(x2);

            longitud += Math.sqrt(dx * dx + Math.pow(y2 - y1, 2));
        }

        return longitud;
    }
}