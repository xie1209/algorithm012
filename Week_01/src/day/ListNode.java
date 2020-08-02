package day;

/**
 * @author xie
 * @description  用来做leetcode题的链表
 * @date 2020/7/29 14:20
 */
public class ListNode {
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int val){this.val=val;}
    //查找链表
    //通过数组创建链表

    public ListNode create(int[] arr){
        ListNode head=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            ListNode node=new ListNode(arr[i]);
            if(head != null){
                node.next=head;
                head=node;
            }else {
                head=node;
            }
        }
        return head;
    }

    //删除链表中的节点
   /* public static void main(String[] args) {
        int[]  nums={1,2,3,4,5,6,7,8,9};
        ListNode listNode = new ListNode().create(nums);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }*/
}
