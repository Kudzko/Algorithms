package by.kudko.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MangoDealler {

    /**
     * returns mango dealer or empty person if there is no
     * mango dealers
     * @param name
     * @param graf
     * @return
     */
    public static  Person search(String name, Graf graf){
    Queue searchQueue = new LinkedList();
    List<Person> searched = new ArrayList<>();

    searchQueue.addAll(graf.getVerges(name));

    Person checkingPerson;
    while (!searchQueue.isEmpty()){
        checkingPerson = (Person) searchQueue.poll();
        if (!searched.contains(checkingPerson)){
            if (checkingPerson.isDiller()){
                return checkingPerson;
            }else {
                searchQueue.addAll(graf.getVerges(checkingPerson.getName()));
                searched.add(checkingPerson);
            }
        }
    }

    return new Person();
}

}
