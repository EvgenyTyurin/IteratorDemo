package evgenyt.iterator_demo.person_iterator;

import evgenyt.iterator_demo.person_base.ClientBase;
import evgenyt.iterator_demo.person_base.Person;

/**
 * Simple iterator
 */

public class ClientIterator implements PersonIterator {
    private ClientBase clientBase;
    private int position = -1;

    public ClientIterator(ClientBase clientBase) {
        this.clientBase = clientBase;
    }

    @Override
    public boolean hasNext() {
        if (position < clientBase.getClients().size() - 1)
            return true;
        else
            return false;
    }

    @Override
    public Person next() {
        if (position < clientBase.getClients().size() - 1) {
            position++;
            return clientBase.getClients().get(position);
        }
        else {
            return null;
        }
    }

    @Override
    public void reset() {
        position = -1;
    }
}
