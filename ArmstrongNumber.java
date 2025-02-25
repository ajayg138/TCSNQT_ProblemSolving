import java.util.Scanner;

public class ArmstrongNumber {
    public static void checkArmstrong(int num){
        int armNum=0;
        int dupNum=num;

        while(num>0){
            int ld=num%10;
            armNum=armNum+(ld*ld*ld);
            num=num/10;
        }

        if(armNum==dupNum){
            System.out.println("Armstrong Number...");
        }else{
            System.out.println("Not an Armstrong NUmber...");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num=sc.nextInt();

        checkArmstrong(num);
    }
}
