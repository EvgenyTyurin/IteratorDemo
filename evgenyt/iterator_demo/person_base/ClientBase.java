package evgenyt.iterator_demo.person_base;

import evgenyt.iterator_demo.person_iterator.ClientIterator;
import evgenyt.iterator_demo.person_iterator.EmailsIterator;
import evgenyt.iterator_demo.person_iterator.PersonIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete aggregate
 */

public class ClientBase implements PersonBase {
    private List<Person> clients = new ArrayList<>();

    public void addClient(Person person) {
        clients.add(person);
    }

    @Override
    public PersonIterator getIterator() {
        return new ClientIterator(this);
    }

    @Override
    public PersonIterator getEmailsIterator() {
        return new EmailsIterator(this);
    }

    public List<Person> getClients() {
        return clients;
    }
}
