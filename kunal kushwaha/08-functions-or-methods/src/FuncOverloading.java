public class FuncOverloading {
    public static void main(String[] args) {
    fun(56);
    fun("Hello");
    }

    //function overloading happens when two or more functions are of same name ---> given that parameter type is different, or number of parameters are different
    static void fun(int a) {
        System.out.println(a);
    }
    static  void fun(String a) {
        System.out.println(a);
    }
}
