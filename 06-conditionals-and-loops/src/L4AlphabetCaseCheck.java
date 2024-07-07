import java.util.Scanner;

public class L4AlphabetCaseCheck {
    public static void main(String[] args) {
        // take a character as an input and check if it is uppercase or lowercase.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);

//        My Answer :
        if(c >= 'a' && c <= 'z') {
            System.out.println("lowercase");
        }
        if(c >= 'A' && c <= 'Z') {
            System.out.println("Uppercase");
        }

//        Answer : same as above
    }
}
