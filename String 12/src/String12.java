import java.util.Scanner;
public class String12 {
    public static void main(String[] args) {

/*
        12. Definir una string a con la cadena «Esto es una string»; definir la string b con la cadena «Y
        esto también».
        1 • Comparar las dos strings y decir si son iguales
        2 • Crear la string «c» con la concatenación de a y b
        3 • Crear la string «d» con la concatenacion de a y b otra vez
        4 • Comparar las string c y d y decir si son iguales
        5 • Indicar cuantos caracteres tiene cada una de las strings
        6 • Copiar la string a en la string b
        7 • Presentar en consola el contenido de la string a y de la string b.
 */

        String a = "Esto es una string.";
        String b = "Y esto también.";

    // 1. Comparar las dos strings y decir si son iguales.

        if (a.equals(b)) {
            System.out.println("Son iguales.");
        } else {
            System.out.println("No son iguales.");
        }

    // 2. Crear la string «c» con la concatenación de a y b.

        String c = a + b;

    // 3. Crear la string «d» con la concatenacion de a y b otra vez.

        String d = a + b;

    // 4. Comparar las string c y d y decir si son iguales.

        if (c.equals(d)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales.");
        }

    // 5. Indicar cuantos caracteres tiene cada una de las strings.

        System.out.println("La string a tiene "+a.length()+" caracteres. Y la string b tiene "+b.length()+" caracteres.");

    // 6. Copiar la string a en la string b




    // 7. Presentar en consola el contenido de la string a y de la string b.

    }
}