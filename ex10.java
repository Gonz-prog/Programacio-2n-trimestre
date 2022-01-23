public class App {
    public static void main(String[] args) {
        int n = 0;
        int nota = 0;
        while (n != -1) {
            n = Leer.leerEntero("Introdueix les notes, o, -1 per a eixir: ");
            if (n == 10) {
                nota += 1;
            }
        }
        System.out.println("Hi ha "+nota+" exelent/s");
    }
}
