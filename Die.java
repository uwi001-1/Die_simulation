import java.util.Random;

public class Die {
    protected int value;
    protected static Random rand = new Random();

    // Constructor rolls the die upon creation
    public Die() {
        roll();
    }

    // Standard roll generates a random number from 1 through 6
    public void roll() {
        value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }
}