import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class String5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
    5. Devuelve la posición de la primera ‘a’ que forma parte de una cadena introducida por teclado.
       En caso de no contener el carácter debe mostrar un mensaje al usuario.
*/

        String a;
        boolean i;

        do {
            i = true;
            System.out.println("Introduzca palabra u oración que contega la letra a.");
            a = sc.nextLine();

            if (a.indexOf('a') >= 0) {
                System.out.println("La primera posición de 'a' es " + a.indexOf('a'));
            } else {
                System.out.println("\nNo se ha encontrado 'a' en el texto. Vuelve a intentarlo.");
                i = false;
            }

        } while (!i);







    }
}
