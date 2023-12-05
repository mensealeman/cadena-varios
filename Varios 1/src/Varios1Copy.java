import java.util.Scanner;
public class Varios1Copy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

        int decimalN, resto, cociente, aux, contador = 0;
        StringBuilder binary = new StringBuilder();

        do {
            System.out.println("Introduzca número entero positivo:");
            decimalN = sc.nextInt();

            aux = decimalN;

            while (decimalN>=1) {
                resto = decimalN % 2;
                binary.append(resto);
                cociente = decimalN / 2;
                decimalN = cociente;
            }
        } while (aux<=2);

        binary.reverse();
        System.out.println("El número "+aux+" en binario es "+binary);

        for (int i=0; i<binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                contador++;
            }
        }
        if (contador % 2 == 0) {
            System.out.println("El "+aux+" es un número malvado.");
        } else {
            System.out.println("El "+aux+" no es un número malvado.");
        }
    }
}