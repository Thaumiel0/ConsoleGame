import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NOKGame implements Game {

    public NOKGame(){
    }

    private int getCorrectAnswer(int[] randomNums){
        int max = Math.max(Math.max(randomNums[0], randomNums[1]), randomNums[2]);
        
        return 0;
    }


    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void startGame() {
        int randomNOK = getRandomNumber(1, 100);
        int[] randomNums = new int[3];
        for (int i = 0; i < 3; i++) {
            randomNums[i] = getRandomNumber(1, 1000) * randomNOK;
        }



    }

    @Override
    public void showResults() {

    }
}
