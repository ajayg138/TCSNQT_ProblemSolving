import java.util.HashMap;
import java.util.Scanner;

public class OddBalloon {
//Brute force Approach
//    public static String findAllBalloons(char[] balloons){
//        int n = balloons.length;
//        boolean allEven = true;
//
//        for(int i=0;i<n;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(balloons[i]==balloons[j]){
//                    count++;
//                }
//            }
//            if (count%2 != 0){
//                return "First odd balloon color" + balloons[i];
//            }
//        }
//        return "All are Even...";
//

    public static String findAllBalloons(char[] balloons){
        HashMap<Character, Integer> frequencyMap=new HashMap<>();

        for(char balloon : balloons){
            frequencyMap.put(balloon,frequencyMap.getOrDefault(balloon,0)+1);
        }

        for(char balloon:balloons){
            if(frequencyMap.get(balloon)%2 != 0){
                return "First odd balloon color "+balloon;
            }
        }
        return "All are Even";
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
