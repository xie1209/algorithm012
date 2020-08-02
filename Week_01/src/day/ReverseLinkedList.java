package day;

/**
 * @author xie
 * @description  206.翻转链表
 * @date 2020/7/29 14:10
 */
public class ReverseLinkedList {
    //思路一  采用迭代  重点用next 来保存下一个节点，用pre来保存上一个节点，最开始未null
    public ListNode reverseList(ListNode root){
        ListNode pre=null;  //指向前置节点, 第一个节点的前置节点为null
        ListNode cur=root;
        while (cur != null){
            ListNode temp=cur.next; //保存下一个节点
            cur.next=pre;
            //接下来后移
            pre=cur;
            cur=temp;
        }
        return pre; //pre最后会指向未翻转的最后一个节点， 回走到翻转的头节点
    }

    //思路二  采用递归进行链表的翻转


    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,1000};
        ListNode listNode = new ListNode().create(nums);
        ListNode listNode1 = new ReverseLinkedList().reverseList(listNode);
        while (listNode1 !=null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }

    }
}
