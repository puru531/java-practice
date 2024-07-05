import java.util.Scanner;

public class Q3SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Find simple interest ---------------");
        System.out.print("Enter Principle amount : ");
        int principle = sc.nextInt();
        System.out.print("Enter Rate : ");
        int rate = sc.nextInt();
        System.out.print("Enter time in year : ");
        int time = sc.nextInt();

        int simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest : " + simpleInterest);
    }
}
