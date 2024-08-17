public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) {
            return false;
        }
        ListNode temp = head; 
        Set<ListNode> set = new HashSet<>(); 
        while(temp!=null) {
            if(set.contains(temp)) {
                return true;
            } 
            set.add(temp); 
            temp = temp.next; 
        } 
        return false;
    }
}