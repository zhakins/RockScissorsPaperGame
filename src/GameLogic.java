import java.util.Scanner;

//одержит бизнес-логику игры
public class GameLogic implements IFRockScissorsPaper {
    Robot robot = new Robot();
    Gamer gamer;
    int win = 1;

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public GameLogic(Robot robot, Gamer gamer) {
        this.robot = robot;
        this.gamer = gamer;
    }

    public GameLogic() {
        robot = new Robot();
        gamer = new Gamer();
    }

    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }


    void start() {
        if (gamer.getName().isEmpty()) {
            System.out.println("Заполните имя Игрока");
            Scanner scanner = new Scanner(System.in);
            gamer.setName(scanner.nextLine());
        }
        int i = robot.RandomGenerate();
        int j = gamer.generate();

        if (i == j) {
            System.out.println("Ничья");
        } else if (i == ROCK && j == SCISSORS) {
            System.out.println("Камень-ножницы, Робот победил");

            robot.setWins(win);
        } else if (i == SCISSORS && j == PAPER) {
            System.out.println("ножницы-бумага, Робот победил");

            robot.setWins(++win);
        } else if (i == PAPER && j == ROCK) {
            System.out.println("бумага-камень, Робот победил");

            robot.setWins(win);
        } else if (j == ROCK && i == SCISSORS) {
            System.out.println("Камень-ножницы, " + gamer.getName() + " победил");

            gamer.setWins(win);

        } else if (j == SCISSORS && i == PAPER) {
            System.out.println("ножницы-бумага, " + gamer.getName() + " победил");

            gamer.setWins(win);
            ;
        } else if (j == PAPER && i == ROCK) {
            System.out.println("бумага-камень, " + gamer.getName() + " победил");

            gamer.setWins(win);
        }
    }


}
