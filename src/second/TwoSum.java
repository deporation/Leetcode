package second;

/**
 * @author deporation
 */
public class TwoSum {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int i = 0;
        ListNode copy = new ListNode();
        while( l1.next!=null || l2.next!= null){
            if ((l1.next == null && l2.next!=null)||(l2.next == null && l1.next!=null)){
                if(l1.next == null){
                    l1.next = new ListNode(0);
                }
                if (l2.next == null){
                    l2.next = new ListNode(0);
                }
            }
            int sum = res.val + l1.val + l2.val;
            res.val = sum % 10;
            res.next = new ListNode(sum /10);
            if (i == 0){
                copy = res;
            }
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
            i++;
        }
        int sum = res.val + l1.val + l2.val;
        res.val = sum % 10;
        res.next = new ListNode(sum /10);
        if (i == 0){
            copy = res;
        }
        if (res.next.val == 0){
            res.next = null;
        }
        return copy;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9,new ListNode(4,new ListNode(3,new ListNode(8,new ListNode(4)))));
        ListNode l2 = new ListNode(4,new ListNode(5,new ListNode(6)));
        ListNode res = addTwoNumbers(l1,l2);
        while (res.next != null){
            System.out.println(res.val);
            res =res.next;
        }
        System.out.println(res.val);
    }
}
