package day;

/**
 * @author xie
 * @description  283.移动零
 *给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 * @date 2020/7/27 10:15
 */
public class MoveZero {
    /*
    分析一 通过增加一个变量，用来记录非零出现的个数，用非0出现的第几个作为数组的下标来存非0 元素
    但同时要注意不用把自己置为0
     */
    public void moveZeroes(int[] nums){
        if(nums==null || nums.length==0) return;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j]=nums[i];
                if(i != j) nums[i]=0;  //防止将自己置为0
              /*  if(i>j) {  这一个语句块和上面两个等价
                    nums[j]=nums[i];
                    nums[i]=0;
                }*/
                j++;
            }

        }
    }

}
