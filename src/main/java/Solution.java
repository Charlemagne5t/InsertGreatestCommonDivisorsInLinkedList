class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null) {
            int gcd = gcd(temp.val, temp.next.val);
            ListNode add = new ListNode(gcd);
            ListNode t = temp.next;
            temp.next = add;
            add.next =t;
            temp = t;
        }

        return head;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }

        return a;
    }
}