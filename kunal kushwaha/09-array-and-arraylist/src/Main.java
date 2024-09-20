public class Main {
    public static void main(String[] args) {
        /*
         Array : Collection of similar types of data

         Syntax :
         datatype[] variable_name = new datatype[size];
        */
        int[] roll_nos = new int[5]; //by default all the elements are zero.

        //simplified break down
        int[] roll_no; //declaration of array, roll_no is getting defined in the stack.
        roll_no = new int[5]; //initialization : actually here, object is being created in the memory. (heap memory)



        //or directly put values
        int[] roll_nos2 = {13,64,58,8,6}; //all data should be same data type.



        //String array
        String[] strArr = new String[4]; // [null, null, null, null] --> by default all are null, any reference variable, in which values are not assigned have default value as null

        //null can only be assigned to non-primitives, I cannot be assigned to primitive data type variables.
        String str = null; //valid
        //int num = null; //error




    }
}