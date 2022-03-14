package java_assignments.assignment10;

public class SList <T> {
    Node<T> head = new Node<>(null,null);

    public SListIterator<T> iterator(){
        return new SListIterator<T>(head);
    }

    public String toString(){
        if(head==null){
            return "";
        }else{
            SListIterator<T> iterator = this.iterator();
            StringBuilder sb = new StringBuilder();
            while(iterator.hasNext()){
                sb.append(iterator.next()+", ");
            }
            return sb.toString();
        }
    }

    public Node<T> getHead(){
        return head;
    }

}