public class Repeat1VF {


    public static String transformToBinary (int number){
        StringBuilder Strbinary = new StringBuilder();
        int resto, cociente;
        String binary;


        while (number>=1) {
            resto = number % 2;
            Strbinary.append(resto);
            cociente = number / 2;
            number = cociente;
        }

        Strbinary.append(number);
        binary = Strbinary.reverse().toString();

        return binary;
    }


    public static String esEvil (String binario){
        int counterOnes=0;
        String result;

        for (int i=0; i<binario.length(); i++) {
            if (binario.charAt(i)=='1') {
                counterOnes++;
            }
        }

        if (counterOnes % 2 == 0) {
            result = "El número es Malvado.";
        } else {
            result = "El número es Santo.";
        }

        return result;
    }



}
