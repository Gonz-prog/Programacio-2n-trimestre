public class App {
    public static void main(String[] args) {
        double n = Leer.leerDouble("Introdueix un nombre positiu: ");
        double factorial = 1;
        while (n!=0) {
            factorial=factorial*n; 
            n--;
        }
        System.out.println("Factorial: "+factorial);
    }
}
