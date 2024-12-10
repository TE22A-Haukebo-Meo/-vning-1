import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        if (6 >= 3) {
            System.out.println("Hello, World!");
        }
        Scanner tb = new Scanner(System.in);
        String user = tb.nextLine();
        if (user == "noname") {
            System.out.println("Welcome");
        }
        
    }
}
