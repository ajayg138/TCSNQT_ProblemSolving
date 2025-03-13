import java.util.Scanner;

public class Fibo {

    public static void fibonacciSeries(int n){
        int first = 0;
        int second = 1;
        System.out.print("Fibbonaci Series: "+first +" "+second);

        for(int i=2; i<n;i++){
            int next=first+second;
            System.out.print(" "+next);
            first=second;
            second=next;
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n=sc.nextInt();

        fibonacciSeries(n);
    }
}
