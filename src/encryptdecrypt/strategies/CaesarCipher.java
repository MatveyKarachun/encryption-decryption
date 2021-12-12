package encryptdecrypt.strategies;

public abstract class CaesarCipher {

    private int key;

    CaesarCipher(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public String apply(String input) {
        StringBuilder output = new StringBuilder("");
        for (char ch : input.toCharArray()) {

        }

        return output.toString();
    }

    abstract char shiftChar(char ch);

}
