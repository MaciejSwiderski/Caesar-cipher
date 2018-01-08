package ceasar;

import static ceasar.Szyfr.ASCII_SPACE;

public class Encrypytion {

    public static String encrypt(String provideWord, int provideNumber) {

        String result = "";
        char c;
        int ascii;
        for (int i = provideWord.length() - 1; i >= 0; i--) {
            if (provideWord.codePointAt(i) < 33 || provideWord.codePointAt(i) > 90) {
                result = result + provideWord.charAt(i);
            }
            if (!(provideWord.codePointAt(i) == ASCII_SPACE)) {
                ascii = provideWord.codePointAt(i);
                ascii = ascii + provideNumber;
                if (ascii > 90)
                    ascii = ascii - 58;
                c = (char) ascii;
                result = result + c;
            }
        }
        return result;
    }
}
