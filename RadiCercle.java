public class App {
    public static void main(String[] args) {
        double a, r; // área y radio
        r = Leer.leerDouble("Introduce el radio del círculo:");
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
    }
}
