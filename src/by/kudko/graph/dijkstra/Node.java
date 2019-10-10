package by.kudko.graph.dijkstra;

import java.util.Objects;

public class Node {
    private java.lang.String name;
    private int id;

    public Node() {
    }

    public Node(java.lang.String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return id == node.id &&
                Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public java.lang.String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
