
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListex {
    LinkedList<String> animals;
    public LinkedListex() {
        animals = new LinkedList<>();
    }

    public void AddElements(String animal) {
        animals.add(animal);
    }

    public void AddAtBeginning(String animal) {
        animals.addFirst(animal);
    }

    public void AddAtEnd(String animal) {
        animals.addLast(animal);
    }

    public void AddAtPosition(int position, String animal) {
        animals.add(position, animal);
    }

    // // Update the last element or add if empty
    public void updateList(String animal){
        if(animals.size()>0){
            animals.set(animals.size()-1,animal);
        }else{
            animals.add(animal);
        }

    }
    // Remove first element
    public String removeFirst() {
        if (animals.size() < 1) {
            return null;
        }
        return animals.removeFirst();
    }
    // Remove last element
    public String removeLast() {
        if (animals.size() < 1) {
            return null;
        }
        return animals.removeLast();
    }
    public void iterateLinkedListusingIterator(){
      /* var iterator=animals.iterator();
       while(iterator.hasNext()){
           System.out.print(iterator.next()+" ");

       }*/
        Iterator<String> iterator = animals.iterator();
        while(iterator.hasNext()){
          /*  String animals=iterator.next();
            System.out.print(animals+" ,")*/


            System.out.print(iterator.next()+" ,");
        }
    }


    public void showLinkedList() {
        System.out.println("LinkedList: " + animals);
    }



}