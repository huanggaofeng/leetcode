package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 21.合并两个有序列表
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(5);
        l2.next = l3;
        l1.next = l2;
        l5.next = l6;
        l4.next = l5;
        ListNode l = m.mergeTwoLists(null, null);
        System.out.println(l);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 自己的写法，把所有的值拿出来，然后排序在重新构建链表
//        if(l1 == null && l2 == null) {
//            return null;
//        }
//        List<Integer> list = new ArrayList<>();
//        if(l1 != null){
//            while (l1.next != null){
//                list.add(l1.val);
//                l1 = l1.next;
//            }
//            list.add(l1.val);
//        }
//        if(l2 != null){
//            while ( l2.next != null){
//                list.add(l2.val);
//                l2 = l2.next;
//            }
//            list.add(l2.val);
//        }
//        int[] i = list.stream().mapToInt(x -> x).sorted().toArray();
//        ListNode l = new ListNode(i[0]);
//        ListNode ll = l;
//        for (int j = 1; j < i.length; j++) {
//            l.next = new ListNode(i[j]);
//            l = l.next;
//        }
//        return ll;
        // 官方题解，递归，不需要构建新链接 如果 l1 的 val 值更小，则将 l1.next 与排序好的链表头相接，l2 同理
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}