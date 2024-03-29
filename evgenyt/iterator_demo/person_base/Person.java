package evgenyt.iterator_demo.person_base;

/**
 * Client with name and email
 */

public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "name=" + name + " email=" + email;
    }
}
