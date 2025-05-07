package datastructures.linkedlist;

public class SumList {

    public static void main(String[] args) {

        Node node = new Node(4);
        node.next = new Node(2);
        node.next.next = new Node(1);
        node.next.next.next = new Node(9);
        int sum = sum(node);
        System.out.println(sum);

    }

    public static int sum (Node head){
        int sum = 0;
        Node node = head;
        while (node != null){
            sum += node.data;
            node = node.next;
        }
        return sum;
    }
}
