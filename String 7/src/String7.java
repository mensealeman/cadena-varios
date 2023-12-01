import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class String7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
    7. Lo mismo que en el anterior, pero se guardará toda la información en mayúsculas.
*/

        String a;
        boolean i;

        do {
            i = true;
            System.out.println("Introduzca palabra u oración que contega la letra a:");
            a = sc.nextLine();

            if (a.toUpperCase().lastIndexOf('a') >= 0) {
                System.out.println("La última posición del carácter 'a' es " + a.toUpperCase().lastIndexOf('a'));
            } else {
                System.out.println("\nNo se ha encontrado 'a' en el texto. Vuelve a intentarlo.");
                i = false;
            }

        } while (!i);



    }
}

