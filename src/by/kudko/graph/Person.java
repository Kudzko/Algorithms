package by.kudko.graph;

import java.util.Objects;

public class Person {

    private String name;
    private boolean diller;

    public Person() {
    }

    public Person(String name, boolean diller) {
        this.name = name;
        this.diller = diller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiller() {
        return diller;
    }

    public void setDiller(boolean diller) {
        this.diller = diller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return diller == person.diller &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, diller);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", diller=" + diller +
                '}';
    }
}
