package luxoft.element;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Element {

    private int number;
    private String name;
    private int age;

    public Element( int number, String name, int age ) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Collection<Element> getUniqueByNumber(
            Collection<Element> collection,
            Predicate<Element> predicate
    ) {
        return collection.stream()
                .filter( predicate )
                .map( element -> new ElementNumberUniqueWrapper( element ) )
                .distinct()
                .map( ElementNumberUniqueWrapper::getElement )
                .collect(Collectors.toList());
    }
}
