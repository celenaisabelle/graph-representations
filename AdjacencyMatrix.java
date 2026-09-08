//Task 1
import java.util.*;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of vertices
        System.out.println("Enter number of vertices:");
        int n = Integer.parseInt(sc.nextLine());

        // Get vertex names
        System.out.println("Enter list of vertices:");
        String[] vertices = sc.nextLine().split(" ");

        // Create matrix
        int[][] matrix = new int[n][n];

        // Fill matrix with edges
        System.out.println("Enter 1 for Yes and 0 for No");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Does " + vertices[i] + " has an edge with " + vertices[j]);
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        // Print out the matrix
        System.out.println("Following graph is stored");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
