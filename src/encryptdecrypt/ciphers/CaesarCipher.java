package encryptdecrypt.ciphers;

public abstract class CaesarCipher {

    private int key;

    CaesarCipher(int key) {
        this.key = key;
    }

    int getKey() {
        return key;
    }

    //Template method
    public String apply(String input) {
        StringBuilder output = new StringBuilder("");
        for (char ch : input.toCharArray()) {
            output.append(shiftChar(ch));
        }
        return output.toString();
    }

    abstract char shiftChar(char ch);

    public static final CaesarCipher createCaesarCipher(String type, int key) {
        if ("unicode".equals(type)) {
            return new CaesarCipherUnicode(key);
        } else {
            return new CaesarCipherShiftEngLetters(key);
        }
    }
}
