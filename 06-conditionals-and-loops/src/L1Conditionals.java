public class L1Conditionals {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//
//        System.out.println("Hello world!" + n);
        int salary = 25000;
        if(salary > 10000) {
            salary = salary + 2000;
        } else  {
            salary = salary + 1000;
        }
        System.out.println(salary);

        //multiple if else
        if (salary > 20000) {
            salary += 2000;
        } else if (salary > 10000) {
            salary += 1000;
        } else { //if none of above are true
            salary += 500;
        }
    }
}