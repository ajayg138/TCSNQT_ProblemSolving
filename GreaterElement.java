import java.util.Scanner;

public class GreaterElement {
//    public static int countGreaterElement(int[] arr){
//        int n=arr.length;
//        int cnt = 1;
//
//        for(int i=1;i<n;i++){
//            boolean isGreater=true;
//            for(int j=0;j<i;j++){
//                if(arr[j]>arr[i]){
//                    isGreater=false;
//                    break;
//                }
//            }
//            if(isGreater){
//                cnt++;
//            }
//        }
//        return cnt;
//    }


    public static int countGreaterElement(int[] arr){
        int n=arr.length;
        int cnt=1;
        int maxSoFar=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > maxSoFar){
                cnt++;
                maxSoFar=arr[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=countGreaterElement(arr);
        System.out.print(ans);
    }
}
