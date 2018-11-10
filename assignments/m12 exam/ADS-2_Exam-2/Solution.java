import java.util.Scanner;
/**
 * class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int ver = Integer.parseInt(scan.nextLine());
        int ed = Integer.parseInt(scan.nextLine());
        Edge edge;
        EdgeWeightedGraph ewg = new EdgeWeightedGraph(ver, ed);
        for (int i = 0; i < ed; i++) {
            String[] tokens = scan.nextLine().split(" ");
            edge = new Edge(Integer.parseInt(tokens[0]),
                            Integer.parseInt(tokens[1]),
                            Double.parseDouble(tokens[2]));
            ewg.addEdge(edge);
        }
        String caseToGo = scan.nextLine();
        switch (caseToGo) {
        case "Graph":
            System.out.println(ewg);
            break;
        case "DirectedPaths":
            String[] path = scan.nextLine().split(" ");
            DijkstrasSP dij =
            new DijkstrasSP(ewg, Integer.parseInt(path[0]));
            if (dij.hasPathTo(Integer.parseInt(path[1]))) {
                System.out.println(
                    dij.distance(Integer.parseInt(path[1])));
            } else {
                System.out.println("No Path Found.");
            }
            break;
        case "ViaPaths":
            String[] viapath = scan.nextLine().split(" ");
            DijkstrasSP dij1 =
            new DijkstrasSP(ewg, Integer.parseInt(viapath[0]));
            if (dij1.hasPathTo(
                Integer.parseInt(viapath[2]))
                && dij1.hasPathTo(Integer.parseInt(viapath[1]))) {
                System.out.println(
                    dij1.distance(Integer.parseInt(viapath[2])));
            } else {
                System.out.println("No Path Found.");
            }
            break;

        default:
            break;
        }

    }
}
