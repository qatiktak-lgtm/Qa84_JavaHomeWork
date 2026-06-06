package lesson13;

import static org.junit.jupiter.api.Assertions.*;
public class MainJUnit {
    public static void main(String[] args) {
        int a = 5, b = 5;
        assertTrue(a == b); //прога падает т.к. ожидает True
        //assertFalse(a != b); // метод assert валит прогу если то что и удверждается - не верно

        String s1 = "Hello";
        String s2 = new String("Hello"); // и будет тот же рез-т, если записать String s1 = "Hello", s2 = "Hello";
        assertEquals(s2,s1);
        assertNotEquals(s2,s1);

        String s3 = null;
        assertNull(s3);
        //assertNotNull(s3);

        //fail("failed");  // валит прогу в той строке где стоит



        System.out.println("the end");


    }
}


//        int a = 5, b = 3;
//        assertTrue(a == b);
//
//        //boolean isOk = MethodsJunitTest.isPalindrome("level");
//        System.out.println("the end");
