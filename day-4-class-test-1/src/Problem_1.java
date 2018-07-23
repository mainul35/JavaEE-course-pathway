import java.util.Arrays;
import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        byte[] numbers = new byte[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<numbers.length; i++){
           byte number = sc.nextByte();
            if(number>=10 && number <=100){
                numbers[i] = number;
            }
        }

        for(byte i = 0; i<numbers.length; i++){
            boolean flag = false;

            for(byte j = 0; j<numbers.length; j++){
                if (i!=j){
                    if(numbers[i]==numbers[j]){
                       flag = true;
                       break;
                    }
                }
            }

            if (flag==false){
                System.out.println(numbers[i]);
            }
        }
    }
}
