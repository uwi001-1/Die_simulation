public class TestLoadedDie {
    public static void main(String[] args) {
        final int SIMULATIONS = 1000;

        // Part 1: Regular Die vs. Regular Die
        int regularWins = 0;
        for (int i = 0; i < SIMULATIONS; i++) {
            Die die1 = new Die();
            Die die2 = new Die();
            
            // Re-roll to ensure fresh independent values each iteration
            die1.roll();
            die2.roll();

            if (die1.getValue() > die2.getValue()) {
                regularWins++;
            }
        }

        // Part 2: Regular Die vs. Loaded Die
        int regularVsLoadedWins = 0;
        for (int i = 0; i < SIMULATIONS; i++) {
            Die regularDie = new Die();
            LoadedDie loadedDie = new LoadedDie();

            regularDie.roll();
            loadedDie.roll();

            if (regularDie.getValue() > loadedDie.getValue()) {
                regularVsLoadedWins++;
            }
        }

        // Display the results
        System.out.println("==========================================");
        System.out.println("          DIE SIMULATION RESULTS          ");
        System.out.println("==========================================");
        System.out.println("Total rounds per test: " + SIMULATIONS);
        System.out.println();
        System.out.println("1. Regular Die vs. Regular Die:");
        System.out.println("   - First Die won " + regularWins + " times.");
        System.out.println();
        System.out.println("2. Regular Die vs. Loaded Die (values 2-6):");
        System.out.println("   - Regular Die won " + regularVsLoadedWins + " times.");
        System.out.println("==========================================");
    }
}