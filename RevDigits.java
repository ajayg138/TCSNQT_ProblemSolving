import java.util.Scanner;

public class RevDigits {

    public static int ReverseNum(int num){
        int rev=0;
        while(num>0){
            int ld = num%10;
            rev=(rev*10)+ld;
            num=num/10;
         }

        return rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num=sc.nextInt();

        int ans=ReverseNum(num);
        System.out.println(ans);

    }
}
