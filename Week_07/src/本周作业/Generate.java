package 本周作业;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie
 * @description 括号生成
 * @date 2020/8/23 9:32
 */
public class Generate {
    //  先生成所有括号
    public List<String> generParent(int n){
        List<String> res=new ArrayList<>();
        helper(res,0,0,n,"");
        return res;
    }

    private void helper(List<String> res, int left,int right, int level,String s) {
        if(left==level && right==level){
            res.add(s);
            System.out.println(s);
            return;
        }
        if(left<level)
        helper(res,left+1,right,level,s+"(");
        if(right<left)
        helper(res,left,right+1,level,s+")");
    }

    public static void main(String[] args) {
        new Generate().generParent(3);
    }
}
