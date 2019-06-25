package javaBase;

public class linkSwap {
    public static void main(String[] args) {

    }
    public static void solution(ListNode head,int m,int n){
        ListNode p,q = head;
        for(int i=0;i<m;i++){
            q=q.next;
        }
        p=q;
        for(int i=0;i<n;i++){
            p=p.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}