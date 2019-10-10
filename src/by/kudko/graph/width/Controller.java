package by.kudko.graph.width;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        Graf graf = new Graf();
        List<Person> you = new ArrayList();
        you.add(new Person("Bob", false));
        you.add(new Person("Alise", false));
        you.add(new Person("Klaire", false));

        List<Person> bob = new ArrayList();
        bob.add(new Person("Anudz", false));
        bob.add(new Person("Peggy", false));

        List<Person> alise = new ArrayList();
        alise.add(new Person("Peggy", false));

        List<Person> klaire = new ArrayList();
        klaire.add(new Person("Tom", true));
        klaire.add(new Person("Jonny", false));


        graf.addFork("you", you);
        graf.addFork("Bob", bob);
        graf.addFork("Alise", alise);
        graf.addFork("Klaire", klaire);
        graf.addFork("Anudz", new ArrayList<Person>());
        graf.addFork("Peggy", new ArrayList<Person>());
        graf.addFork("Tom", new ArrayList<Person>());
        graf.addFork("Jonny", new ArrayList<Person>());

        System.out.println(MangoDealler.search("you", graf));

    }
}
