import java.util.Scanner;

public class printAllDivisor {

    //Brute force approach...
    public static void divisor(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num=sc.nextInt();

        divisor(num);
    }
}
