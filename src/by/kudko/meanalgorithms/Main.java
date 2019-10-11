package by.kudko.meanalgorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] states = {"mt", "wa", "or", "id", "nv", "ut", "ca", "az"};
        List<String> statesList = new ArrayList<>();

        statesList.addAll(Arrays.asList(states));
        Set<String> statesNeeded = new HashSet<>();

        statesNeeded.addAll(statesList);

        Map<String, Set<String>> stations = new HashMap<>();

        Set<String> set1 = new HashSet<>();
        set1.add("id");
        set1.add("nv");
        set1.add("ut");

        Set<String> set2 = new HashSet<>();
        set2.add("wa");
        set2.add("id");
        set2.add("mt");

        Set<String> set3 = new HashSet<>();
        set3.add("or");
        set3.add("nv");
        set3.add("ca");

        Set<String> set4 = new HashSet<>();
        set4.add("nv");
        set4.add("ut");

        Set<String> set5 = new HashSet<>();
        set5.add("ca");
        set5.add("az");

        stations.put("kone", set1);
        stations.put("ktwo", set2);
        stations.put("kthree", set3);
        stations.put("kfour", set4);
        stations.put("kfive", set5);

        Set<String> finalStations = new HashSet<>();


        String bestStation = "";
        Set<String> covered = new HashSet<>();
        Set<String> bestCovered = new HashSet<>();
        while (!statesNeeded.isEmpty()) {
            bestCovered.clear();
            // searching station witch covers more states
            for (Map.Entry entry : stations.entrySet()) {
                covered.clear();
                covered.addAll((Collection<? extends String>) entry.getValue());
                covered.retainAll(statesNeeded);
                if (covered.size() > bestCovered.size()) {
                    bestStation = entry.getKey().toString();
                    bestCovered.clear();
                    bestCovered.addAll((Collection<? extends String>) entry.getValue());
                }

            }

            finalStations.add(bestStation);
            statesNeeded.removeAll(bestCovered);

        }
        System.out.println(statesNeeded);
        System.out.println(finalStations);

    }
}

