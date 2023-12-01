public class Str11Funcion {

    public static int aNumber (String word) {
        int result = 0;

        for (int i=0; i<word.length(); i++) {
            if (word.toLowerCase().charAt(i)=='a') {
                result ++;
            }
        }
        return result;
    }

    public static String invert (String cadena) {
        String result = "";
        for (int i=cadena.length()-1; i>=0; i--) {
            result += cadena.charAt(i);
        }
        return result;
    }


    public static String invertBuilder (String cadena) {
        StringBuilder result = new StringBuilder(cadena);
        return result.reverse().toString();
    }


}
