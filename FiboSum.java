import java.util.Scanner;

public class FiboSum {
    public static int fibonacciSum(int n){
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series: "+ first +" "+second);
        int sum=first+second;

        for(int i=2;i<n;i++){
            int next=first+second;
            System.out.print(" "+next);
            sum = sum+next;
            first=second;
            second=next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();


        int ans = fibonacciSum(n);
        System.out.println('\n'+"Sum is: "+ans);
    }
}
