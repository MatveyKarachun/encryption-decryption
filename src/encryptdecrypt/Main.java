package encryptdecrypt;

import encryptdecrypt.strategies.CaesarCipherUnicode;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        boolean encMode = true;
        int key = 0;
        String data = "";

        for (int i = 0; i < args.length - 1; i += 2) {
            switch (args[i]) {
                case "-mode":
                    if ("dec".equals(args[i + 1])) {
                        encMode = false;
                    }
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
            }
        }

        if (!encMode) {
            key = -key;
        }


        UnaryOperator<String> encryptor = new CaesarCipherUnicode(key)::apply;
        System.out.println(encryptor.apply(data));
    }
}
