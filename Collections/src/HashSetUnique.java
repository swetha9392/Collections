/* You want a HashSet<Person> to store unique people by id. A naive Person class does not override equals() or hashCode(). Show that two different Person objects with the same id will both appear in the set. Then fix Person by overriding equals() and hashCode() so duplicates are prevented.
Input / Expected behavior
Two Person objects with same id = 1 should be treated as the same person after fix.
Before fix: set size = 2
After fix:set size=1
*/
import java.util.*;
import lombok.EqualsAndHashCode;


class Person extends Object{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
    @override
    public String toString(){
        return name*this.id;
    }
    @override
    public boolean eqauals(Object o){
        if(this==0)return true;
        if(!(o instanceof Person)) return false
       Person p=(Person) o;
        return id=p.id;
    }

}
record PPerson(int id,String name){}
public class HashSetUnique {
    public static void main(String[] args) {
        HashSet<PPerson> set=new HashSet<>();
        set.add(new PPerson(1,"swetha"));
        set.add(new PPerson(1,"swetha"));
        set.add(new PPerson(2,"anusha"));
        System.out.println(set);
        System.out.println(set.size());

    }
}
