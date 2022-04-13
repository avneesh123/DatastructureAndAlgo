package linkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedPalindromeTest {

    LinkedPalindrome linkedPalindrome;
    LinkedPalindrome.Node a;

    @BeforeEach
     void beforEach(){
        linkedPalindrome = new LinkedPalindrome();
        a = linkedPalindrome.new Node(3);
        LinkedPalindrome.Node b = linkedPalindrome.new Node(2);
        LinkedPalindrome.Node c = linkedPalindrome.new Node(7);
        LinkedPalindrome.Node d = linkedPalindrome.new Node(7);
        LinkedPalindrome.Node e = linkedPalindrome.new Node(2);
        LinkedPalindrome.Node f = linkedPalindrome.new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    }

    @Test
    void convertLinkedListToArrayList(){
        int[] arr = {3,2,7,7,2,3};
       assertArrayEquals(LinkedPalindrome.convertLinkedListToArrayList(a), arr);
    }

    @Test
    void isPalindromeLinked(){

        assertEquals(LinkedPalindrome.isPalindromeLinked(a), true);

    }

    @Test
    void notPalindromeLinked(){

        linkedPalindrome = new LinkedPalindrome();
        a = linkedPalindrome.new Node(0);
        LinkedPalindrome.Node b = linkedPalindrome.new Node(1);
        LinkedPalindrome.Node c = linkedPalindrome.new Node(0);
        LinkedPalindrome.Node d = linkedPalindrome.new Node(1);
        LinkedPalindrome.Node e = linkedPalindrome.new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        assertEquals(LinkedPalindrome.isPalindromeLinked(a), false);

    }
}
