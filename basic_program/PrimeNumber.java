package basic_program;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean prime=PrimeNumber.checkPrime(n);
        System.out.println(prime);


    }

    public static boolean checkPrime(int n){
        if(n%2==0){
            return false;
        }
        int i=3;
        while(i!=n/2){
            if(n%i==0){
                return false;
            }
            i++;
        }

        return true;
    }

}
