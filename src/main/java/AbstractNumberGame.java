import java.util.Scanner;

abstract public class AbstractNumberGame{

    protected int correctAnswer;

    public void startGame(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            correctAnswer = getQuestion();
            System.out.print("Answer: ");
            showResult(in.nextInt());
        }
    };

    abstract public int getQuestion();

    public void showResult(int userAnswer){
        System.out.println("Your answer: " + userAnswer);
        if (userAnswer == correctAnswer){
            System.out.println("Correct!");
        }
        else {
            System.out.printf("'%s' is incorrect. The correct answer was '%s', dummy :3 %n", userAnswer, correctAnswer);
        }
    }


}
