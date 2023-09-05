import org.wmaterkowska.PalindromeCreator;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class PalindromeCreatorTest {

    @Test
    public static void NSmaller() {
        int N = 2;
        int K = 3;

        assertEquals("", PalindromeCreator.createPalindrome(N,K));
    }

    @Test
    public static void KTooBig() {
        int N1 = 4;
        int K1 = 3;

        assertEquals("", PalindromeCreator.createPalindrome(N1,K1));
    }

    @Test
    public static void NKOkEven() {
        int N2 = 4;
        int K2 = 2;

        String createdPalindrome = PalindromeCreator.createPalindrome(N2,K2);

        assertEquals(N2, createdPalindrome.length());
        assertEquals((Boolean) true, isPalindrome(createdPalindrome));
        assertEquals(K2, countDifferentLetters(createdPalindrome));
    }


    @Test
    public static void NKOkOdd() {
        int N3 = 5;
        int K3 = 3;

        String createdPalindrome = PalindromeCreator.createPalindrome(N3,K3);

        assertEquals(N3, createdPalindrome.length());
        assertEquals((Boolean) true, isPalindrome(createdPalindrome));
        assertEquals(K3, countDifferentLetters(createdPalindrome));
    }

    @Test
    public static void NBigKOk() {
        int N4 = 10;
        int K4= 3;

        String createdPalindrome = PalindromeCreator.createPalindrome(N4,K4);

        assertEquals(N4, createdPalindrome.length());
        assertEquals((Boolean) true, isPalindrome(createdPalindrome));
        assertEquals(K4, countDifferentLetters(createdPalindrome));
    }

    private static Boolean isPalindrome(String word) {

        int i = 0;
        int j = word.length() -1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

//    private static Boolean containsAllLetters(String palindrome, char[] letters) {
//
//        for (char letter : letters ) {
//            if (palindrome.indexOf(letter) == -1) {
//                return false;
//            }
//        }
//        return true;
//    }

    private static int countDifferentLetters(String palindrome) {

        List<Character> differentLetters = new ArrayList<>();
        for (int i = 0; i < palindrome.length(); i++) {
            if (!differentLetters.contains(palindrome.charAt(i))) {
                differentLetters.add(palindrome.charAt(i));
            }
        }
        return differentLetters.size();
    }
}
