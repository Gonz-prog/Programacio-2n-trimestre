public class App {
    public static void main(String[] args) {
        int cont = 0;
        int neg = 0;
        int pos = 0;
        while (cont <= 99) {
            int n = Leer.leerEntero("Introdueix un nombre: ");
            cont += 1;
            if (n > 0) {
                pos += 1;
            } else {
                neg += 1;
            }
        }
        System.out.println("Hi ha "+pos+" nombres positius i "+neg+" nombres negatius");
    }
}
