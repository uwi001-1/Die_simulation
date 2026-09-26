public class LoadedDie extends Die {

    // Overridden roll method generates a random number from 2 through 6
    @Override
    public void roll() {
        value = rand.nextInt(5) + 2;
    }
}