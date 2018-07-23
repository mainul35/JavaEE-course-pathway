import java.util.Random;
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int  guessedNumber = rand.nextInt(100-10);

        String randomMessage[] = {"The number is in between : %d - %d", "The number is dividable by: %d"};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<10; i++){
            int input = sc.nextInt();

            if(guessedNumber==input){
                System.out.println("Congratulations! You have found the number!");
                break;
            } else if(guessedNumber!=input){
                if(i>2){
                    int pickedRandMsg = rand.nextInt(2-1);
                    if(randomMessage[pickedRandMsg].contains("The number is in between")){
                        System.out.printf(randomMessage[pickedRandMsg], (guessedNumber-5), (guessedNumber+5));
                    }else if(randomMessage[pickedRandMsg].contains("The number is dividable by")){
                        for(int div = 2; div <6; div++){
                            if(guessedNumber%div==0){
                                System.out.printf(randomMessage[pickedRandMsg], div);
                            }
                        }
                    }
                }
                if(i>9){
                    System.out.println("Play again!!!");
                    break;
                }
                System.out.println("\nTry with another input!");
            }
        }
    }
}
