public class App {
    public static void main(String[] args) {
        int suma=0;
        int producte=1;
        for (int i=1;i<=10;++i){
            suma += i;
            producte *= i;    
        }
        System.out.println("Sumatori: "+suma+" Productori:"+producte);
    }
}
