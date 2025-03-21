import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class Divisor {
    //Brute force Approach

//    public static void printDivisor(int n){
//
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
//    }

    //Optimal Approach

    public static ArrayList<Integer> printDivisor(int n){
        ArrayList<Integer> divisors=new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                divisors.add(i);
                if(n/i != i){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

//        printDivisor(n);
        ArrayList<Integer> divisors=printDivisor(n);
        for(int divisor:divisors){
            System.out.println(divisor);
        }

    }
}
