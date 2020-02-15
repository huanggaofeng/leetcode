package simple;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(5);
        l2.next = l3;
        l1.next = l2;
        l3.next = l4;
        l5.next = l6;
        l4.next = l5;
        ListNode listNode = deleteDuplicates(l1);
        System.out.println(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        // 当前值和下一值相等的时候，链表跳过下一值，重新执行
        /*
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        if(head.val == head.next.val){
            head.next = head.next.next;
            deleteDuplicates(head);
        } else {
            head.next = deleteDuplicates(head.next);
        }*/
        // 官方题解，思路一致，写法不一样
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


}

