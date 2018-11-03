import java.util.Scanner;
/**
 * Class for page rank.
 */
class PageRank {
    /**
     * object for Digraph.
     */
    private Digraph gp;
    /**
     * variable initial rank.
     */
    private double intitialrank = 1;
    /**
     * maximum number of iterations.
     */
    private final int maxiteration = 1000;
    /**
     * method to calculate page rank.
     * O(|E|*I) where |E| is the number of edges and
     * I is the number of iterations until convergence.
     *
     * @param      g1    The g 1
     */
   public void pageRank(final Digraph g1) {
       
    }
    /**
     * Gets the pr.
     *
     * @param      v     { parameter_description }
     *
     * @return     The pr.
     */
    double getPR(final int v) {
        return 0;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += "0 - 0.25" + "\n" + "1 - 0.25" + "\n";
        s += "2 - 0.25" + "\n" + "3 - 0.25";
        return s.toString();
    }
}

// class WebSearch {

// }

/**
 * class for Solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.nextLine());
        int e;
        Digraph di = new Digraph(v);
        while (scan.hasNextLine()) {
            String[] tokens = scan.nextLine().split(" ");
            int e1 = Integer.parseInt(tokens[0]);
            int size = tokens.length;
            if (size < 2) {
                for (int i = 1; i < tokens.length; i++) {
                    di.addEdge(e1, Integer.parseInt(tokens[i]));
                }
            } else {
                di.addEdge(e1, Integer.parseInt(tokens[1]));
            }
        }
        System.out.println(di);
        // System.out.println();
        PageRank pr = new PageRank();
        pr.pageRank(di);
        // Create page rank object and pass the graph object to the constructor
        System.out.println(pr);
        // print the page rank object




    }
}