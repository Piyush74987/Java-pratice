package basic_program;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number");
        Scanner in =new Scanner (System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("the given number "+n+" is a even number");
        }
        else{
            System.out.println("the given number "+n+" is a odd number");
        }
    }
}
//output
//        Please Enter the Number
//        5
//        the given number 5 is a odd number
//
//        Please Enter the Number
//        10
//        the given number 10 is a even number

