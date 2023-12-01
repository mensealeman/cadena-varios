import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
    10. Crea un programa que pida una “contraseña” al usuario. Para poder guardar la contraseña,
    debe contener (al menos) una mayúscula, una minúscula y un número. En caso de que el
    usuario no introduzca una contraseña con estas condiciones se le mostrará un mensaje y se
    le pedirá un nuevo intento. Ten cuidado, el usuario siempre tiene la opción de poner espacios
    al principio o al final de su cadena y no serán “visibles” pero afectarán a tu programa.
*/

        String password = "dam2023";


        for (int j=6; j>0; j--) {
            System.out.println("Nº de intentos restantes: "+j);
            System.out.println("Introduzca contraseña:");
            String passU = sc.nextLine();
            String passU2 = passU.trim();


            if (passU2.equals(password)) {
                System.out.println("Inicio de sesión correcto");
                break;
            } else {
                if (j>1) {
                    System.out.println("Contraseña incorrecta. Vuelva a intentarlo.");
                } else {
                    System.out.println("Contraña incorrecta. Has excedido el nº intentos. Inténtalo más tarde.");
                }
            }
        }

    }
}
