import java.util.Scanner;

//сущность, описывающая игровое поле
public class Field {
    Scanner scanner = new Scanner(System.in);
    GameLogic gm = new GameLogic();

    void menu() {
        String[] options = {"1- Начало игры",
                "2- Показать счет игры",
                "3- Показать статистику",
                "4- Exit",
        };

        int option = 1;
        while (option != 4) {
            printMenu(options);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Начало игры");
                    gm.start();
                    break;
                case 2:
                    System.out.println("Счет игры: ");
                    System.out.println("Вернуться в меню: 1");
                    System.out.println("выход:4");
                    if (exitmenu() == 1) break;
                    else option = 4;
                    continue;

                case 3:
                    System.out.println("Статистика: ");
                    System.out.println("Количество побед Игрока " + gm.getGamer().getWins());
                    System.out.println("Количество побед Робота " + gm.getRobot().getWins());
                case 4:
                    System.out.println("Выход ");
                    break;
            }

        }

    }

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    int exitmenu() {
        Scanner scanner = new Scanner(System.in);
        int yesNO = 3;
        yesNO = scanner.nextInt();
        return yesNO;
    }
}
