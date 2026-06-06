package less14_h_w_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//2026-05-31 Home Work 10.1.1 но похоже это старое задание

public class MethodsForTest_hW_10 {
    public static int parseAndSum(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isBlank() || s2.isBlank()) {
            return -1;
        }
        String trimmedS1 = s1.trim();
        String trimmedS2 = s2.trim();
        String pureNumberPattern = "^-?\\d+$"; // паттерн на любой символ между цифрами (строка должна содержать ТОЛЬКО необязательный минус в начале и цифры.)
        if (!trimmedS1.matches(pureNumberPattern) || !trimmedS2.matches(pureNumberPattern)) {
            System.out.println("Error: bad input!"); // проверка если после очистки ничего не осталось
            return -1;
        }

        int num1 = Integer.parseInt(trimmedS1);
        int num2 = Integer.parseInt(trimmedS2);
        return num1 + num2;
    }

    @Test
    public void testIsparseAndSum() {
        // Positive tests:
        int res = MethodsForTest_hW_10.parseAndSum("12", "3");
        assertEquals(15, res);
        res = MethodsForTest_hW_10.parseAndSum("0", "3");
        assertEquals(3, res);
        res = MethodsForTest_hW_10.parseAndSum("12", "0");
        assertEquals(12, res);
        res = MethodsForTest_hW_10.parseAndSum("0", "0");
        assertEquals(0, res);
        res = MethodsForTest_hW_10.parseAndSum("-12", "3");
        assertEquals(-9, res);
        res = MethodsForTest_hW_10.parseAndSum("12", "-3");
        assertEquals(9, res);
        res = MethodsForTest_hW_10.parseAndSum("-12", "-3");
        assertEquals(-15, res);

        // Negative tests:
        res = MethodsForTest_hW_10.parseAndSum("", "3");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum("12", "");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum("12", " ");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum(" ", "3");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum("1 2", "3");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum("12", "3 2");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum(" 12", " 3");
        assertEquals(15, res);
        res = MethodsForTest_hW_10.parseAndSum("12", "3cd2");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum("12", "3\\2");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum("1Ё2", "3");
        assertEquals(-1, res);
        res = MethodsForTest_hW_10.parseAndSum("\5","3");
        assertEquals(-1, res);

    }
}
