package Encoder;

class Encoder extends ReferenceTable {

    private String encodedText = "";
    private char offSetChar = ' ';

    public String encode(String plainText) {

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
            } else {
                // Append unrecognised character
                encodedText.append(chars);
            }
        }
        this.encodedText = encodedText.toString();
        return encodedText.toString();
    }

    public String getPrevEncoded() {
        return encodedText;
    }

    public void setOffSetChar(char offSetChar) {
        this.offSetChar = offSetChar;
    }
}