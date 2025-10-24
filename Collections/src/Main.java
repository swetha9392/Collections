

public class Main {
    public static void main(String[] args) {
        LinkedListex ll = new LinkedListex();
        System.out.println("Elements Initially: ");
        ll.showLinkedList();

        ll.AddElements("Cat");
        ll.AddElements("Dog");
        ll.AddElements("Horse");
        ll.AddElements("Monkey");
        ll.AddElements("Tiger");
        ll.AddElements("Lion");
        ll.showLinkedList();

        ll.AddAtBeginning("Rabbit");
        ll.showLinkedList();

        ll.AddAtEnd("Mouse");
        ll.showLinkedList();


        ll.AddAtPosition(2, "Cow");
        ll.removeFirst();
        ll.removeLast();

        ll.showLinkedList();
        System.out.println(" Elements accessing through iterator:");

        ll.iterateLinkedListusingIterator();
    }
}