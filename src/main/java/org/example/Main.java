package org.example;
import java.util.Random;

class Main
{
    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                        { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
                        { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
                        { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
                };

        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {

            int coor1 = rnd.nextInt(0, 10);
            int coor2 = rnd.nextInt(0, 10);

            int min_dist = Shortestway.findShortestPathLength(mat, 0, 0, coor1, coor2);

            if (min_dist != -1) {
                System.out.println(String.format("The shortest path for coordinates (%d, %d) has length %d", coor1, coor2, min_dist));
            } else {
                System.out.println("Destination cannot be reached from source");
            }
        }
    }
}