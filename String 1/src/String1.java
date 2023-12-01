import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class String1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//      1. Devuelve la longitud de una cadena introducida por teclado.

        String word;

        System.out.println("Introduzca una palabra:");
        word = sc.nextLine();

        System.out.println("La palabra tiene "+word.length()+" caracteres.");


    }
}