public class LoopPractice {
    public static void practiceWhileLoop() {
        int x = 0;
        while (x < 10) {
            System.out.println("The value of x is " + x);
            x++;
        }
    }

    public static void practiceDoWhile() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        }
        while (x < 10);
    }

    public static void practiceForLoop() {
        for (int i = 0; i < 20; i++) {
            System.out.println("The value of x is " + i);
            if (i == 10) {
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + "" + j + " ");
            }
        }
    }

    public static void main(String[] args) {
        practiceWhileLoop();
        practiceDoWhile();
        practiceForLoop();
    }
}