
package LEC21;

public class Nqueens {

    public static void main(String[] args) {

        int n = 4;
        boolean[][] visited = new boolean[n][n];

        sol(0, 0, n, 0, visited, "");
    }

    public static void sol(int cr, int cc, int n, int qpsf,
            boolean[][] visited, String ans) {

        if (qpsf == n) {
            System.out.println(ans);
            return;
        }

        if (cr == n) {
            return;
        }

        if (cc == n) {
            sol(cr + 1, 0, n, qpsf, visited, ans);
            return;
        }

        if (isItPossible(cr, cc, visited)) {

            visited[cr][cc] = true;

            sol(cr + 1, 0, n, qpsf + 1, visited,
                    ans + "{" + cr + "-" + cc + "} ");

            visited[cr][cc] = false;
        }

        sol(cr, cc + 1, n, qpsf, visited, ans);
    }

    public static boolean isItPossible(int cr, int cc,
            boolean[][] visited) {

        // Check the same column above
        for (int row = cr - 1; row >= 0; row--) {
            if (visited[row][cc]) {
                return false;
            }
        }

        // Check upper-left diagonal
        int row = cr - 1;
        int col = cc - 1;

        while (row >= 0 && col >= 0) {
            if (visited[row][col]) {
                return false;
            }
            row--;
            col--;
        }

        // Check upper-right diagonal
        row = cr - 1;
        col = cc + 1;

        while (row >= 0 && col < visited[0].length) {
            if (visited[row][col]) {
                return false;
            }
            row--;
            col++;
        }

        return true;
    }
}
