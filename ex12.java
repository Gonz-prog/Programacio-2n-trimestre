public class App {
    public static void main(String[] args) {
        int n = Leer.leerEntero("Digam un nombre: ");
        int e = Leer.leerEntero("Digam el valor de l'exponent: ");
        int res = 1;
        for (int i=1;i<=e;i++) {
            res *= n;
        }
        System.out.println(n+" elevat a "+e+" és "+res);
    }
}
