package basic_program;
import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int a=in.nextInt();
        int b=in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The swap value of a is "+a+" and b is "+b);
    }
}
//output
//    Please Enter the Number
//    10
//    20
//    The swap value of a is 20 and b is 10