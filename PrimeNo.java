import java.util.Scanner;

public class PrimeNo {

    public static int checkEvenOdd(int n){
        int cnt=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args){
        System.out.println("Enter n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=checkEvenOdd(n);
        if(cnt==2){
            System.out.println("Prime...");
        }else{
            System.out.println("Not Prime...");
        }
    }
}
