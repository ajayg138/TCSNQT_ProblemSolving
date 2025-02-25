import java.util.ArrayList;
import java.util.Scanner;

public class printAllDivisor {

    //Brute force approach...
//    public static void divisor(int num){
//        for(int i=1;i<=num;i++){
//            if(num%i==0){
//                System.out.print(i+" ");
//            }
//        }
//    }

    //Optimal Approach
    public static ArrayList<Integer> divisor(int num){
        ArrayList<Integer> divisors=new ArrayList<>();

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                divisors.add(i);
                if(num/i != i){
                    divisors.add(num/i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num=sc.nextInt();

//        divisor(num);

        ArrayList<Integer> divisors = divisor(num);
        for(int ans:divisors){
            System.out.println(ans+" ");
        }
    }
}
