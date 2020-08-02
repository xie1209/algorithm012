package 本周作业;

/**
 * @author xie
 * @description   122.买股票的最佳时机
 * @date 2020/8/2 14:03
 */
public class BestTimeBuy {
    public int maxProfit(int[] prices){
        int res=0;
        for(int i=0;i<prices.length-1;i++){
            int temp=prices[i+1]-prices[i];
            if(temp>0){
                res+=temp;
            }
        }
        return res;
    }

}
