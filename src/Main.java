import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> personComparator = new PersonAgeComparator()
                .thenComparing(new PersonNameComparator());
        TreeSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Viktor", 20));
        people.add(new Person("Andrii", 20));
        people.add(new Person("Oleg", 25));

        System.out.println(people);
    }
}
