import java.util.Scanner;
public class Bintodec {
    public static void main (String[] args) {

        //  Convierte un número binario por teclado a decimal.

        Scanner sc = new Scanner(System.in);
        int decimalN = 0, exponente = 0, number;
        int ones = 0, zeros = 0, noZeroNorOnes = 0, lastDigit, aux, aux2;


        System.out.println("Introduzca número binario:");
        System.out.print("-> ");
        number = sc.nextInt();

        aux = number;
        aux2 = number;

        while (aux != 0) {
            lastDigit = aux % 10;

            if (lastDigit == 0) {
                zeros++;
            } else if (lastDigit == 1) {
                ones++;
            } else if (lastDigit != 1 && lastDigit != 0) {
                noZeroNorOnes++;
            }
            aux = aux / 10;
        }

        if (noZeroNorOnes == 0) {
            while (number != 0) {
                lastDigit = number % 10;
                decimalN += (int) (lastDigit * Math.pow(2, exponente));
                exponente++;
                number = number / 10;
            }
            System.out.println("Números de ceros contados: " + zeros + ", de unos: " + ones + ", de noZeroNorOnes: " + noZeroNorOnes);
            System.out.println("El número " + aux2 + " es binario.");
            System.out.println("El número " + aux2 + " en decimal es: " + decimalN);
        } else {
            if (noZeroNorOnes != 0) {
                System.out.println("Números de ceros contados: " + zeros + ", de unos: " + ones + ", de noZeroNorOnes: " + noZeroNorOnes);
                System.out.println("El número " + number + " no es binario.");
            }
        }
    }
}