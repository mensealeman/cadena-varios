import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class String6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
    6. Lo mismo que el anterior, pero para la última posición.
 */

        String a;
        boolean i;

        do {
            i = true;
            System.out.println("Introduzca palabra u oración que contega la letra a:");
            a = sc.nextLine();

            if (a.lastIndexOf('a') >= 0) {
                System.out.println("La última posición del carácter 'a' es " + a.lastIndexOf('a'));
            } else {
                System.out.println("\nNo se ha encontrado 'a' en el texto. Vuelve a intentarlo.");
                i = false;
            }

        } while (!i);

    }
}
