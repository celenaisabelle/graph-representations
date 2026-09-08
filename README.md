# Graph Representations

A Java project demonstrating three different ways to represent graphs: an adjacency matrix, a ragged adjacency matrix, and an adjacency list.

Each implementation accepts graph data interactively and stores the relationships between vertices using a different underlying data structure.

Originally developed as part of my Data Structures coursework at Florida International University.

## Implementations

The project contains three graph representations:

### Adjacency Matrix

`AdjacencyMatrix.java`

Represents a graph using a two-dimensional integer matrix.

Each row and column corresponds to a vertex, and each matrix entry indicates whether an edge exists between two vertices.

```text
      A  B  C
A     0  1  1
B     1  0  0
C     1  0  0
```

This representation provides a straightforward way to determine whether an edge exists between two vertices.

### Ragged Adjacency Matrix

`RaggedAdjacencyMatrix.java`

Represents graph connections using a ragged two-dimensional array.

Instead of allocating the same number of columns for every vertex, each row is sized according to the number of edges associated with that vertex.

A `HashMap` maps vertex names to integer indices so adjacent vertices can be stored in the ragged array.

Conceptually:

```text
A -> [1, 2]
B -> [0]
C -> [0]
```

### Adjacency List

`AdjacencyList.java`

Represents the graph using a `HashMap` and `ArrayList` collections.

Each vertex is mapped to a list containing its adjacent vertices.

Conceptually:

```text
A: B C
B: A
C: A
```

This representation stores the neighboring vertices associated with each vertex directly.

## Comparison

| Representation | Primary Data Structure | Storage Approach |
| --- | --- | --- |
| Adjacency Matrix | `int[][]` | Stores an entry for every pair of vertices |
| Ragged Adjacency Matrix | `int[][]` + `HashMap` | Allocates each row based on its number of adjacent vertices |
| Adjacency List | `HashMap<String, List<String>>` | Maps each vertex directly to a list of its neighbors |

Implementing the same graph concept using different structures demonstrates how the choice of data representation changes the way graph relationships are stored and accessed.

## Building the Project

Compile all three implementations:

```bash
javac AdjacencyMatrix.java RaggedAdjacencyMatrix.java AdjacencyList.java
```

This generates the corresponding `.class` files locally.

## Running the Programs

Each implementation can be run independently.

### Adjacency Matrix

```bash
java AdjacencyMatrix
```

### Ragged Adjacency Matrix

```bash
java RaggedAdjacencyMatrix
```

### Adjacency List

```bash
java AdjacencyList
```

Each program prompts the user for graph information such as the number of vertices, vertex names, and relationships between vertices.

## Project Structure

```text
graph-representations/
├── README.md
├── AdjacencyMatrix.java
├── RaggedAdjacencyMatrix.java
├── AdjacencyList.java
└── .gitignore
```

## Technologies

- Java
- Java Collections Framework
- `HashMap`
- `ArrayList`
- Two-dimensional arrays
- Ragged arrays

## What I Learned

This project gave me experience implementing multiple representations of the same data structure and comparing how each approach organizes graph information.

I gained experience with:

- Graph data structures
- Adjacency matrices
- Adjacency lists
- Ragged arrays
- Java collections
- `HashMap`
- `ArrayList`
- Two-dimensional arrays
- Mapping vertex names to indices
- Interactive console input

Implementing three different representations helped me understand how the choice of data structure affects the organization and storage of graph relationships.