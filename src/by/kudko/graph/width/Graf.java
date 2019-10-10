package by.kudko.graph.width;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graf {
    private Map<String, List<Person>> graf;

    public Graf() {
    }

    public Graf(Map<String, List<Person>> graf) {
        this.graf = graf;
    }

    {
        graf = new HashMap<>();
    }

    public void addFork(String key, List<Person> value) {
        graf.put(key, value);
    }

    public void deleteFork(String key) {
        graf.remove(key);
    }

    public List<Person> getVerges(String key){
        return graf.get(key);
    }

}
