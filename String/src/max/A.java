package max;

import java.util.Scanner;

import java.util.LinkedHashMap;
import java.util.Map;

public class A {
    public static char findFirstNonRepeatingCharacter(String str) {
        // Create a LinkedHashMap to maintain the insertion order of characters
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Traverse the string and update the frequency map
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (count == 1) {
                return c;
            }
        }

        return '\0'; // Return '\0' if there is no non-repeating character
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(str);
        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar); // Output: First non-repeating character: H
        } else {
            System.out.println("No non-repeating character found.");
        }
    }


}

