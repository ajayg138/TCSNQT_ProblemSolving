import java.util.Scanner;

public class SumOfNaturalNo {

    //by using formula...
//    public static int SumN(int n){
//        int ans = (n*(n+1))/2;
//
//        return ans;
//    }

    //by using loop
    public static int SumN(int n){
        int sum=0;

        for(int i=0;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Sum of first "+n+" natural number is: "+SumN(n));
    }
}
