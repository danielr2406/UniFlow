
package uniflow.controller;

import java.util.Random;

public class CodigoGenerator {

    public static String generar() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();

        return "" + letras.charAt(r.nextInt(26))
                 + letras.charAt(r.nextInt(26))
                 + (100 + r.nextInt(900));
    }
}