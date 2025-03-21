import java.util.Scanner;

public class PrimeOrNot {

//    public static int checkPrime(int n){
//        int divisor=0;
//
//        for(int i=1;i<n;i++){
//            if(n%i==0){
//                divisor++;
//            }
//        }
//        return divisor;
//    }

    public static int checkPrime(int n){
        int divisor=0;

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                divisor++;
            }
            if(n/i != i){
                divisor++;
            }
        }

        return divisor;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int ans=checkPrime(n);
        if(n==2){
            System.out.print(n+" is prime no....");
        }else{
            System.out.print(n+" is not a prime no....");
        }
    }
}
