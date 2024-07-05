import java.util.Scanner;

public class Q2Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Greet user ---------------");
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("Hello "+ name+"!");
    }
}
