import java.util.Scanner;
public class Varios1 {
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

        int number;
        String binario;

        System.out.println("Introduzca número:");
        number = sc.nextInt();

        binario = V1BinarioFuncion.passtoBinary(number);
        System.out.println("El número " + number + " en binario se represeta como " + binario);

        System.out.println("El número " + binario + " es " + V1BinarioFuncion.isEvil(binario));

        System.out.println("El número " + number + " es " + V1BinarioFuncion.isEvil(V1BinarioFuncion.passtoBinary(number)));

    }
}