public class App {
    public static void main(String[] args) {
        int n = Leer.leerEntero("Introdueix un nombre enter: ");
        int suma = 0;
        int producte = 1;
        
        for (int i = 1; i <= n; ++i) {
            System.out.println(i);
        
            suma += i;
            producte *= i;   
        }
        System.out.printf("Sumatori: %f",suma);
        System.out.printf("Producte: %f",producte); 
    }
}
