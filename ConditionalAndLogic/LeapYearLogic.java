package ConditionalAndLogic;

import java.util.*;

public class LeapYearLogic {
    public static Boolean Leap(Integer year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer year = sc.nextInt();
        sc.close();
        System.out.println(Leap(year));
    }
}
