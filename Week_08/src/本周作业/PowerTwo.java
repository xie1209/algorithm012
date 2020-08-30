package 本周作业;

/**
 * @author xie
 * @description  2的幂
 */
public class PowerTwo {
    // 使用位运算
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
