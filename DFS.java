package jun10;

import java.util.*;

public class DFS {

    private Map<String, List<String>> graph = new HashMap<>();
    public void addConnection(String person1, String person2) {
        graph.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
        graph.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);
    }
    public List<String> findSocialCircleRecursive(String person) {
        Set<String> visited = new HashSet<>();
        List<String> circle = new ArrayList<>();
        dfsRecursive(person, visited, circle);
        return circle;
    }

    private void dfsRecursive(String person, Set<String> visited, List<String> circle) {
        if (!graph.containsKey(person) || visited.contains(person)) return;
        visited.add(person);
        circle.add(person);
        for (String neighbor : graph.get(person)) {
            dfsRecursive(neighbor, visited, circle);
        }
    }
    public List<String> findSocialCircleIterative(String person) {
        List<String> circle = new ArrayList<>();
        if (!graph.containsKey(person)) return circle;

        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                circle.add(current);
                for (String neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        return circle;
    }

    public List<List<String>> findAllConnectedComponents() {
        Set<String> visited = new HashSet<>();
        List<List<String>> allCircles = new ArrayList<>();

        for (String person : graph.keySet()) {
            if (!visited.contains(person)) {
                List<String> circle = new ArrayList<>();
                dfsRecursive(person, visited, circle);
                allCircles.add(circle);
            }
        }

        return allCircles;
    }

    public static void main(String[] args) {
        DFS network = new DFS();
        network.addConnection("Alice", "Bob");
        network.addConnection("Bob", "Charlie");
        network.addConnection("David", "Eve");
        network.addConnection("Faythe", "Grace");

        System.out.println("Recursive DFS from Alice: " + network.findSocialCircleRecursive("Alice"));
        System.out.println("Iterative DFS from David: " + network.findSocialCircleIterative("David"));
        System.out.println("All social circles: " + network.findAllConnectedComponents());
    }
}