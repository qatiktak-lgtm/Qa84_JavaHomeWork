package h_w_09_L13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// HomeWork-09=2026-05-28
// # 1
public class MethodsForTestHW {
    public static int parseAndSum(String s1, String s2) {
        String badPattern = ".*\\\\\\s*\\d.*";
        if (s1 == null || s2 == null || s1.matches(badPattern) || s2.matches(badPattern)) {
            System.out.println("Error: bad input!");
            return -1;
        }
        if (s1.isBlank() || s2.isBlank()) {
            return -1;
        }
        String cleanS1 = s1.replaceAll("[^-0-9]", "");
        String cleanS2 = s2.replaceAll("[^-0-9]", "");

        if (cleanS1.isEmpty() || cleanS1.equals("-") || cleanS2.isEmpty() || cleanS2.equals("-")) {
            return -1;
        }

        int num1 = Integer.parseInt(cleanS1);
        int num2 = Integer.parseInt(cleanS2);
        return num1 + num2;

    }


    @Test
    public void testparseAndSum() {
        //PositivTests
        int res = MethodsForTestHW.parseAndSum("12", "3");
        assertEquals(15, res);
        res = MethodsForTestHW.parseAndSum("-5", "13");
        assertEquals(8, res);
        res = MethodsForTestHW.parseAndSum("0", "-3");
        assertEquals(-3, res);
        res = MethodsForTestHW.parseAndSum("-12", "3");
        assertEquals(-9, res);

        //NegativTests
        res = MethodsForTestHW.parseAndSum(" 12", "3a");
        assertEquals(15, res);
        res = MethodsForTestHW.parseAndSum("~!@#-$%^&*(+ 12", "3");
        assertEquals(-9, res);
        res = MethodsForTestHW.parseAndSum("ase 12", "3");
        assertEquals(15, res);
        res = MethodsForTestHW.parseAndSum("\0", "3");
        assertEquals(-1, res);

        res = MethodsForTestHW.parseAndSum("\\ 0", "3");
        assertEquals(-1, res);

        res = MethodsForTestHW.parseAndSum(" ", "3");
        assertEquals(-1, res);
        res = MethodsForTestHW.parseAndSum("", "3");
        assertEquals(-1, res);
    }
}
// # 2