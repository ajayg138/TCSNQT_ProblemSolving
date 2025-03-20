import java.util.Scanner;

public class StarHash {
    public static int requireCnt(String str){
        int cnt_star = 0;
        int cnt_hash = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                cnt_star++;
            }else if(str.charAt(i)==('#')) {
                cnt_hash++;
            }
        }

        return cnt_star - cnt_hash;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();

        int ans = requireCnt(str);
        System.out.print(ans);
    }
}
