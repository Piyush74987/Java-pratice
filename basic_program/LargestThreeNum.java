package basic_program;
import java.util.Scanner;
class MathMaxLargest{
    int a,b,c;
    MathMaxLargest(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void show(){
        int max=Math.max(a,Math.max(b,c));
        System.out.println("this is using class");
        System.out.println("the Largest Number is "+max);
    }

}
public class LargestThreeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please Enter the Number");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b&&a>c){
            System.out.println("the Largest Number is "+a);
        }
        else if(b>a&&b>c){
            System.out.println("the Largest Number is "+b);
        }
        else{
            System.out.println("the Largest Number is "+c);
        }
        MathMaxLargest max=new MathMaxLargest(a,b,c);
        max.show();

    }
}
//output
//        Please Enter the Number
//        33
//        55
//        12
//        the Largest Number is 55
//        this is using class
//        the Largest Number is 55

