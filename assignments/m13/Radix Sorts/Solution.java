import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for lsd.
 */
class Lsd {
    /**
     * Constructs the object.
     */
    Lsd() { }
    /**
     * Sorts the given strings.
     * Complxity is 2 N W.
     * N - No.of Strings.
     * W - Fixed Length of String.
     *
     * @param      a     { String array }
     * @param      w     { Fixed length of String }
     */
    public void sort(final String[] a, final int w) {
        int n = a.length;
        int s = (int) Math.pow(2 * 1, 2 * 2);   // extend ASCII alphabet size
        String[] aux = new String[n];

        for (int d = w - 1; d >= 0; d--) {
            // sort by key-indexed counting on dth character

            // compute frequency counts
            int[] count = new int[s + 1];
            for (int i = 0; i < n; i++) {
                count[a[i].charAt(d) + 1]++;
            }

            // compute cumulates
            for (int r = 0; r < s; r++) {
                count[r + 1] += count[r];
            }

            // move data
            for (int i = 0; i < n; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }

            // copy back
            for (int i = 0; i < n; i++) {
                a[i] = aux[i];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
/**
 * Class for Solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * Main Method for Sorting the Given Strings.
     * Complexity is 2 N W.
     * N - No.of Strings.
     * W - Fixed Length of String.
     * It is Stable.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String[] input = new String[count];
        for (int i = 0; i < count; i++) {
            input[i] = sc.nextLine();
        }
        Lsd lsd = new Lsd();
        lsd.sort(input, input[0].length());
    }
}
