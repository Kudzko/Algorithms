package by.kudko.graph.dijkstra;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    public static Integer INF = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Map<String, String> parants = new HashMap<>();
        parants.put("A", "Start");
        parants.put("B", "Start");
        parants.put("Finish", null);

        Map<String, Integer> costs = new HashMap<>();
        costs.put("A", 6);
        costs.put("B", 2);
        costs.put("Finish", INF);

        Map<String, Map> graph = new HashMap<>();

        Map<String, Integer> start = new HashMap<>();
        start.put("A", 6);
        start.put("B", 2);

        Map<String, Integer> a = new HashMap<>();
        a.put("Finish", 1);

        Map<String, Integer> b = new HashMap<>();
        b.put("A", 3);
        b.put("Finish", 5);
        Map<String, Integer> finish = new HashMap<>();

        graph.put("Start", start);
        graph.put("A", a);
        graph.put("B", b);
        graph.put("Finish", finish);

        System.out.println("before: ");
        System.out.println("costs" + costs);
        System.out.println("parants" + parants);
        System.out.println("graph" + graph);

        Manager.countNodeCosts(costs, graph, parants);

        System.out.println("after: ");
        System.out.println("costs" + costs);
        System.out.println("parants" + parants);
        System.out.println("graph" + graph);
    }

}
