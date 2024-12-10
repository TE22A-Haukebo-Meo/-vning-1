import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        if (6 >= 3) {
            System.out.println("Hello, World!");
        }
        Scanner tb = new Scanner(System.in);
        String user = tb.nextLine();
        String pass = tb.nextLine();
        if (user.equalsIgnoreCase("noname") && pass.equalsIgnoreCase("nopass")) {
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong username or password");
        }
        for (int i = 0; i < 32; i++) {
            System.out.println("Hello, World");
        }
        Boolean correct = false;
        while (!correct) {
            pass = tb.nextLine();
            if(pass.equalsIgnoreCase("nopass")){
                System.out.println("Gudd");
                correct=true;
            }
            else{
                System.out.println("Wrong ty agin");
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Gimme number");
            String tal = tb.nextLine();
            if (Integer.parseInt(tal) >5) {
                System.out.println("Larger than 5");
            }
        }
        boolean temp = false;
        while (!temp) {
            String bomba = tb.nextLine();
            try {
                int nummer = Integer.parseInt(bomba);
                temp = true;
            } catch (Exception e) {
                System.out.println("Incorrect! try agian");
            }
        }
    }
}
