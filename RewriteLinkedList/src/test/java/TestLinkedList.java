import java.lang.String;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a7");
        linkedList.addFirst("c1");
        linkedList.addLast("e6");
        linkedList.add(2,"s12");
        linkedList.add(4,"v21");
        LinkedList<String> linkedListClone = linkedList.clone();

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        linkedList.remove("c1");
        linkedList.remove("a7");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println(linkedList.contains("e5"));
        System.out.println(linkedList.contains("m2"));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        for (int i = 0; i < linkedListClone.size(); i++) {
            System.out.println(linkedListClone.get(i));
        }
    }
}
