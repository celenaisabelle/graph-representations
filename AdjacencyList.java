//Task 3
import java.util.*;

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of vertices
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Read vertex names
        String[] vertices = new String[n];
        Map<String, List<String>> adjList = new HashMap<>();

        System.out.print("Enter vertex names: ");
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            vertices[i] = input[i];
            adjList.put(vertices[i], new ArrayList<>());
        }

        // Add adjacent vertices
        for (int i = 0; i < n; i++) {
            System.out.println("How many edges are associated with " + vertices[i]);
            int edgeCount = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter adjacent vertices to " + vertices[i]);
            String[] adjacent = sc.nextLine().split(" ");
            for (int j = 0; j < edgeCount; j++) {
                adjList.get(vertices[i]).add(adjacent[j]);
            }
        }

        // Print out adjacency list
        System.out.println("\nAdjacency List:");
        for (String v : vertices) {
            System.out.print(v + ": ");
            for (String neighbor : adjList.get(v)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
