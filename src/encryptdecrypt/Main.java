package encryptdecrypt;

import encryptdecrypt.strategies.CaesarCipherEngLetters;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        String message = scanner.nextLine();
        int key = scanner.nextInt();
        if ("dec".equals(operation)) {
            key = -key;
        }
        UnaryOperator<String> encryptor = new CaesarCipherEngLetters(key)::apply;
        System.out.println(encryptor.apply(message));
    }
}
