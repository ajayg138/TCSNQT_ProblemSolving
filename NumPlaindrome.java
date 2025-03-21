import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class NumPlaindrome {

    public static boolean checkPalindrome(int n){
        int dupN=n;
        int rev=0;

        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }

        return dupN==rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        boolean ans=checkPalindrome(n);

        if(ans==true){
            System.out.print("Entered num is Palindrome...");
        }else{
            System.out.print("Entered num is not palindrome...");
        }
    }
}
