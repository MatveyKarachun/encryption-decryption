package encryptdecrypt.strategies;

public class CaesarCipherUnicode extends CaesarCipher {

    public CaesarCipherUnicode(int key) {
        super(key);
    }

    @Override
    char shiftChar(char ch) {
        return 0;
    }
}
