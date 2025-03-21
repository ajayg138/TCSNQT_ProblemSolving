import java.util.Scanner;

public class Arrmstrong {

    public static boolean checkArmstrong(int n){
        int dupN=n;
        int armNum=0;

        while(n>0){
            int ld=n%10;
            armNum=armNum+(ld*ld*ld);
            n=n/10;
        }

        return dupN==armNum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        boolean ans=checkArmstrong(n);
        if(ans==true){
            System.out.print("Entered Number is Armstrong number...");
        }else{
            System.out.print("Entered Number is Not Armstrong number...");
        }
    }

}
