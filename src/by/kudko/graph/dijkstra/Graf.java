package by.kudko.graph.dijkstra;

import java.util.HashMap;
import java.util.Map;

public class Graf {
    private Map<String, Map<String, Integer>> graf;

    public Graf() {
    }

    public Graf(Map<String, Map<String, Integer>> graf) {
        this.graf = graf;
    }

    {
        graf = new HashMap<>();
    }

    public void addFork(java.lang.String key, Map<String, Integer> value) {
        graf.put(key, value);
    }

    public void deleteFork(java.lang.String key) {
        graf.remove(key);
    }

    public Map<String, Integer> getVerges(java.lang.String key) {
        return graf.get(key);
    }

}
