import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        int ans=1;

        for(int i=n;i>0;i--){
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int ans=fact(n);
        System.out.println("Factorial of "+n+" is: "+ans);
    }
}
