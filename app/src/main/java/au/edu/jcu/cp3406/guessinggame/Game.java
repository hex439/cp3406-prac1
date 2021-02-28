package au.edu.jcu.cp3406.guessinggame;
import java.util.Random;


public class Game {

    public int number;
    public boolean guessedCorrect;

    Random random = new Random();
    Integer number_temp = random.nextInt(11);

    public Game() {
        number = number_temp;
    }

    public Game(int number) {
        this.number = number;
    }


    public boolean check(int i) {
        return i == number;
    }
}
