package day;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie
 * @description 22.括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * @date 2020/7/20 14:54
 */
public class GenerateParenthesis {
    private List<String> result;  //全局变量
    public List<String> generateParenthesis(int n) {
        result=new ArrayList<>();
        generate2(0,0,n,"");
        return result;
    }

    private void generate2(int left, int right, int n, String s) {
        //中止条件
        if(left==n && right==n){
            result.add(s);
            return;
        }

        //当前层逻辑
        String s1="(";
        String s2=")";
        //进入下一层
        if(left<=n)  //如果没有该条件会无限递归下去，递归不会返回
        generate2(left+1,right,n,s+s1);
        if(right<left)
        generate2(left,right+1,n,s+s2);

        //清理当前层
    }

    //递归中止条件  当前层逻辑  进入下一层  清理当前层(下一层逻辑执行完后，依次来执行本层语句)
    private void generate(int left,int right, int n, String s) {
        //递归终止条件
        if(left==n && right==n){
            result.add(s);
            return;
        }

        //当前层逻辑
        String s1="(";
        String s2=")";

        //进入下一层   可以进行减枝
        if(left<=n)
        generate(left+1,right,n,s+s1);
        if(right<left)
        generate(left,right+1,n,s+s2);

        //清理当前层(上面的逻辑依次执行到此)

    }

    public static void main(String[] args) {
        List<String> strings = new GenerateParenthesis().generateParenthesis(3);
        System.out.println(strings);
    }
}
