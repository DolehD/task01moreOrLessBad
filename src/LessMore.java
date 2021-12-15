import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LessMore {
    static final int RAND_MAX = Integer.MAX_VALUE;
    static final int randomNumber = rand(1, 100);

    static int rand(int min, int max) {
        return (int) ((Math.random() * (++max - --min)) + min);
    }

    static int rand() {
        Random rand = new Random();
        return rand.nextInt(RAND_MAX);
    }

    public static void main(String[] args) {
        List<Integer> numberOfInput = new ArrayList<>();
        int resultNumber = rand(1, 100);
        System.out.println("TRY TO FIND A NUMBER FROM 1 TO 100");
        Scanner s = new Scanner(System.in);
        int num = Integer.MIN_VALUE;

        while (num != resultNumber) {
           try {
               String str = s.nextLine();
               num = Integer.parseInt(str);
           } catch (Exception e){
               System.out.println("WRONG INPUT");
               continue;
           }
            if (num < resultNumber) {
                numberOfInput.add(num);
                System.out.println("go more, result is between " + num + " and " + (resultNumber));
            }
            if (num > resultNumber) {
                numberOfInput.add(num);
                System.out.println("go less, result is between " + (resultNumber) + " and " + num);
            }
        }
        System.out.println("Correct! your previous tries are printed below \n" + numberOfInput);
    }
}
