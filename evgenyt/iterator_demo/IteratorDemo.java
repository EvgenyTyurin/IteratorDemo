package evgenyt.iterator_demo;

import evgenyt.iterator_demo.person_base.ClientBase;
import evgenyt.iterator_demo.person_base.Person;
import evgenyt.iterator_demo.person_iterator.PersonIterator;

/**
 * Iterator pattern demo
 * Mar 2019 Evgeny Tyurin
 *
 * We have client base, and two iterators: simple and filtered by email.
 *
 */

public class IteratorDemo {

    /** Run point */
    public static void main(String[] args) {
        // Client base init
        ClientBase clientBase = new ClientBase();
        clientBase.addClient(new Person("John Doe", "john_doe@gmail.com"));
        clientBase.addClient(new Person("Mary Jane", "mary_jane@gmail.com"));
        clientBase.addClient(new Person("King Arthur", ""));
        // Simple iterator
        System.out.println("All clients:");
        iterate(clientBase.getIterator());
        // Email iterator
        System.out.println("Clients with emails:");
        iterate(clientBase.getEmailsIterator());

    }

    /** Iterate and show result */
    private static void iterate(PersonIterator iterator) {
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

}
