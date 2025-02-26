public class RecursionEx {
    int cnt=0;
    public void m1(){
        if(cnt == 4){
            System.out.println(cnt);
        }else{
            System.out.println(cnt);
            cnt++;
            m1();
        }
    }

    public static void main(String[] args) {
        RecursionEx r=new RecursionEx();
        r.m1();
    }
}
