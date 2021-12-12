package encryptdecrypt.strategies;

public class CaesarCipherEngLetters extends CaesarCipher {

    private final int engAlphabetSize = 26;

    public CaesarCipherEngLetters(int key) {
        super(key);
    }

    @Override
    char shiftChar(char ch) {
        return 0;
    }
}
