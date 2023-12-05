public class Varios2Fun {

    public static boolean codeDetected (String codeD) {

        String str = "88224646BA";
        char [] konamiCode = str.toCharArray();
        char [] usercodeA = codeD.toCharArray();
        boolean codeFound = false;
        int diff2Str = 0, kL = 0;

        diff2Str = usercodeA.length - konamiCode.length;
        kL = konamiCode.length;

        for (int i = 0; i <= diff2Str; i++) {

            codeFound = true;

            for (int j = 0; j < kL; j++) {

                if (usercodeA[i + j] != konamiCode[j]) {
                    codeFound = false;
                    break;
                }
            }
            if (codeFound) {
                break;
            }
        }
        return codeFound;
    }


    public static int codePos (String codeP) {

        String str = "88224646BA";
        char [] konamiCode = str.toCharArray();
        char [] usercodeA = codeP.toCharArray();
        boolean codeFound = false;
        int diff2Str = 0, kL = 0, pos = 0;

        diff2Str = usercodeA.length - konamiCode.length;
        kL = konamiCode.length;

        for (int i = 0; i <= diff2Str; i++) {

            codeFound = true;

            for (int j = 0; j < kL; j++) {

                if (usercodeA[i + j] != konamiCode[j]) {
                    codeFound = false;
                    break;
                }
            }
            if (codeFound) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
