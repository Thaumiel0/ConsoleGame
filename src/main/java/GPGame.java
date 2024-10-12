import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GPGame extends AbstractNumberGame{

    public GPGame(){
        System.out.println("What number is missing from the progression?");
    }

    private ArrayList<Integer> generateProgression(int startNumber, int lenght, int ratio){
        ArrayList<Integer> progression = new ArrayList<Integer>();
        int current = startNumber;
        for (int i = 0; i < lenght; i++) {
            progression.add(current);
            current *= ratio;
        }
        return progression;
    }

    @Override
    public int getQuestion() {
        int startNumber = GameUtil.getRandomNumber(1, 5);
        int ratio = GameUtil.getRandomNumber(2, 3);
        int length = GameUtil.getRandomNumber(5, 10);
        ArrayList<Integer> progression = generateProgression(startNumber, length, ratio);
        int propusk = GameUtil.getRandomNumber(0, length-1);
        System.out.print("Question: ");
        for (int i = 0; i < length; i++) {
            if(i == propusk){
                System.out.print("... ");
                continue;
            }
            System.out.print(progression.get(i) + " ");
        }
        System.out.println();
        return progression.get(propusk);
    }
}
