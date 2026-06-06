package lesson13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MethodsJunitTest {

    public static String insertForm(String s, int index, String ins) {
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index, ins);
        return sb.toString();
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.isBlank() || s.isEmpty()) {
            return false;
        }
        s = s.replace(" ", "");
        s = s.replace("!", "");
        s = s.replace("?", "");
        if (s.length() == 1)
            return false;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return s.equalsIgnoreCase(rev);
    }

    @Test
    public void testIsPalindrome() {
        boolean res = MethodsJunitTest.isPalindrome("level");
        assertTrue(res);
        // positives tests -> true
        res = MethodsJunitTest.isPalindrome(" level  ");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome(" LeVel  ");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome("242");// 'это не палиндром, если это не указано в ТЗ
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("Name now one man!");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("!Name now one man!");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("\"Name now one man\"");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome("#$#");
        assertTrue(res);

// negatives tests -> false

        res = MethodsJunitTest.isPalindrome(null);
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("  ");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("Hello");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("123");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("Level_");
        assertFalse(res);
    }

    @Test
    public void testInsertForm() {
        String res = MethodsJunitTest.insertForm("Hello", 5, "world");
        assertEquals("Helloworld", res);

        res = MethodsJunitTest.insertForm("world", 0, "Hello ");
        assertEquals("Hello world", res);

        res = MethodsJunitTest.insertForm("Hello ", 5, "");
        assertNull(res, "Blank string s!");
        res = MethodsJunitTest.insertForm("", 0, "Hello ");
        assertNull(res, "Blank string ins!");

        res = MethodsJunitTest.insertForm("", 5, "Hello ");
        assertNull(res, "Blank string ins!");

    }


    @Test
    public void sumElementsArray() {
        //           0  1  2   3   4   5          6
        int[] ar = {-1, 9, 0, 24, -56, 0, Integer.MAX_VALUE};
        // positive tests
        int res = MethodsForTest.sumElementsArray(ar, 0, 4);
        assertTrue(-57 == res);
        res = MethodsForTest.sumElementsArray(ar, 0, 3);
        assertTrue(23 == res);
        res = MethodsForTest.sumElementsArray(ar, 1, 4);
        assertTrue(33 == res);
        res = MethodsForTest.sumElementsArray(ar, 2, 5);
        assertTrue(0 == res);
        res = MethodsForTest.sumElementsArray(ar, 3, 1);
        assertTrue(33 == res);
        res = MethodsForTest.sumElementsArray(ar, 1, 1);
        assertTrue(18 == res);
        res = MethodsForTest.sumElementsArray(ar, 0, 0);
        assertTrue(-2 == res);
        res = MethodsForTest.sumElementsArray(ar, 2, 3);
        assertTrue(24 == res);
        res = MethodsForTest.sumElementsArray(ar, 5, 4);
        assertTrue(-56 == res);

        // negative tests
        res = MethodsForTest.sumElementsArray(null,4,5);
        assertNull(res);
        int[] ar1 = {};
        res = MethodsForTest.sumElementsArray(ar1,4,5);
        assertNull(res);
        res = MethodsForTest.sumElementsArray(ar,0,9);
        assertNull(res);
        res = MethodsForTest.sumElementsArray(ar,-1,5);
        assertNull(res);
        res = MethodsForTest.sumElementsArray(ar,4,-1);
        assertNull(res);
        res = MethodsForTest.sumElementsArray(ar,9,5);
        assertNull(res);
        res = MethodsForTest.sumElementsArray(ar,ar.length,5);
        assertNull(res);
        res = MethodsForTest.sumElementsArray(ar,4,ar.length);
        assertNull(res);
        res = MethodsForTest.sumElementsArray(ar,6,1);
        assertNull(res);

    }
}


