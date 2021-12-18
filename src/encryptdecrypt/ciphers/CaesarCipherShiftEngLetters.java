package encryptdecrypt.ciphers;

public class CaesarCipherShiftEngLetters extends CaesarCipher {

    private static final int engAlphabetSize = 26;

    CaesarCipherShiftEngLetters(int key) {
        super(ifNegativeKeyToPositive(key));
    }

    private static int ifNegativeKeyToPositive(int key) {
        if (key < 0) {
            key = engAlphabetSize + key;
        }
        return key;
    }

    @Override
    char shiftChar(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ((ch - 'a' + getKey()) % engAlphabetSize + 'a');
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) ((ch - 'A' + getKey()) % engAlphabetSize + 'A');
        }
        return ch;
    }
}
