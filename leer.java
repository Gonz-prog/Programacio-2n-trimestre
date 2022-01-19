import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

    private final static BufferedReader entradaConsola = new BufferedReader(new InputStreamReader(System.in));

    /**
     * LLig un text del teclat.
     * @param mensaje Text que es passa a l'usuari
     * @return el text introduit. Blanc en cas d'error.
     */
    public static String leerTexto(String mensaje) {
        String respuesta;
        do {
            try {
                System.out.println(mensaje);
                respuesta = entradaConsola.readLine();
            } catch (IOException ex) {
                return "";
            }
        } while (respuesta == null);
        return respuesta;
    }

    /**
     * Lectura de nombres enters.
     * @param mensaje Text que es passa a l'usuari
     * @return el valor de l'enter.
     */
    public static int leerEntero(String mensaje) {
        int n = 0;
        boolean aconseguit = false;
        while (!aconseguit) {
            try {
                n = Integer.parseInt(leerTexto(mensaje));
                aconseguit = true;
            } catch (NumberFormatException ex) {
                System.err.println("Has d'introduir un nombre enter.");
            }
        }
        return n;
    }

    /**
     * Lectura de nombres reals.
     * @param mensaje Text que es passa a l'usuari
     * @return el valor del real.
     */
    public static double leerDouble(String mensaje) {
        double n = 0.0;
        boolean aconseguit = false;
        while (!aconseguit) {
            try {
                n = Double.parseDouble(leerTexto(mensaje));
                aconseguit = true;
            } catch (NumberFormatException ex) {
                System.err.println("Has d'introduir un nombre real.");
            }
        }
        return n;
    }
}
