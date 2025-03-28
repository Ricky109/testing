package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        shift = shift % 26;
        for (char currentChar : message.toCharArray()) {
            if (currentChar >= 'a' && currentChar <= 'z') {
                int newChar = currentChar + shift;
                if (newChar > 'z') {
                    newChar -= 26;
                } else if (newChar < 'a') {
                    newChar += 26;
                }
                sb.append((char) newChar);
            } else if (currentChar == ' ') {
                sb.append(currentChar);
            } else {
                return "invalid";
            }
        }
        return sb.toString();
    }
}
