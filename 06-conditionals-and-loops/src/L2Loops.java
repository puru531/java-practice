import java.util.Scanner;

public class L2Loops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        //for loop : when number of iteration is known
      /*
        for(initailization; condition; increment/decrement){
            body
        }
        */
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

//-----------------------------------------------------------------------------------------------------------

        //while loop : while number of iteration is not known
        /*
          Syntax :
          initialization;
          while(condition) {
            //body
            //increment / decrement
          }
        */

        int j = 0; //initialization
        while (j < 6) { //condition
            System.out.println(j); //body

            j++; //incemrent /decrement
        }

//        ---------------------------------------------------------------------------------------------------------


//        do-while : runs at least once
        /*
            initialization;
            do{
                //body
                //increment/decrement
            } while(condition)
        */
        int k = 0; // initialization
        do{//run at leats once
            System.out.println(k); //body

            k++; //incement / decrement
        } while(k < 6); //condition

    }
}
