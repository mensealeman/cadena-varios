import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {


        String originalStr = "Siempre se puede aprender Java";
        String tmpStr; // (temporal string)
        int blankSpace, originalLength, pos;
        int wordNum;

        blankSpace = 0;
        wordNum = 0;
        pos = 0;
        originalLength = originalStr.length();


        while (pos<originalLength) {
            pos = originalStr.indexOf(" ", pos);
            if (pos != -1) {
                blankSpace ++;
                pos++;
            } else {
                pos = originalLength+1;
            }
            wordNum ++;
        }

        System.out.println("Número de espacios en blanco: " + blankSpace);
        System.out.println("Número de palabras: " + wordNum);
        System.out.println("Número de letras: "+ (originalLength-blankSpace));

        System.out.println("Número de a: " + Str11Funcion.aNumber(originalStr));
        System.out.println("Cadena invertida: " + Str11Funcion.invert(originalStr));

    }
}
