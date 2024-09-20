import java.util.Scanner;

public class L5Fibonacci {
    public static void main(String[] args) {
        //Fibonacci number : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...... keeps on adding previous two numbers
        //Q : Find the nth fibonacci number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //My Answer :
        int prev1 = 0;
        int prev2 = 1;
        int curr = 0;
//        System.out.print("0, 1");
        for (int i = 2; i <= num; i++) {
            curr = prev1 + prev2;
//            System.out.print(", " + curr);
            prev1 = prev2;
            prev2 = curr;
        }
        System.out.println(num + "th fibonacci number is : " + curr);



        //Solution :
        int p = 0;
        int i = 1;
        int count = 2;
        while(count <= num) {
            int temp = i;
            i = i+p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
