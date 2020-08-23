package 本周作业;

/**
 * @author xie
 * @description  爬楼梯
 */
public class ClimbingStairs {
    public int climbing(int n){
        int a=0,b=1;
        while (n-->0){
            a=(b+=a)-a;
        }
        return b;
    }

    public static void main(String[] args) {
       int m=new ClimbingStairs().climbing(10);
        System.out.println(m);
    }
}
