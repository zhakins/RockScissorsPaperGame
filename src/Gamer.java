import java.util.Scanner;

public class Gamer implements IFRockScissorsPaper {
    private String name;
    private int wins;

    public Gamer() {
        name = "Игрок";
        wins = 0;
    }

    public Gamer(String name, int wins) {
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

    int generate() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextInt();
        return result;
    }
}
