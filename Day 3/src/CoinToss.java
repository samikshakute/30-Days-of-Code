import java.util.Random;

public class CoinToss {
    public String tossACoin() {
        Random rand = new Random();
        // Here abs is used to return the absolute value of a number
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
}