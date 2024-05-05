package Anagrams;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String a, String b) {
        String normalizedA = a.toLowerCase();
        String normalizedB = b.toLowerCase();

        char[] charArrayA = normalizedA.toCharArray();
        char[] charArrayB = normalizedB.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        String sortedA = new String(charArrayA);
        String sortedB = new String(charArrayB);

        return sortedA.equals(sortedB);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "margana"));  // Output: true
        System.out.println(isAnagram("anagramm", "marganaa")); // Output: false
        System.out.println(isAnagram("Hello", "hello"));      // Output: true
    }
}
