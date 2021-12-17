package encryptdecrypt;

import encryptdecrypt.strategies.CaesarCipher;
import encryptdecrypt.strategies.CaesarCipherUnicode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        int key = 0;
        String data = "";
        String inPath = "";
        String outPath = "";

        boolean encMode = true;
        boolean thereIsData = false;
        boolean thereIsInPath = false;
        boolean thereIsOutPath = false;

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
                    thereIsData = true;
                    break;
                case "-in":
                    inPath = args[i + 1];
                    thereIsInPath = true;
                    break;
                case "-out":
                    outPath = args[i + 1];
                    thereIsOutPath = true;
                    break;
            }
        }

        if (!encMode) {
            key = -key;
        }

        if (thereIsInPath && !thereIsData) {
            try {
                data = new String(Files.readAllBytes(Paths.get(inPath)));
            } catch (IOException e) {
                System.out.println("Error: can't read file");
                System.exit(0);
            }
        }

        CaesarCipher cipher = new CaesarCipherUnicode(key);
        String result = cipher.apply(data);
        if (thereIsOutPath) {
            File file = new File(outPath);
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(result);
            } catch (IOException e) {
                System.out.println("Error: can't write file");
                System.exit(0);
            }
        } else {
            System.out.println(result);
        }
    }
}
