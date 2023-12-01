import java.util.Scanner;
public class String9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
    9. Crea un programa que pida una “contraseña” al usuario y determine si es igual a una
    preestablecida. Si es correcta debe mostrar: Inicio de sesión correcto. En caso contrario debe
    pedir de nuevo la contraseña. El usuario tiene 6 intentos. Ten cuidado, el usuario siempre
    tiene la opción de poner espacios al principio o al final de su cadena y no serán “visibles” pero
    afectarán a tu programa.
 */

        boolean b;

        for (int j=6; j>0; j--) {
            System.out.println("Nº de intentos restantes: "+j);
            System.out.println("Introduzca contraseña:");
            String passU = sc.nextLine();
            passU = passU.trim();

            b = String9Funcion.passwordTest(passU);

            if (b) {
                System.out.println("Inicio de sesión correcto");
                break;
            } else {
                String error = (j>1) ? "Contraseña incorrecta. Vuelva a intentarlo." : "Contraña incorrecta. Has excedido el nº intentos. Inténtalo más tarde.";
                System.out.println(error);
                }
        }


    }
}
