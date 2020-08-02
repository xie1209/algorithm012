package day;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie
 * @description  1.两数之和
 * @date 2020/7/27 21:23
 */
public class TwoSum {
    //一遍hash
    public int[] twoSum(int[] nums,int target){
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
    }

}
