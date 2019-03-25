package evgenyt.iterator_demo.person_iterator;

import evgenyt.iterator_demo.person_base.ClientBase;
import evgenyt.iterator_demo.person_base.Person;

/**
 * Filtered by email iterator
 */

public class EmailsIterator implements PersonIterator {
    private ClientBase clientBase;
    private int position = -1;

    public EmailsIterator(ClientBase clientBase) {
        this.clientBase = clientBase;
    }

    private int findNextEmail() {
        for (int idx = position + 1; idx < clientBase.getClients().size() - 1; idx ++) {
            if (!clientBase.getClients().get(idx).getEmail().equals(""))
                return idx;
        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        if (findNextEmail() > -1)
            return true;
        else
            return false;
    }

    @Override
    public Person next() {
        int idx = findNextEmail();
        if (idx > -1) {
            position = idx;
            return clientBase.getClients().get(idx);
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
