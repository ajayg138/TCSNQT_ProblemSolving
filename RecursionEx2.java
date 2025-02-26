import java.util.Scanner;

public class RecursionEx2 {
    int cnt=1;
    public void m1(int n){
        if(n>=1){
            System.out.println("Ajay");
            cnt++;
            m1(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        RecursionEx2 r=new RecursionEx2();
        r.m1(n);
    }
}
