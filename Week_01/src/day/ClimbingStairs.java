package day;

/**
 * @author xie
 * @description 70.爬楼梯
 * @date 2020/7/27 17:29
 */
public class ClimbingStairs {
    /*
    分析：使用数学归纳法  当楼梯只有一层，1种走法，  两层 两种走法 1,2  三层3种走法，分别是一层加两层，因为要走上第三层的上一步可以在一层和两层处
    所以后一层的走法，等于前一层加前两层的走法
     */
    public int climbStairs(int n){
        int a=1,b=1;
        while (n-->0){
            a=(b+=a)-a;  // b=b+a代表的是后两层  (b+=a)-a 代表的是后一层
        }
        return a;
    }

    //使用动态数组
    public int climbStairs2(int n){
        int p=0,q=0,r=1;
        while (n-->0){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(2));
        System.out.println(climbingStairs.climbStairs2(2));
    }
}
