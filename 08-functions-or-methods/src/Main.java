import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Methods in Java!");
        sum();
        sum2(10, 15);
        swapTwoNums(10, 15);
    }
    static  void sum() {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }
    static  void sum2(int num1, int num2) { //parameters
        Scanner in =  new Scanner(System.in);
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    static void swapTwoNums(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}