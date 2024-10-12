public class NOKGame extends AbstractNumberGame{

    public NOKGame(){
        System.out.println("Find the smallest common multiple of these 3 funny numbers :3");
    }

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
    public int getQuestion() {
        int[] numbers = new int[3];
        System.out.print("Question: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = GameUtil.getRandomNumber(1, 50);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        return findLCM(numbers);
    }
}
