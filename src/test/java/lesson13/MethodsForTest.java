package lesson13;

public class MethodsForTest {
    // TDD разработка которая управляется тестами
    public static String concatStringArray(
            String[] strArray,
            int indexFirst,
            int indexSecond) {
        // проверка всего массива на null
//        for (String s : strArray) {
//            if (s == null) {
//                return null;
//            }
//        }

        if (strArray == null || strArray.length == 0
                || indexFirst < 0 || indexSecond < 0
                || indexFirst >= strArray.length
                || indexSecond >= strArray.length
                || strArray[indexFirst] == null //
                || strArray[indexSecond] == null //
        )
            return null;
        return strArray[indexFirst] + strArray[indexSecond];
    }
// как Д/З для двух строк  {"hello", "bye", "money", "happy", "null"} и {"yes", "no", "maybe"} = "byemaybe"
    public static String concatTwoStringArray(
            String[] strArray1, String[] strArray2,
            int indexFirst,
            int indexSecond) {
                if (strArray1 == null || strArray1.length == 0 ||strArray2 == null || strArray2.length == 0
                || indexFirst < 0 || indexSecond < 0
                || indexFirst >= strArray1.length//
                || indexSecond >= strArray1.length //
                || strArray1[indexFirst] == null //
                || strArray1[indexSecond] == null //
        )
            return null;
        return strArray1[indexFirst] + strArray2[indexSecond];
    }


    //20260529 in klass
    public static Integer sumElementsArray(
            int[] array,
            int indexFirst,
            int indexSecond){
        if (array == null || array.length == 0
                || indexFirst < 0
                || indexSecond < 0
                || indexFirst >= array.length
                || indexSecond >= array.length)
            return null;
        if (array[indexFirst] == Integer.MAX_VALUE && array[indexSecond] > 0)
            if (array[indexSecond] == Integer.MAX_VALUE && array[indexFirst] > 0)
                return null;
        if (array[indexFirst] == Integer.MIN_VALUE && array[indexSecond] < 0)
            return null;
        if (array[indexSecond] == Integer.MIN_VALUE && array[indexFirst] < 0)
            return null;
        return array[indexFirst] + array[indexSecond];
    }
}
/*
         0  1  2  3  4  5  indexFirst = 2 indexSecond = 4
array-> [9][2][7][1][4][8]
summ 7+4=11

              0        1       2       3         4
strArray-> ["hello"]["bye"]["money"]["happy"]["life"]
indexFirst = 1 indexSecond = 3
return "byehappy"

 */
