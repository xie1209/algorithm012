package day;

/**
 * @author xie
 * @description  11.盛水最多的容器
 * @date 2020/7/27 16:03
 */
public class MaxArea {
    //分析证明的过程，为什么这种双指针是不会遗漏的，假设数组的左右高度分别为x,y  且x <= y,宽度为 t
    //那么area=xt,当固定x的位置，y指针向左移动任何位置，最大面积均小于area ,因为t在减小，而高度始终取最小值，高度只可能会比小，所以右指针再移动是没有意义的
    //那么就应该左指针移动，寻找比x大的小高度，来弥补t的减小。

    //使用for
    public static int maxArea(int[] nums){
        int l=0,r=nums.length-1,area=0;
        for (int i = 0; i < nums.length; i++) {
            int minHeight=nums[l]<nums[r]?nums[l++]:nums[r--]; //选择较小的高度，同时向内寻找较高的柱子
            int max=minHeight*(r-l+1);
            area=Math.max(max,area);
        }
        return area;
    }

    //用while(l<r)
    public static int maxArea2(int[] nums){
        int l=0,r=nums.length-1,area=0;
        while (l<r){
            int max=Math.min(nums[l],nums[r])*(r-l);
            area=Math.max(area,max);
            if(nums[l]<nums[r]) l++;
            else r--;  //需要提防高度相等的情况
        }
        return area;
    }

    public static void main(String[] args) {
        int[] nums={1,100,6,2,5,4,8,3,7,100,1};
        int i = MaxArea.maxArea(nums);
        int i1 = MaxArea.maxArea2(nums);
        System.out.println(i);
        System.out.println(i1);
    }
}
