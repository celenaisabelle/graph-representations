//Task 2
import java.util.*;

public class RaggedAdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of vertices
        System.out.println("Enter number of vertices:");
        int n = Integer.parseInt(sc.nextLine());

        // Get vertex names and build map
        System.out.println("Enter list of vertices:");
        String[] vertices = sc.nextLine().split(" ");
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(vertices[i], i);
        }

        // Create ragged array
        int[][] ragged = new int[n][];

        // Fill ragged array
        for (int i = 0; i < n; i++) {
            System.out.println("How many edges are associated with " + vertices[i]);
            int edgeCount = Integer.parseInt(sc.nextLine());

            ragged[i] = new int[edgeCount];
            System.out.println("Enter adjacent vertices to " + vertices[i]);
            String[] adjacent = sc.nextLine().split(" ");
            for (int j = 0; j < edgeCount; j++) {
                ragged[i][j] = indexMap.get(adjacent[j]);
            }
        }

        // Print out the result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ragged[i].length; j++) {
                System.out.print(ragged[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
