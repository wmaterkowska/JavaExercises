package org.wmaterkowska;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PalindromeCreator {


    public static String createPalindrome(int N, int K) {

        if ((N % 2 == 1 && K > Math.ceil(N/2 + 1)) ||
                (N % 2 == 0) && K > N/2) {
            return "";
        }

        String palindrome = "";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        List<Character> letters = findLetters(alphabet, K);

        String half = "";
        int i = 0;
        while (half.length() < Math.floor(N / 2)) {
            half += letters.get(i % K);
            i++;
        }

        String halfReversed = "";
        for (int j = 0; j < half.length(); j++) {
            halfReversed += half.charAt(half.length() - j -1);
        }

        if (N% 2 == 0) {
            palindrome = half + halfReversed;
        } else {
            palindrome = half + letters.get(K -1) + halfReversed;
        }

        return palindrome;
    }


    public static List<Character> findLetters(char[] alphabet, int K) {
        Random random = new Random();

        List<Character> letters = new ArrayList<>();
        while(letters.size() < K) {
            char letter = alphabet[random.nextInt(26)];
            if (!letters.contains(letter)) {
                letters.add(letter);
            }
        }

        return letters;
    }

}
