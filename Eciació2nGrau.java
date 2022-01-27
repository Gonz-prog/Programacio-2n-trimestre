public class App {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante
        a = Leer.leerDouble("Introduzca primer coeficiente (a):");
        b = Leer.leerDouble("Introduzca segundo coeficiente: (b):");
        c = Leer.leerDouble("Introduzca tercer coeficiente: (c):");
        // calculamos el determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0)
            System.out.println("No existen soluciones reales");
        else {
            // queda confirmar que a sea distinto de 0.
            // si a=0 nos encontramos una división por cero.
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución positiva: " + x1);
            System.out.println("Solución negativa: " + x2);
        }
    }
}
