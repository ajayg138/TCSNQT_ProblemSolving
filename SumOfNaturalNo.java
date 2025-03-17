import java.util.Scanner;

public class SumOfNaturalNo {
    public static int SumN(int n){
        int ans = (n*(n+1))/2;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Sum of first "+n+" natural number is: "+SumN(n));
    }
}
