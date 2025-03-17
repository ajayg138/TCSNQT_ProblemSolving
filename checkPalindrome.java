import java.util.Scanner;

public class checkPalindrome {
    public static boolean checkNum(int n){
        int dupN=n;
        int rev=0;

        while(n>0){
            int ld = n%10;
            rev = rev*10 + ld;
            n=n/10;
        }

        if(dupN==rev){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        boolean ans = checkNum(n);
        if(ans==true){
            System.out.println("Entered Number is Palindrome...");
        }else{
            System.out.println("Entered Number is not Palindrome...");
        }
    }
}
