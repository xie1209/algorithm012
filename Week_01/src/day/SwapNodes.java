package day;

/**
 * @author xie
 * @description 24.两两交换链表中的节点
 * @date 2020/7/29 15:56
 */
public class SwapNodes {
    //使用递归 假设后面都是排序好的
    public ListNode swapPairs(ListNode head){
        //终止条件
        if(head==null || head.next==null) return head; //
        ListNode second=head.next;
        head.next=swapPairs(second.next);  //返回的是已经翻转好的头节点
        second.next=head;
        return second; //成为这两个节点的头节点
    }

    //不使用递归

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        ListNode listNode = new ListNode().create(nums);
        ListNode listNode1 = new SwapNodes().swapPairs(listNode);
        while (listNode1 != null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }
    }
}
