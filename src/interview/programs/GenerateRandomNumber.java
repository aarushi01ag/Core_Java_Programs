package interview.programs;
import java.util.Random;
public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random rn = new Random();
        System.out.println(rn.nextInt(4));
        //System.out.println();
        System.out.println(rn.nextInt());

        int number = (int) ((Math.random() * (1000 - 100) * 1) + 100);
        System.out.println(number);
        //System.out.println(Math.random());
        String s="123";
        int i=Integer.parseInt(s);
        System.out.println(i);


    }
}
