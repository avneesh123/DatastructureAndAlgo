package linkedList;

/**
 * 2 pointer strategy slow [1 step at a time] and fast [2 step at a time]
 */
public class MiddleValue {

    public String getMiddleValue(Node head){
        Node slow= head, fast=head;
        //when it's odd
        //a b c d e
        //a b c d
        //    s    f

        while(fast != null && fast.next  != null ){

            fast = fast.next.next;
            slow = slow.next;

        }
        return  slow.value;
    }

}
