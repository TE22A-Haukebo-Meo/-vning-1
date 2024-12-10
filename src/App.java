import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner tb = new Scanner(System.in);
        int answer = rand.nextInt(1,10);
        int guess = 0;
        while (guess != answer) {
            System.out.println("Gimmenumber");
            try {
                guess = tb.nextInt();
                if (guess > answer) {
                    System.out.println("Too high");
                }
                else if (guess < answer) {
                    System.out.println("Too low");
                }
            } catch (Exception e) {
                System.out.println("So not sigma write number");
                tb.nextLine();
            }
        }
        System.out.println("GJ");
    }
}
