package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleTest {

    @Test
    void hasCycleEvenTest(){
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        assertEquals(linkedListCycle.hasCycle(a), true);
    }

    @Test
    void hasCycleOddTest(){
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;//cycle
        assertEquals(linkedListCycle.hasCycle(a), true);
    }

    @Test
    void hasNoCycleTest(){
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        assertEquals(linkedListCycle.hasCycle(a), false);
    }

}
