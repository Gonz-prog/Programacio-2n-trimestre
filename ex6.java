public class App {
    public static void main(String[] args) {
        int cont = 0;
        int neg = 0;
        while (cont <= 99) {
            int n = Leer.leerEntero("Introdueix un nombre: ");
            cont += 1;
            if (n < 0) {
                neg += 1;
            }
        }
        System.out.println("Hi ha "+neg+" nombres negatiu");
    }
}
