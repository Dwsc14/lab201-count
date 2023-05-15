package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Count {
    static Scanner scanner = new Scanner(System.in);

    public static void cLetter() {
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String delimiter = " ,!";

        StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter);

        Map<String, Integer> wordCount = new HashMap<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println(wordCount);

    }

    public static void cChar() {

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                if (charCount.containsKey(c)) {
                    int count = charCount.get(c);
                    charCount.put(c, count + 1);
                } else {
                    charCount.put(c, 1);
                }
            }
        }

        System.out.println(charCount);
    }
}
