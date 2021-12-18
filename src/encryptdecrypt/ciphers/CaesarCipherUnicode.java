package encryptdecrypt.ciphers;

public class CaesarCipherUnicode extends CaesarCipher {

    CaesarCipherUnicode(int key) {
        super(key);
    }

    @Override
    char shiftChar(char ch) {
        return (char) (ch + getKey());
    }
}
