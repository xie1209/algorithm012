package 本周作业;

import java.util.Arrays;

/**
 * @author xie
 * @description  455.分发饼干
 * 因为每个孩子最多只能给一个饼干  g代表孩子的胃口数组 ，s代表饼干数组
 * @date 2020/8/2 15:45
 */
public class AssignCookies {
    //使用贪心算法  时刻关注未满足的最小胃口
    public int findContentChildren(int[] g, int[] s) {
         if(g==null && s==null) return 0;
         int gi=0,si=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (si<s.length && gi<g.length){
            if(g[gi]<=s[si]) gi++;
            si++;
        }
        return gi;
    }
}
