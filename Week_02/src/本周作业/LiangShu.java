package 本周作业;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie
 * @description  
 * @date 2020/7/19 14:09
 */
public class LiangShu {
    //思路一 暴力破解法
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
   //思路二 两遍hash
    public int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complent=target-nums[i];
            if(map.containsKey(complent)&& map.get(complent)!=i){
                return new int[]{i,map.get(complent)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={2,7,13,18,19};
        int[] ints = new LiangShu().twoSum2(nums, 31);
        if(ints!=null){
            System.out.println(ints[0]+"  "+ints[1]);
        }
    }
}
