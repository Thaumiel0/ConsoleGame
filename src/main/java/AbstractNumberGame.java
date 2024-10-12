abstract public class AbstractNumberGame{


    abstract public void startGame();

    abstract public void getQuestion();

    public void showResult(int userAnswer, int correctAnswer){
        System.out.println("Your answer: " + userAnswer);
        if (userAnswer == correctAnswer){
            System.out.println("Correct!");
        }
        else {
            System.out.printf("'%s' is incorrect. The correct answer was '%s', dummy :3 %n", userAnswer, correctAnswer);
        }
    }


}
