package com.mt.leetcode;

import java.util.Arrays;

public class FloodFill {

    public static void main(String[] args) {
//        int[][] arr = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] arr = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        printDoubleArr(arr);
        System.out.println("-------------------");
        printDoubleArr(floodFill(arr, 1, 1, 2));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private static void fill(int[][] image, int sr, int sc, int color, int oldColor) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        if(oldColor != image[sr][sc]) return;
        image[sr][sc] = color;
        fill(image, sr-1, sc, color, oldColor);
        fill(image, sr+1, sc, color, oldColor);
        fill(image, sr, sc-1, color, oldColor);
        fill(image, sr, sc+1, color, oldColor);
    }

    public static void printDoubleArr(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("");
        }
    }

}
