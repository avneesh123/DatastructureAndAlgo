package linkedList;

public class LinkedListCycle {

    //a b c d e f      here e pints to b again
   //         f s
    //Two pointer strategy
    public Boolean hasCycle(Node head) {
        Node slow=head, fast = head;
        while(fast != null && fast.next != null){
            if(slow.value != head.value && slow.value == fast.value || slow.value == fast.next.value ) {
             System.out.println(slow.value);
                System.out.println(fast.value);
                System.out.println(fast.next.value);
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
