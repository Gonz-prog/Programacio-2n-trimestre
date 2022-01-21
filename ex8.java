public class App {
    public static void main(String[] args) {
        int n = 1;
        int neg = 0;
        int pos = 0;
        while (n != 0) {
            n = Leer.leerEntero("Introdueix un nombre: ");
            if (n > 0) {
                pos += 1;
            } else {
                neg += 1;
            }
        }
        System.out.println("Hi ha "+pos+" nombre/s positiu/s i "+neg+" nombre/s negatiu/s");
    }
}
