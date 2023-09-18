package org.example;
import java.util.Map;
import java.util.HashMap;

public class CharacterCount {
    public static Map<Character, Integer> countCharacters(String sentence) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] characters = sentence.toCharArray();

        for (char character : characters) {
            if (charCountMap.containsKey(character)) {
                charCountMap.put(character, charCountMap.get(character) + 1);
            } else {
                charCountMap.put(character, 1);
            }
        }

        return charCountMap;
    }
}
