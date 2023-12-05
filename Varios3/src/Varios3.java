import java.util.Scanner;

public class Varios3 {
    public static void main(String[] args) {
/*
        “ESCALERA”
        Escribe un programa que lea un número entero por teclado y genere una escalera usando
        los caracteres ‘_’ , ‘|’ y ‘x’, que tenga tantos peldaños como el número introducido.
        Por ejemplo; si introducimos el número 4, debería de dibujar:

                            __
                            xx|__
                            xxxx|__
                            xxxxxx|__
*/

        Scanner sc = new Scanner(System.in);
        int peldano;

        System.out.println("Introduzca el nº peldaños de la escalera:");
        peldano = sc.nextInt();

        System.out.println("__");

        for (int i=1; i<=peldano; i++) {

            for (int j=1; j<=i; j++) {
                System.out.print("xx");
            }
            for (int k=1; k<=1; k++) {
                System.out.print("|" + "__");
            }
            System.out.println();
        }
    }
}