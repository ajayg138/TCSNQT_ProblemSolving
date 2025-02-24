import java.util.Scanner;

public class ReverseDigits {
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int n=sc.nextInt();

        int ans=reverse(n);

        System.out.print("Reverse of "+n+" is "+ans);
    }
}
