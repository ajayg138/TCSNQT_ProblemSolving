public class SumOfArray {
    public static int arraySum(){
        int[] arr={1,2,3,41,10};

        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum = sum+arr[i];
        }

        return sum;
    }


    public static void main(String[] args) {

        int ans=arraySum();
        System.out.print("Sum of array element is: "+ans);
    }
}
