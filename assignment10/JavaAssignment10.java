package java_assignments.assignment10;

public class JavaAssignment10 {
    public static void main(String[] args) {
        SList<String> names = new SList<>();
        SListIterator<String> iterator = names.iterator();
        Node<String> dummy = names.getHead();
        Node<String> head = dummy.next;
        iterator.add("name1");
        iterator.add("name2");
        iterator.add("name3");
        iterator.add("name4");
        iterator.add("name5");

        System.out.println(names.toString());
    }
}
