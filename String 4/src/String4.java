import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class String4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
    4. Lo mismo que en el anterior, pero el DNI se separará en dos: parte numérica y letra.
*/

                String name, surname, idS;
                int idNum, age, dateBorn, weight, height;

                System.out.println("Introduzca nombre:");
                name = sc.nextLine();

                System.out.println("Introduzca apellidos:");
                surname = sc.nextLine();

                System.out.println("Introduzca la letra del dni:");
                idS = sc.nextLine();

                System.out.println("Introduzca dni sin la letra:");
                idNum = sc.nextInt();
                String idNum2 = String.valueOf(idNum);

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

                String [] data = {name, surname, idNum2, idS, age2, dateBorn2, weight2, height2};

/*
        for (int i=0; i<2; i++) {
            System.out.println(data[i]);
        }

        System.out.println(idNum2+idNum.charAt(8));
        System.out.println("Parte numérica: "+idNum2+"   Letra: "+idNum3);

        for (int i=4; i<8; i++) {
            System.out.println(data[i]);
        }
*/

                System.out.println(data[0]);
                System.out.println(data[1]);
                System.out.println("Parte numérica: "+idNum2+"   Letra: "+idS);
                System.out.println(data[4]);
                System.out.println(data[5]);
                System.out.println(data[6]);
                System.out.println(data[7]);

    }
}