package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleValueTest {

    @Test
    void getEvenMiddleValueTest(){
        MiddleValue middleValue = new MiddleValue();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        assertEquals(middleValue.getMiddleValue(a), "c");
    }

    @Test
    void getOddMiddleValueTest(){
        MiddleValue middleValue = new MiddleValue();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        a.next = b;
        b.next = c;
        c.next = d;
        assertEquals(middleValue.getMiddleValue(a), "c");
    }
}
