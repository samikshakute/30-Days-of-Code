// Intro to Conditional Statements
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N % 2 == 0 && (N < 6 || N > 20)) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }
    }
}
