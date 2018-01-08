package ceasar;

import java.util.Scanner;

public class Szyfr {

    protected static final int ASCII_SPACE = 32;

    public static void menu() {

        Decipher decipher = new Decipher();
        Encrypytion encrypytion = new Encrypytion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an appropriate number from the menu START: \n1 - Data Encryption" +
                "\n2 - Decipherment \n3 - The End");

        int answer = scanner.nextInt();
        scanner.nextLine();

        String provideWord;
        int provideNumber;

        switch (answer) {

            case 1: {
                System.out.println("provide a message to encrypt: ");
                provideWord = scanner.nextLine().toUpperCase();
                System.out.println("provide a key to enhance the encryption with");
                provideNumber = scanner.nextInt();
                System.out.println(encrypytion.encrypt(provideWord, provideNumber));
                break;
            }
            case 2: {
                System.out.println("provide a message to decipher: ");
                provideWord = scanner.nextLine().toUpperCase();
                System.out.println("provide a key you enhanced the encryption with");
                provideNumber = scanner.nextInt();
                System.out.println(decipher.decipher(provideWord, provideNumber));
                break;
            }
            case 3: {
                System.out.println("Thank you - Good Bye !");
                break;
            }
            default: {
                System.out.println("You have not choosen any number - try again !");
                menu();
                break;
            }
        }
    }
}
