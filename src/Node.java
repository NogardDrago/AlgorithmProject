public class Node<T> {
    Product info;
    Node next;
    // Node head;
    // Node tail;
    public Node() {
    }
    public Node(Product info, Node next) {
        this.info=info;
        this.next=next;
    }
    @Override
    public String toString() {
        return info+"";
    }
}
