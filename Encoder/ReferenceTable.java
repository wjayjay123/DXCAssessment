package Encoder;

import java.util.HashMap;

public class ReferenceTable {

    // Variable to hold characters in reference table
    private String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";

    // Initialize Hashmap
    HashMap<Character, Integer> referenceTable = new HashMap<>();

    public ReferenceTable() {
        // Fill up hashmap with character(Key) : Index(value) pair
        for (int i = 0; i < chars.length(); i++) {
            referenceTable.put(chars.charAt(i), i);
        }
    }

    protected Integer getIndex(char character) {
        return referenceTable.get(character);
    }

}
