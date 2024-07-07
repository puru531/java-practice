import java.util.Scanner;

public class L3LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Q : find the largest of the three  numbers
        //My answer :
        if(a > b) {
            if(a > c) {
                System.out.println(a + " is largest.");
            } else {
                System.out.println(c + " is largest.");
            }
        } else if ( b > c) {
            System.out.println(b+ " is largest.");
        } else {
            System.out.println(c + " is largest");
        }

        //Answer :
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        System.out.println(max + " is largest.");


        //OR
        System.out.println(Math.max(c, Math.max(a, b)));
    }
}
