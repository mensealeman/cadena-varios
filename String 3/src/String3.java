import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class String3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


/*
    3. Crea un programa que simule un formulario de datos de un usuario. Se le debe pedir al usuario: Nombre y Apellidos, DNI, edad, fecha de nacimiento, peso y altura. Además, para el DNI debes mostrar la letra (el usuario introduce el DNI completo y el programa muestra: xxxxLETRA)
 */

        String name, surname, idNum;
        int age, dateBorn, weight, height;

        System.out.println("Introduzca nombre:");
        name = sc.nextLine();

        System.out.println("Introduzca apellidos:");
        surname = sc.nextLine();

        System.out.println("Introduzca dni:");
        idNum = sc.nextLine();
        String idNum2 = idNum.substring(0,8);
        String idNum3 = String.valueOf(idNum.charAt(8));
        String idNum4 = "xxxxxxxx";

        System.out.println("Introduzca edad:");
        age = sc.nextInt();
        String age2 = String.valueOf(age);

        System.out.println("Introduzca fecha de nacimiento:");
        dateBorn = sc.nextInt();
        String dateBorn2 = String.valueOf(dateBorn);

        System.out.println("Introduzca peso:");
        weight = sc.nextInt();
        String weight2 = String.valueOf(weight);

        System.out.println("Introduzca altura:");
        height = sc.nextInt();
        String height2 = String.valueOf(height);

        String [] data = {name, surname, idNum, idNum2, age2, dateBorn2, weight2, height2};


        for (int i=0; i<2; i++) {
            System.out.println(data[i]);
        }

        System.out.println(idNum2+idNum.charAt(8));
        System.out.println(idNum4+"-"+idNum3);

        for (int i=4; i<8; i++) {
            System.out.println(data[i]);
        }

/*
            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(idNum2+"-"+idNum3);
            System.out.println(data[4]);
            System.out.println(data[5]);
            System.out.println(data[6]);
            System.out.println(data[7]);
*/
    }
}