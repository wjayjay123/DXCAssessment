package Encoder;

class Encoder extends ReferenceTable {

    String plainText = "";
    char offSetChar = ' ';

    public String encode(String plainText, char offSetChar) {
        this.plainText = plainText;
        this.offSetChar = offSetChar;

        // Get Index of Char from reference table to use as offset
        Integer offSetIndex = getIndex(offSetChar);
        if (offSetIndex == -1) {
            return "Invalid offset. Please try again\n";
        }

        // Initialize StringBuilder
        StringBuilder encodedText = new StringBuilder();
        encodedText.append(offSetChar);
        for (char chars : plainText.toCharArray()) {

            // Check if Character exist within reference table
            if (getIndex(chars) != -1) {
                Integer index = getIndex(chars);
                // Calculate offset index
                index = (index - offSetIndex + getLength()) % getLength();
                // Append character to encoded string
                encodedText.append(getChar(index));
            } else if (chars == ' ') {
                // Append space
                encodedText.append(' ');
            }
        }
        return encodedText.toString();

    }
}