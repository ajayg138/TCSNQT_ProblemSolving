import java.util.Scanner;

public class PalindromNum {

    public static void checkPalindrome(int num){
        int rev=0;
        int dupNum=num;
        while(num>0){
            int ld=num%10;
            rev=(rev*10)+ld;
            num=num/10;
        }

        if(rev==dupNum){
            System.out.println("Entered Number is Palindrome...");
        }else{
            System.out.println("Entered Number is not a Palindrome...");
        }

//        return rev==num;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num=sc.nextInt();

//        boolean ans=checkPalindrome(num);

        checkPalindrome(num);
//        if(ans==true){
//            System.out.println("Entered Number is Palindrome...");
//        }else{
//            System.out.println("Entered Number is not Palindrome...");
//        }
    }
}
