

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> indexMap = new HashMap<>();

        // Define custom indices for characters
        indexMap.put('h', 2);
        indexMap.put('e', 4);
        indexMap.put('l', 1);
        indexMap.put('o', 3);

        // Sort the string based on custom indices
        String sortedString = sortString(str, indexMap);

        System.out.println("Original string: " + str);
        System.out.println("Sorted string: " + sortedString);
    }

    public static String sortString(String str, Map<Character, Integer> indexMap) {
        // Convert the string to character array
        char[] chars = str.toCharArray();

        // Sort the character array based on custom indices using a custom comparator
        Arrays.sort(chars, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int indexA = hm.getOrDefault(a, Integer.MAX_VALUE);
                int indexB = hm.getOrDefault(b, Integer.MAX_VALUE);
                return Integer.compare(indexA, indexB);
            }
        });

        // Convert the sorted character array back to string
        return new String(chars);
    }
}
