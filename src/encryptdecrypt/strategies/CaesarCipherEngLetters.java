package encryptdecrypt.strategies;

public class CaesarCipherEngLetters extends CaesarCipher {

    private final int engAlphabetSize = 26;

    public CaesarCipherEngLetters(int key) {
        super(key);
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
