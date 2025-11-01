/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */ 

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
       // Base Case 
       if(head == null) return head; 
       
        ListNode dummy = head; 
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
       
        
        HashSet<Integer> l = new HashSet<>();  //O(1) time Comp but in arrayList takes O(N) 
        
        for(int e: nums)
        { 
          l.add(e);   
        }
           
        while(dummy != null) 
        {
           if(!l.contains(dummy.val))
           {
              temp.next = dummy;
              temp = temp.next; 
           }  
           dummy = dummy.next; 
        }
        temp.next = null; 
        return res.next; 
    }
} 
