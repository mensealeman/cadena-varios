import java.util.Scanner;

/*

Escribe un programa que lea un texto por consola formado por número y letras, detectando
lo antes posible que se incluye o no el “código konami”, indicando en que posición comienza
su primera aparición (por ejemplo, “código detectado en la posición X”). En caso de no
detectarse, se genera la salida “no detectado”.

El código konami está formado por la secuencia arriba, arriba, abajo, abajo, izquierda,
derecha, izquierda, derecha, B, A. Donde arriba será equivalente a 8, abajo a 2, izquierda
a 4 y derecha a 6 (según correspondencia de flechas con números en el teclado numérico).
No se puede usar funciones avanzadas de texto en Java como la función “indexof,
substring, etc”.

Por ejemplo, para la entrada “abAcd88224646BAcd” generaría la salida “detectado código
en la posición 6”

Código Konami: 88224646BA

 */


public class Varios2F {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text;
        int position;
        boolean b;

        System.out.println("Introduce un texto:");
        System.out.print("> ");
        text = sc.nextLine();

        b = Varios2Ff.isKonamiCode(text);
        position = Varios2Ff.konamiCodePosition(text);

        String message = (b) ? ("Código detectado en la posición: " + position) : "Código no detectado.";

        System.out.println(message);
    }
}