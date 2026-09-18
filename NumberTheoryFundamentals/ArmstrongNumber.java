package NumberTheoryFundamentals;

import java.util.*;

public class ArmstrongNumber {
    public static Boolean CheckArmstrong(Integer N) {
        Integer originalInteger = N;
        Integer sum = 0;
        Integer count = CountDigits(N);
        while (N > 0) {
            sum += (int) Math.pow(N % 10, count);
            N = N / 10;
        }
        if (sum.equals(originalInteger)) {
            return true;
        } else
            return false;
    }

    public static Integer CountDigits(Integer N) {
        int count = 0;
        while (N > 0) {
            N = N / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer armstrong = sc.nextInt();
        sc.close();
        if (CheckArmstrong(armstrong) == true) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
