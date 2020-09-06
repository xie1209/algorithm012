package 本周作业;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie
 * @description  387.字符串中第一个唯一的字符
 */
public class Solution01 {
    public int firstUniqChar(String s) {
        // 用来去存字符
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
             map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="eleetcode";
        System.out.println(new Solution01().firstUniqChar(s));
    }
}
