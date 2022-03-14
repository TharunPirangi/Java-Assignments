package java_assignments.assignment10;

public class SListIterator<T> {
    Node<T> head;
    public SListIterator(Node<T> head) {
        this.head = head;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data,null);
        head.next = newNode;
        head = head.next;
    }
    public void pop(Node<T> node){
        if(node == null) return;
        while(node.next != null && head.next.next != null){
            node = node.next;
        }
        node.next = null;
        node = head;
    }
    public Node<T> next(){
        head = head.next;
        return head;
    }
    public boolean hasNext(){
        return head.next!=null;
    }
}