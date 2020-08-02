package 本周作业;

/**
 * @author xie
 * @description  860.柠檬水找零
 *  三张纸币 5，10，20
 * @date 2020/8/2 11:04
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills){
        int five=0,ten=0;
        for(int bill:bills){
            if (bill==5) five++;
            else if(bill==10) five--;
            else if(ten>0) {five--;ten--;}
            else five-=3;

            if(five<0) return false;
        }
        return true;
    }
}
