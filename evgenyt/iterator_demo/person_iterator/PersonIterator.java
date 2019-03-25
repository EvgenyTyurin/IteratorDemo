package evgenyt.iterator_demo.person_iterator;

import evgenyt.iterator_demo.person_base.Person;

/**
 * All iterators must have: reset, has next, next.
 */

public interface PersonIterator {
    boolean hasNext();
    Person next();
    void reset();
}
