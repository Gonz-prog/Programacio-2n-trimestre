public class App {
    public static void main(String[] args) {
        int parell = 0;
        int senar = 0;
        for (int i=100;i<=200;++i){
            if (i%2 != 0){
                senar += i;
            }
            else {
                parell += i;
            }
        }
        System.out.println("Suma dels parells: "+parell+"\nSuma dels senars:  "+senar);
    }
}
