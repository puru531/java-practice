import java.util.Scanner;

public class Ashish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int element;
        int count = 0;
        boolean isFound = false;

        System.out.print("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];

        //loop to enter elements in array
        for (int i = 0; i < size; i++) {
            System.out.print("enter" + i + "element");
            a[i] = sc.nextInt();
        }

        //loop to print elements in array
        System.out.println("Printing elements");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Enter the element you want to remove : ");
        element = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if(a[i]  != element) {
                count++;
            } else if(a[i] == element) {
                isFound = true;
                break;
            }
        }

//        for (int i = 0; i < size; i++) {
//            if (a[i] != element)
//                System.out.println("Element is not present in array");
//        }

        int x = count;

        for (int i = x; i < size - 1; i++) {
            a[i] = a[i + 1];
        }

        if (isFound) {
            System.out.println("The location of your inputed element is : " + x);
            size--;
        } else {
            System.out.println("Element is not present in array");
        }

        System.out.print("Updated array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
