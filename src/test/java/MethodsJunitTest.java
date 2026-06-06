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
        assertEquals("Hello world",res);

        res = MethodsJunitTest.insertForm("world", 0, "Hello ");
        assertEquals("Hello world",res);

    }
}


