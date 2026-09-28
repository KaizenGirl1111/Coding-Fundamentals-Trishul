package LoopsAndPatterns;

public class SumOfOddNumbersInRange {
    public static Integer SumOfOddNumbers(Integer A, Integer B) {
        Integer firstOdd = 0;
        Integer sum = 0;
        for (Integer i = A; i <= B; i++) {
            if (i % 2 == 1) {
                firstOdd = i;
                break;
            }
        }
        for (Integer i = firstOdd; i <= B; i += 2) {
            sum += i;
        }
        return sum;
    }

}
