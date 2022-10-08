import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

    public static void main(String[] args) {

//        howBigIsMyNumber(0);
//        howBigIsMyNumber(10);
//        howBigIsMyNumber(11);
//        howBigIsMyNumber(100);
//        howBigIsMyNumber(5);
//        howBigIsMyNumber(101);

        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to my game. Try and guess my impossible" + " number. It's between 0 and " + guessGame.max + " inclusive." + "Just type a number to get started");
        guessGame.play();
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU GOT IT BRO!");
                break;
            }
        }
    }
}