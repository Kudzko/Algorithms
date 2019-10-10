package by.kudko.graph.dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Manager {
    public static final  Integer MAX_VAL = Integer.MAX_VALUE;
    public static String findLowestCostNode(Map<String, Integer> costs, List<String> processed){
        Integer lowestCost = MAX_VAL;
        String lowestCostNode = null;
        for (Object node : costs.keySet().toArray()){
            Integer cost = costs.get(node);
            if (cost < lowestCost && !processed.contains(node)){
                lowestCost = cost;
                lowestCostNode = node.toString();
                }
        }
        return lowestCostNode;
    }

    public static void countNodeCosts(Map<String, Integer> costs, Map<String, Map> graph, Map<String, String> parants){
        List<String> processed = new ArrayList<>();

        Integer cost;
        Map neighbors;
        String node = Manager.findLowestCostNode(costs, processed);

        for (int i = 0; i < costs.size(); i++) {
            cost = costs.get(node);
            neighbors = graph.get(node);
            System.out.println("neghbors " + i + " " + neighbors);
            Integer currentCost;
            if (neighbors != null) {
                for (Object n : neighbors.keySet().toArray()) {
                    currentCost = cost + (Integer) neighbors.get(n);

                    if (currentCost < costs.get(n)) {
                        costs.put(n.toString(), currentCost);
                        parants.put(n.toString(), node);
                    }

                }
            }
            processed.add(node);
            node = Manager.findLowestCostNode(costs, processed);
        }
    }
}
