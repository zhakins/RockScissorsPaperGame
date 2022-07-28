import java.util.Random;

public class Robot implements IFRockScissorsPaper {
    private String name;
    private int wins;

    Robot() {
        this.name = "Азамат";
        this.wins = 0;
    }

    Robot(String name, int wins) {
        this.name = name;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    int RandomGenerate() {
        Random rand = new Random();
        int generateResult = rand.nextInt(ROCK, PAPER + 1);

        return generateResult;
    }
}
