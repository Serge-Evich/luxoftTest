package luxoft.element;


import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ElementCollectionTestCase {

    @Test
    public void testNumberUniqueDuplicates() {
        Predicate<Element> emptyPredicate = new Predicate<Element>() {
            @Override
            public boolean test(Element o) {
                return true;
            }

        };
        List<Element> elements = Arrays.asList( new Element( 29, "name", 21 ), new Element( 29, "name", 21 ) );
        Collection<Element> resultCollection = Element.getUniqueByNumber( elements, emptyPredicate );
        assertThat( resultCollection.size(), is( 1 ) );
    }

    @Test
    public void testNumberUnique() {
        Predicate<Element> emptyPredicate = new Predicate<Element>() {
            @Override
            public boolean test(Element o) {
                return true;
            }

        };
        List<Element> elements = Arrays.asList( new Element( 29, "name", 21 ), new Element( 23, "name", 21 ) );
        Collection<Element> resultCollection = Element.getUniqueByNumber( elements, emptyPredicate );
        assertThat( resultCollection.size(), is( 2 ) );
    }

    @Test
    public void testNumberUniqueWithPredicate() {
        Predicate<Element> ageGT20Predicate = new Predicate<Element>() {
            @Override
            public boolean test(Element e) {
                return e.getAge() > 20;
            }

        };
        List<Element> elements = Arrays.asList( new Element( 29, "name", 21 ), new Element( 23, "name", 20 ) );
        Collection<Element> resultCollection = Element.getUniqueByNumber( elements, ageGT20Predicate );
        assertThat( resultCollection.size(), is( 1 ) );
    }
}
