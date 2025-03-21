import java.util.Scanner;

public class CountDigitsInNum {

    public static int totalDigits(int num){
        int cnt=0;

        while(num>0){
            num=num/10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        int ans=totalDigits(num);
        System.out.print("Total Digits in Num are: "+ans);
    }
}
