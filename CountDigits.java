import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int n){
        int cnt=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int ans=countDigits(n);
        System.out.println("Number of digits in "+n+" is "+ans);
    }
}
