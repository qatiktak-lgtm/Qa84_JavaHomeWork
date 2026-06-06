package lesson13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitMethods {

    @Test
    public void concatStringArray() {
        String[] ar = {"hello", "", "money", "happy", "null"};
        String res = MethodsForTest.concatStringArray(ar, 0, 2);
        assertEquals("hellomoney", res);
        res = MethodsForTest.concatStringArray(ar, 0, 0);
        assertEquals("hellohello", res);
        res = MethodsForTest.concatStringArray(ar, 1, 2);
        assertEquals("money", res);
        res = MethodsForTest.concatStringArray(ar, 0, 4);
        assertEquals("hellonull", res);
        res = MethodsForTest.concatStringArray(ar, 4, 3);
        assertEquals("nullhappy", res);

        res = MethodsForTest.concatStringArray(null, 1, 3);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar, 1, 5);
        assertNull(res);
        String[]ar1 ={};
        res = MethodsForTest.concatStringArray(ar1, 1, 4);
        assertNull(res);
        String[]ar3 ={"hi","hello","life","\n"};
        res = MethodsForTest.concatStringArray(ar1,  1,  2);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar,  -1,  2);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar3,  2,  -2);
        assertNull(res);

        String restwo = MethodsForTest.concatTwoStringArray(new String[]{"hello", "bye", "money", "happy", "null"},
                new String[] {"yes", "no", "maybe"},1, 2);
        assertEquals( "byemaybe", restwo);




    }

    @Test
    public void sumElementsArray() {

    }
}
