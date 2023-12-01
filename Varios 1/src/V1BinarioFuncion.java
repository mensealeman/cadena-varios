public class V1BinarioFuncion {


    public static String passtoBinary (int number) {

        int resto, cociente;
        StringBuilder strBinario = new StringBuilder();
        String binario;

        while (number >=2) {
            resto = number %2;
            cociente = number / 2;
            strBinario.append(resto);
            number = cociente;
        }
        strBinario.append(number);
        binario = strBinario.reverse().toString();

        return binario;
    }


    public static String isEvil (String binario) {

        int contador = 0;
        String result;

        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1') {
                contador++;
            }
        }
        if (contador%2 == 0) {
            result = "MALVADO";
        } else {
            result = "Somos unos santos";
        }
        return result;
    }

}
