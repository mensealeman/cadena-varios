import java.sql.SQLOutput;
import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

//      2. Desmenuza el String “Java” mostrándolo por pantalla carácter.           a carácter.

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        /*
        String j = "Java" ;

        char [] desmenuzado = j.toCharArray();

        for (int i=0; i<4; i++) {

            System.out.println(desmenuzado[i]);
        }*/


        for (int i=0; i<4; i++) {

            System.out.println(word.charAt(i));
        }

    }
}