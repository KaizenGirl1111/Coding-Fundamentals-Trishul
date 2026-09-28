package ConditionalAndLogic;

import java.util.*;

public class VoterEligiblity {
    public static void VoterEligiblityMultipleConditions(Integer A, Integer C, Integer D) {
        if (A > 18 && C == 1 && D != 1) {
            System.out.println("Eligible");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not Eligible- ");
        if (A <= 18 || C != 1 || D == 1) {
            if (A <= 18) {
                sb.append("Too young,");
            }
            if (C != 1) {
                if (sb.charAt(sb.length() - 1) == ',') {
                    sb.append(" ");
                }
                sb.append("Not a citizen,");
            }
            if (D == 1) {
                if (sb.charAt(sb.length() - 1) == ',') {
                    sb.append(" ");
                }
                sb.append("Disqualified");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        sc.close();
        VoterEligiblityMultipleConditions(A, B, C);
    }
}
