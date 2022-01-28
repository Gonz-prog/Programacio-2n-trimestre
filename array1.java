import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] vector = new int[5];

        System.out.println(Arrays.toString(vector));

        for (int i=0;i<vector.length;i++) {
            vector[i]=3;
        }
        System.out.println(Arrays.toString(vector));
        int size = Integer.SIZE*5/8;

        System.out.println(size);
    }
}
