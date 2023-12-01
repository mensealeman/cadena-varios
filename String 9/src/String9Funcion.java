public class String9Funcion {


/*
    9. Crea un programa que pida una “contraseña” al usuario y determine si es igual a una
    preestablecida. Si es correcta debe mostrar: Inicio de sesión correcto. En caso contrario debe
    pedir de nuevo la contraseña. El usuario tiene 6 intentos. Ten cuidado, el usuario siempre
    tiene la opción de poner espacios al principio o al final de su cadena y no serán “visibles” pero
    afectarán a tu programa.

    Función del ejercicio.

 */
        public static boolean passwordTest (String passW) {
            String originPass = "dam2023";
            return passW.equals(originPass);
        }
}
