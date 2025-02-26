import java.util.Scanner;

public class GCD {
    public static int greatestCommonDivisor(int n1,int n2){
        int gcd=1;

        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }

        return gcd;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1=sc.nextInt();

        System.out.print("Enter n2: ");
        int n2=sc.nextInt();

        int ans = greatestCommonDivisor(n1,n2);

        System.out.println("GCD of "+n1 +" and "+n2+" is "+ans);
    }
}
