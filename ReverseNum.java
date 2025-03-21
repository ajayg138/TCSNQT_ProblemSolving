import java.util.Scanner;

public class ReverseNum {

    public static int reverseNum(int n){
        int rev=0;

        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int ans=reverseNum(n);
        System.out.print("Reverse of Number is "+ans);

    }
}
