public class RecursionGOODLUCK {

    // f(f(f(a))) ---> a = 20
    // f(a) = 5 + a
    // f(20) = 5 + 20 = 25

    // f(f(f(20)))  ---> f(f(25))
    // f(25) = 5 + 25 = 30

    // f(f(25))  ---> f(30)

    // f(30) = 5 + 30 = 35

    // f(f(f(20))) ---> f(f(25)) ---> f(30) --> 35


    // 5+4+3+2+1+0; 7+6+5+4+3+2+1; 1; 2+1+0

    // 3 + 2 + 1

    public static int summation(int n) {
        // Base Case: WE ARE AT THE END
        if (n <= 0) {
            return 0;
        }
        // Recursive Case: KEEP GOING
        else {
            // Considering n = 3
            // 3 + summation(2) --> 3 + 2
            // 3 + 2 + summation(1) --> 3 + 2 + 1
            // 3 + 2 + 1 + summation(0) --> 3 + 2 + 1 + 0
            // 3 + 2 + 1 + 0 = 6
            return n + summation(n - 1);
        }
    }

    // 5! = 5 * 4 * 3 * 2 * 1 --> 5 * 4!
    // 4! = 4 * 3 * 2 * 1 --> 4 * 3!
    public static int factorial(int n) {
        // Base Case
        if (n <= 1) {
            return 1;
        }
        // Recursive Case
        else {
            // Considering n = 4
            // 4 * factorial(3) --> 4 * 3
            // 4 * 3 * factorial(2) --> 4 * 3 * 2
            // 4 * 3 * 2 * factorial(1) --> 4 * 3 * 2 * 1
            // 4 * 3 * 2 * 1 = 24
            return n * factorial(n - 1);
        }
    }

    // 5 ^ 3 = 5 * 5 * 5
    // 5 ^ 3 = 5 * 5^2 = 5 * 5^1 = 5 * 5^0 = 5 * 5 * 5 * 1
    public static int exponentiation(int n, int p) {
        // Base Case
        if (p <= 0) { // multiplicative identity
            return 1;
        }
        // Recursive Case
        else {

            // 5 * exponentiation(5, 2) --> 5 * 5
            // 5 * 5 * exponentiation(5, 1) --> 5 * 5 * 5
            // 5 * 5 * 5 * exponentiation(5, 0) --> 5 * 5 * 5 * 1
            // 5 * 5 * 5 * 1 = 125
            return n * exponentiation(n, p - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summation(5));
        System.out.println(factorial(4));
        System.out.println(exponentiation(4, 3));
    }
}