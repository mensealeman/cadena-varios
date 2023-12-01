import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class String8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//  8. Elimina los espacios del texto introducido por teclado y sustitúyelos por un guión(-).


        System.out.println("Introduzca oración:");
        String text = sc.nextLine();

        String text2 = text.trim();
        text2 = text2.replaceAll(" ", "-");
        System.out.println(text2);

    }
}
