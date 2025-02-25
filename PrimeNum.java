import java.util.Scanner;

public class PrimeNum {
    //Brute Force Approach

//    public static void checkPrime(int n){
//        int cnt=0;
//
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                cnt++;
//            }
//        }
//        if(cnt==2){
//            System.out.println("Prime Number it is...");
//        }else{
//            System.out.println("Not a Prime Number...");
//        }
//    }

    //Optimal Approach
    public static void checkPrime(int n){
        int cnt=0;

        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(i != n/i){
                    cnt++;
                }
            }

        }
        if(cnt==2){
            System.out.println("Prime Number it is...");
        }else{
            System.out.println("Not a Prime Number...");
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();

        checkPrime(num);
    }
}
