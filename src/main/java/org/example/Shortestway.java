package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.example.Body.isValid;

public class Shortestway {
    static int findShortestPathLength(int[][] mat, int i, int j, int x, int y) {
        // base case: invalid input
        if (mat == null || mat.length == 0 || mat[i][j] == 0 || mat[x][y] == 0) {
            return -1;
        }

        int M = mat.length;
        int N = mat[0].length;

        boolean[][] visited = new boolean[M][N];


        Queue<Node> q = new ArrayDeque<>();


        visited[i][j] = true;
        q.add(new Node(i, j, 0));


        int min_dist = Integer.MAX_VALUE;


        while (!q.isEmpty()) {

            Node node = q.poll();


            i = node.x;
            j = node.y;
            int dist = node.dist;


            if (i == x && j == y) {
                min_dist = dist;
                break;
            }


            for (int k = 0; k < 4; k++) {

                if (isValid(mat, visited, i + Body.getRow()[k], j + Body.getCol()[k])) {
                    visited[i + Body.getRow()[k]][j + Body.getCol()[k]] = true;
                    q.add(new Node(i + Body.getRow()[k], j + Body.getCol()[k], dist + 1));
                }
            }
        }

        if (min_dist != Integer.MAX_VALUE) {
            return min_dist;
        }
        return -1;

    }
}
