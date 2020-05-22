package Arreglos;

import org.w3c.dom.NodeList;

public class SinglyLikedList {
    private ListNode head;

    ListNode insertNodeEnd(ListNode head, int data) {
        ListNode nodo1 = new ListNode(data);
        ListNode current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = nodo1;
        return current;

    }

    // Floyd's algorithm. Increment one pointer by one and the other by two.
// If they are ever pointing to the same node, there is a cycle.
// Explanation: https://www.quora.com/How-does-Floyds-cycle-finding-algorithm-work
    public boolean hasCycleFloyd(ListNode n) {
        if (n == null) return false;
        ListNode slow = n;
        ListNode fast = n.next;

        while (fast != null && fast.next != null) {
            if (fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }

    /**
     * @return
     */

    public boolean detectarCicloGrafo(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer) {
                return true;

            }


        }

        return false;
    }

    //it contains a static inner class node

    public ListNode insertNode(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
        return head;

    }

    //add element after a give node
    public void insertElementAfter(ListNode previosNode, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = previosNode.next;
        previosNode.next = newNode;


    }

    ListNode deleteFirsNode(ListNode head) {
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //insert element at given position

    public void insertElementAt(ListNode node, int position, ListNode head) {

        int counter = 1;
        ListNode current = head;
        while (counter < position - 1) {
            current = current.next;
            counter++;
        }
        node.next = current.next;
        current.next = node;


    }

    //list all elements in LinkedList
    public void mostrarElementos(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private static class ListNode {
        private int data;

        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        System.out.println("bienvenido");
        ListNode nuevo = new ListNode(200);
        ListNode head;
        ListNode first = new ListNode(8);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(11);
        ListNode fourth = new ListNode(58);
        ListNode fitth = new ListNode(32);
        ListNode sixth = new ListNode(14);


        //creating the linked list
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fitth;
        fitth.next = sixth;
//        sixth.next = third;


        SinglyLikedList lists1 = new SinglyLikedList();
        System.out.println(lists1.hasCycleFloyd(head));
//        lists1.mostrarElementos(head);
    }


}
