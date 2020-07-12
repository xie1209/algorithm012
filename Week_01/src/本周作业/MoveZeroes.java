package 本周作业;

/**
 * @author xie
 * @description leetcode 283.移动零  描述；给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 */
public class MoveZeroes {
    //思路一 设置一个变量来依次移动非零变量
    public static void moveZeroes(int[] nums) {
        int j=0; //用来移动非零元素的
        for (int i = 0; i < nums.length; i++) {
            int temp=0;
            if(nums[i]!=0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                ++j;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
