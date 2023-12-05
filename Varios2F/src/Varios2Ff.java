public class Varios2Ff {

    public static boolean isKonamiCode (String str) {

        char [] konamiCode = {'8', '8', '2', '2', '4', '6', '4', '6', 'B', 'A'};
        char [] text = str.toCharArray();

        int i;
        int r = (text.length - konamiCode.length);

        boolean codigoDetectado = false;

        for (i = 0; i <= r; i++) {

            codigoDetectado = true;

            for (int j = 0; j < konamiCode.length; j++) {

                if (text[i + j] != konamiCode[j])
                {
                    codigoDetectado = false;
                    break;
                }

            }

            if (codigoDetectado)
            {
                break;
            }

        }
        return codigoDetectado;
    }


    public static int konamiCodePosition (String str) {

        char [] konamiCode = {'8', '8', '2', '2', '4', '6', '4', '6', 'B', 'A'};
        char [] text = str.toCharArray();

        int i;
        int r = text.length - konamiCode.length;

        boolean b;


        for (i = 0; i <= r; i++) {

            b = true;

            for (int j = 0; j < konamiCode.length; j++) {

                if (text[i + j] != konamiCode[j])
                {
                    b = false;
                    break;
                }

            }

            if (b) {
                break;
            }

        }
        return i;
    }

}