package Encoder;

public class Decoder extends ReferenceTable {

    public String decode(String encodedText) {

        // Split offset character and encoded text
        char offSetChar = encodedText.charAt(0);
        String encodedString = encodedText.substring(1);

        // Get Index of Char from reference table to use as offset
        Integer offSetIndex = getIndex(offSetChar);
        if (offSetIndex == -1) {
            return "Invalid offset. Please try again\n";
        }

        // Initialize StringBuilder
        StringBuilder decodedText = new StringBuilder();
        for (char chars : encodedString.toCharArray()) {

            // Check if Character exist within reference table
            if (getIndex(chars) != -1) {
                Integer index = getIndex(chars);
                // Calculate offset index
                index = (index + offSetIndex) % getLength();
                // Append character to encoded string
                decodedText.append(getChar(index));
            } else if (chars == ' ') {
                // Append space
                decodedText.append(' ');
            }
        }
        return decodedText.toString();
    }

}
