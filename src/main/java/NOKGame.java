import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NOKGame extends AbstractNumberGame{

    public NOKGame(){

    }

//    private int getCorrectAnswer(int[] randomNums){
//        int max = Math.max(Math.max(randomNums[0], randomNums[1]), randomNums[2]);
//        return 0;
//    }


    private int gcd(int a, int b){
        int result = Math.min(a,b);
        while (result > 1){
            if((a % result == 0) && (b % result == 0)) break;
            result--;
        }
        return result;
    }


    private int findGCD(int arr[])
    {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            result = gcd(arr[i], result);

            if(result == 1)
            {
                return 1;
            }
        }
        return result;
    }


    private int findLCM(int arr[]){
        int product = 1;
        for (int i: arr) {
            product *= i;
        }
        return product/findGCD(arr);
    }


    @Override
    public void startGame() {

    }

    @Override
    public void getQuestion() {

    }
}
