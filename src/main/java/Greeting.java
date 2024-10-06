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

        System.out.printf(
                """
                Hello, %s!
                Choose a game to play:
                1: SCM
                2: OtherGame
                """, name);
    }


}
