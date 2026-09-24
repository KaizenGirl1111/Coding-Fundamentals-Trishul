package ConditionalAndLogic;

import java.util.Scanner;

public class GradeCalculator {
    public static String GradeCalculator(Integer in) {
        if (in > 90 && in <= 100) {
            return "A";
        } else if (in >= 75 && in <= 90) {
            return "B";
        } else if (in > 60 && in <= 75) {
            return "C";
        } else if (in > 50 && in <= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        System.out.println(GradeCalculator(N));
    }
}
