package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class Body {
    private static final int[] row = { -1, 0, 0, 1 };
    private static final int[] col = { 0, -1, 1, 0 };

    public static int[] getRow(){
        return row;
    }

    public static int[] getCol(){
        return col;
    }


    static boolean isValid(int[][] mat, boolean[][] visited, int row, int col)
    {
        return (row >= 0) && (row < mat.length) && (col >= 0) && (col < mat[0].length)
                && mat[row][col] == 1 && !visited[row][col];
    }

}
