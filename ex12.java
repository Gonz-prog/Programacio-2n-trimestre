public class App {
    public static void main(String[] args) {
        double n = Leer.leerEntero("Digam un nombre: ");
        double e = Leer.leerEntero("Digam el valor de l'exponent: ");
        double e1 = Math.pow(n, e);
        int n1 = (int) n;
        int e11 = (int) e;
        int e12 = (int) e1;

        System.out.println(n1+" elevat a "+e11+" és "+e12);
    }
}
