import java.util.Scanner;
public class Repeat1V {
    public static void main(String[] args) {


/*
    EJERCICIO NÚMERO 1

    “MALVADO”
    Escribe un programa que lea números enteros por consola e indique si es un número
    malvado o no. En teoría de números, un número malvado es un número entero no negativo
    que tiene un número de unos pares en su representación en binario. Si el número
    introducido es 0 o menor que 0 se debe finalizar el programa.

    Recuerda que un algoritmo para pasar un número decimal a binario consiste en realizar
    divisiones sucesivas por 2.
*/


        Scanner sc = new Scanner(System.in);
        StringBuilder binary = new StringBuilder();
        int number, resto, cociente, counterOnes = 0, aux;
        String binario;



        do {

            System.out.println("Introduzca número:");
            System.out.print("-> ");
            number = sc.nextInt();

            aux = number;

            if (number <= 0) {
                System.out.println("El número debe ser mayor a 0");
            } else {

                binario = Repeat1VF.transformToBinary(number);

                /*
                while (number >= 1) {
                    resto = number % 2;
                    binary.append(resto);
                    cociente = number / 2;
                    number = cociente;
                }*/
                /*
                for (int i = 0; i < binary.length(); i++) {
                    if (binary.charAt(i) == '1') {
                        counterOnes++;
                    }
                }

                binary.reverse();
                System.out.println("El número " + aux + " en binario es: " + binary);

                if (counterOnes % 2 == 0) {
                    System.out.println("El número es Malvado.");
                } else {
                    System.out.println("El número es Santo.");
                }
                 */

                System.out.println(Repeat1VF.esEvil(binario));
            }
        } while (number < 0);
    }
}