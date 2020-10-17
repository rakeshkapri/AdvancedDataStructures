package algorithms.map;

public class AdjacencyMatrix {
    private static boolean[][] adjacencyMatrix;

    public static void main(String s[]){
        adjacencyMatrix = new boolean[5][5];
        addDirectedEdge(0, 1);
        addDirectedEdge(1, 2);
        addDirectedEdge(2, 3);
        addDirectedEdge(3, 4);
        printMap(adjacencyMatrix);
    }

    private static void printMap(boolean[][] adjacencyMatrix) {
        for(int i=0; i<adjacencyMatrix.length; i++){
            for(int j=0; j<adjacencyMatrix.length;j++){
                if(adjacencyMatrix[i][j]){
                    System.out.println(String.format("Node %s and %s are connected", i, j));
                }
            }
        }
    }

    private static void addUndirectedEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = true;
        adjacencyMatrix[destination][source] = true;
    }

    private static void addDirectedEdge(int source, int destination){
        adjacencyMatrix[source][destination] = true;
    }
}
