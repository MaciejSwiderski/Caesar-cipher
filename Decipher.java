package ceasar;

import static ceasar.Szyfr.ASCII_SPACE;

public class Decipher {


    public static String decipher(String provideWord, int provideNumber) {

        String result = "";
        char c;
        int ascii;

        for (int i = provideWord.length() - 1; i >= 0; i--) {
            if (provideWord.codePointAt(i) < 33 || provideWord.codePointAt(i) > 90) {
                result = result + provideWord.charAt(i);
            }
            if ((provideWord.codePointAt(i) != ASCII_SPACE)) {
                ascii = provideWord.codePointAt(i) - provideNumber;
                ascii = ascii < 33 ? ascii + 58 : ascii;
                result += (char) ascii;
            }
        }
        return result;
    }
}
