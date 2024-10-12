import java.util.Scanner;

public class Greeting {
    static public void startGame(){
        Scanner in = new Scanner(System.in);
        System.out.print(
                """
                Welcome to the Brain Games! May I have your name?
                My name is:\s
               \s""");
        String name = in.nextLine();
        while(true) {
            System.out.printf(
                    """
                    Hello, %s!
                    Choose a game to play:
                    1: Least Common Multiple
                    2: Missing Progression Number
                    """, name);

            AbstractNumberGame game = getGame();
            game.startGame();
        }
    }

    private static AbstractNumberGame getGame(){
        Scanner in = new Scanner(System.in);
        while(true) {
            int choice = in.nextInt();
            if (choice == 1) {
                return new NOKGame();
            } else if (choice == 2) {
                return new GPGame();
            } else {
                System.out.println("Ты что, глупенький? ;3");
            }
        }
    }

}
