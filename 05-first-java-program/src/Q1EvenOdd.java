import java.util.Scanner;

public class Q1EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Check if a number is even or odd ---------------");
        System.out.print("Enter a number to check even/odd : ");
        int num = sc.nextInt();
        if(num%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}