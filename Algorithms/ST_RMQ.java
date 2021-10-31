public class ST_RMQ {
    // https://www.geeksforgeeks.org/sparse-table/
    
    static int MAX =500;
    static int [][]lookup = new int[MAX][MAX];

    /**
     * { 7, 2, 3, 0, 5, 10, 3, 12, 18 }
     */

    static void buildSparseTable(int[] arr, int n) {
        for (int i = 0; i < n; i++) lookup[i][0] = arr[i];

        for (int j = 1; (1 << j) <= n; j++) {
            for (int i = 0; (i + (1 << j) - 1) < n; i++) {
                lookup[i][j] = Math.min(lookup[i][j - 1], lookup[i + (1 << (j - 1))][j - 1]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(lookup[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int query(int L, int R) {
        int j = (int)Math.log(R - L + 1);
        return Math.min(lookup[L][j], lookup[R - (1 << j) + 1][j]);
    }

    public static void main (String[] args) {
        int[] a = { 7, 2, 3, 0, 5, 10, 3, 12, 18 };
        int n = a.length;
        buildSparseTable(a, n);
        System.out.println("\n--------------------------------\n");
        System.out.println(query(0, 4));
        System.out.println(query(4, 7));
        System.out.println(query(7, 8));

    }
}