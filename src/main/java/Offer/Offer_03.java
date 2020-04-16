package Offer;

import java.util.ArrayList;

public class Offer_03 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next= listNode2;
        listNode2.next = null;
        System.out.println(printListFromTailHead(listNode).toString());
    }
    public static ArrayList<Integer> printListFromTailHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (listNode!=null){
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}

class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

