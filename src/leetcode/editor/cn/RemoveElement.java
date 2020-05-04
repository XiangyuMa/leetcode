package leetcode.editor.cn;

public class RemoveElement {
    public static void main(String[] args) {

    }
    public static  ListNode removeElements(ListNode head, int val) {
        ListNode sentinode = new ListNode(0);
        sentinode.next = head;
        ListNode pre = sentinode,curr = head;
        while(curr != null){
            if(curr.val == val){
                pre.next = curr.next;
            }else{
                pre  = curr;
            }
            curr = curr.next;
        }
        return sentinode.next;
    }
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
