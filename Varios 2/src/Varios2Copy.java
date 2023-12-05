import java.util.Scanner;

public class Varios2Copy {
    public static void main (String[] args) {

/*
    “KONAMI”
    Escribe un programa que lea un texto por consola formado por número y letras, detectando
    lo antes posible que se incluye o no el “código konami”, indicando en que posición comienza
    su primera aparición (por ejemplo, “código detectado en la posición X”). En caso de no
    detectarse, se genera la salida “no detectado”.
    El código konami está formado por la secuencia arriba, arriba, abajo, abajo, izquierda,
    derecha, izquierda, derecha, B, A. Donde arriba será equivalente a 8, abajo a 2, izquierda
    a 4 y derecha a 6 (según correspondencia de flechas con números en el teclado numérico).
    No se puede usar funciones avanzadas de texto en Java como la función “indexof,
    substring, etc”.

    Por ejemplo, para la entrada “abAcd88224646BAcd” generaría la salida “detectado código en la posición 6”
 */
        Scanner sc = new Scanner(System.in);
        String userCodeS;
        boolean codeFound;
        int pos;

        do {
            System.out.println("Introduzca texto:");
            userCodeS = sc.nextLine();

            codeFound = Varios2Fun.codeDetected(userCodeS);
            pos = Varios2Fun.codePos(userCodeS);

            String message = (codeFound) ? "Código 'Konami' detectado en posición "+pos+"." : "Código 'Konami' no detectado.";
            System.out.println(message);

        } while (!codeFound);


/*
        String konami = "88224646BA";
        String userCode;
        int pos;

        do {
            System.out.println("Introduzca texto:");
            userCode = sc.nextLine();

            if (userCode.contains(konami)) {
                pos = userCode.indexOf(konami);
                System.out.println("Konami detectado en la posición "+pos);
            } else {
                System.out.println("Konami NO detectado.");
            }
        } while (!userCode.contains(konami));
*/
    }
}
