import java.util.Scanner;

public class OddBalloon {

    public static String findAllBalloons(char[] balloons){
        int n = balloons.length;
        boolean allEven = true;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(balloons[i]==balloons[j]){
                    count++;
                }
            }
            if (count%2 != 0){
                return "First odd balloon color" + balloons[i];
            }
        }
        return "All are Even...";

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Balloons: ");
        int n=sc.nextInt();

        char[] balloons=new char[n];
        System.out.print("Enter Balloons Color: ");
        for(int i=0;i<n;i++){
            balloons[i]=sc.next().charAt(0);
        }

        String res=findAllBalloons(balloons);
        System.out.println(res);
    }
}
