import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,7,8,9);
        fun(2,3,5,7,8,9,58,78,65,89,125,59,15,469);

        multiple(5,6,68,6,9,79,6,458,65,6);
    }

    //when we do not how many arguments we are passing.
    static void fun(int ...v) { //it will take array of integers   OR  (String ...v) --> This will take array of string
        System.out.println(Arrays.toString(v)); //prints items in array
    }


    //mix of arguments
    static void multiple(int a, int b, int ...many){ //variable length argument should always be at end.
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(many));
    }
}
