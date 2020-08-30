package 本周作业;

/**
 * @author xie
 * @description 191.位1的个数
 */
public class HammingWeight {
    public  int weight(int n){
        //使用位运算进行解决
        int m=1; //用于不断位移进行比较
        int sum=0; //用于统计一出现的个数
        for (int i = 0; i < 32; i++) {
            if((n&m) !=0) sum+=1;
            m<<=1;
        }
        return sum;
    }

    public static void main(String[] args) {
        int weight = new HammingWeight().weight(1900);
        System.out.println(weight);
    }
}
