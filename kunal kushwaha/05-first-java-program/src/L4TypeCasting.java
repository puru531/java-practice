import java.util.Scanner;

public class L4TypeCasting {
    public static void main(String[] args) {
        //Type Conversion
        //When one type of data assigned to another type of variable, then automatic type conversions take place, when following conditions are met :
        //1. when two types are compatible : (float int long double), ( string char)
        //2. Destination type should be greater than the source type.
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(num); // Input : 12, Output : 12.0 --> integer automatically converted to float.
//
//

        //Type Casting (narrowing conversion) : Converting incompatible types (float --> int)
        int number = (int)(67.65f);
        System.out.println(number); //67

        // Automatic type promotion in expressions:
        int a = 257;
        byte b = (byte)(a); //maximum stored in byte = 256
        System.out.println(b); //1 ---> result is num % maximum value : 257 % 256 = 1


        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c * d) / e; // 40 * 50 / 100 --> 2000/100 --> 20
        // here 40 * 50 = 2000 is a value greater than maximum limit of byte, still it is able to do the calculations, because
        // while doing calculation, Java automatically promotes the byte to integer while evaluating the expression.
        System.out.println(f);


//        byte g = 50;
//        b = b * 2; //while evaluating b * 2 is converted to int and hence gives error that int cannot be stored in byte.




        int numm = 'a';
        System.out.println(numm); //97 --> Automatic type conversion, ASCII value of 'a' is given.


        //----------------- Rules of type promotion ------------------
        /*
        * Byte short are promoted to integer.
        * if any one operand is LONG, whole expression is promoted to LONG.
        * if any one operand is FLOAT, whole expression is promoted to FLOAT.
        * if any one operand is DOUBLE, whole expression is promoted to DOUBLE.
        * */

        //Java supports unicode values, so it can support all characters all languages (hindi, chinese, etc..)


    }
}
