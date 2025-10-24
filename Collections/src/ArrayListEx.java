import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> animals=new  ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("horse");
        animals.add("lion");
        animals.add("donkey");
        animals.add("rat");
        // animals.remove(1);
        // System.out.println(animals);
        // animals.set(5,"Goat");
        // removing by the value
        //animals.remove("rat");
        //System.out.println(animals);
        //removing by the position/index
        // animals.remove(5);

        // System.out.println(animals.size());

        //System.out.println(animals);

        //Iterate through the elements
//        for(int i=0;i<animals.size();i++){
//            System.out.println(animals.get(i));
//        }
//        //Iterate through the elements-using for each
//        for (String animal:animals){
//            System.out.println(animal);
//        }

        //checking an element  is present or not

//        boolean present=false;
//        for(int i=0;i<animals.size();i++){
//            if(animals.get(i).equals("monkey")){
//                present=true;
//            }
//        }
//        if(present){
//            System.out.println(" monkey Present in animals");
//        }
//        else{
//            System.out.println(" monkey not  Present in animals");
//        }
        // checking if an element is present or not built in method

//        if(animals.contains("horse")){
//            System.out.println("Horse is present");
//        }
//        else{
//           System.out.println("Horse is not present");
//        }

        animals.clear();
        //System.out.println(animals);
        if(animals.isEmpty()){
            System.out.println("Empty List");
        }
        else {
            System.out.println("Not Empty List");
        }

    }

}




/*import java.util.;

public class ListMethodsExample {
    public static void main(String[] args) {
        // Create an ArrayList (dynamic array)
        List<String> list = new ArrayList<>();

        // 1. add(E element) → Amortized O(1), Worst O(n) if resize happens
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list);

        // 2. add(int index, E element) → O(n)
        list.add(1, "Mango");
        System.out.println("After add at index 1: " + list);

        // 3. addAll(Collection) → O(n + m)
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        list.addAll(moreFruits);
        System.out.println("After addAll: " + list);

        // 4. get(int index) → O(1) for ArrayList
        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        // 5. set(int index, E element) → O(1) for ArrayList
        list.set(0, "Strawberry");
        System.out.println("After set at index 0: " + list);

        // 6. remove(int index) → O(n)
        list.remove(3);
        System.out.println("After remove at index 3: " + list);
    }
}


 */