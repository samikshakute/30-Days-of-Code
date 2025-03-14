// Day 6: Let's Review
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String[] str = new String[T];
        for (int i = 0; i < T; i++) {
            str[i] = in.next();
        }

        for (int i = 0; i < T; i++) {
            char[] c = str[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(c[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < c.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
    }
}