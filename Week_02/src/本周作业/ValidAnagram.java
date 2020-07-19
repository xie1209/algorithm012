package 本周作业;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xie
 * @description  242.有效字母的异位词
 * @date 2020/7/19 13:08
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        //思路一  用一个存s的26个编码，最后判断是否都为0  先存后减去
        int[] arr=new int[26];
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        for(int i=0;i<sc.length;i++){
            int temp=sc[i]-'a';
            arr[temp]+=1;
        }
        for(int i=0;i<tc.length;i++){
            int temp=tc[i]-'a';
            arr[temp]-=1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    //思路二  使用排序
    public boolean isAnagram2(String s,String t){
       if(s.length()!=t.length()) {return false;}
       char[] str1=s.toCharArray();
       char[] str2=t.toCharArray();
       Arrays.sort(str1);
       Arrays.sort(str2);
       return Arrays.equals(str1,str2);
    }



    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram2("bcdefg","defgbc"));
    }
}
