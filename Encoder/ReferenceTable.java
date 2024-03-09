package Encoder;

public abstract class ReferenceTable {

    // Create reference table
    private String referenceTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";

    // Retrieve index of character input
    protected Integer getIndex(char character) {
        return referenceTable.indexOf(character);
    }

    // Retrieve character using index
    protected char getChar(Integer index) {
        return referenceTable.charAt(index);
    }

    // Retrieve the length of the reference table
    protected Integer getLength() {
        return referenceTable.length();
    }

}
