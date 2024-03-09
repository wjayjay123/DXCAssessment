package Encoder;

public class ReferenceTable {

    // Create reference table
    private String referenceTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";

    protected Integer getIndex(char character) {
        return referenceTable.indexOf(character);
    }

    protected char getChar(Integer index) {
        return referenceTable.charAt(index);
    }

    protected Integer getLength() {
        return referenceTable.length();
    }

}
