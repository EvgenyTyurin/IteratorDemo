package evgenyt.iterator_demo.person_base;

import evgenyt.iterator_demo.person_iterator.PersonIterator;

/**
 * Abstract aggregate
 */

public interface PersonBase {
    PersonIterator getIterator();
    PersonIterator getEmailsIterator();
}
