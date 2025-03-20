import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        //print Input
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] +" ");
//        }

        //dynamic Array using ArrayList
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
