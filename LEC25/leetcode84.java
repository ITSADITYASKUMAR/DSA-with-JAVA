package LEC25;

import java.util.Stack;

public class leetcode84 {

    public static void main(String[] args) {

        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        leetcode84 obj = new leetcode84();

        int result = obj.maximalRectangle(matrix);

        System.out.println("Maximum Rectangle Area: " + result);
    }

    public int maximalRectangle(char[][] matrix) {

        if (matrix == null || matrix.length == 0
                || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            maxArea = Math.max(
                maxArea, largestRectangleArea(heights)
            );
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty()
                    && currentHeight < heights[stack.peek()]) {

                int h = heights[stack.pop()];

                int w = stack.isEmpty()
                        ? i
                        : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, h * w);
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return maxArea;
    }
}