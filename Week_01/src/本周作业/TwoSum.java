package 本周作业;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie
 * @description leetcode 1.两数之和  给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  变形：
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        //思路一 暴力破解
   /*     int[] index1=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    index1[0]=i;
                    index1[1]=j;
                }
            }
        }
        return index1;*/

        //思路二  使用map来进行
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("NO two sum");
    }

    public static void main(String[] args) {
       int[] nums = {2, 7, 11, 15};
       int target = 9;
        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
