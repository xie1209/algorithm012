package day;

/**
 * @author xie
 * @description 70.爬楼梯 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢
 * @date 2020/7/20 9:04
 */
public class ClimbStaris {
    //解法一 非递归优化  使用while来代替for循环
    public int climbStaris(int n){
        //使用动态规划解决  1 2 3 5 8 13
        //复杂度 O(n)
        if(n<=3) return n;
        int first=1,second=2,sum=3;
        while (n-- > 3){
            first=second;
            second=sum;
            sum=first+second;
        }
        return sum;
    }
    //解法二 使用尾递归  n代表的是层数
    //复杂度 O(n)
    public int climbStaris2(int n){
        return fibonacci(n,1,1);
    }

    private int fibonacci(int n, int i, int i1) {  //i代表第一个数  i1代表第二个数
        if(n<=1) return i1;
        return fibonacci(n-1,i1,i+i1);
    }

    // 变形 1

    public static void main(String[] args) {
        System.out.println(new ClimbStaris().climbStaris(6));
        System.out.println(new ClimbStaris().climbStaris2(5));
    }
}
