package com.zenika.kata;

public class SandPile {

    private static final int MAX_SIZE_REACHED = 4;

    public static int[][] addSand(int[][] sandbox, int n) {

        if (n == 0) return sandbox;

        addSand(sandbox, sandbox.length / 2, sandbox[0].length / 2);

        return addSand(sandbox, n - 1);
    }

    private static void addSand(int[][] sandbox, int row, int col) {

        if (row == -1 || row > sandbox.length - 1) return;
        if (col == -1 || col > sandbox[0].length - 1) return;

        sandbox[row][col]++;

        if (sandbox[row][col] == MAX_SIZE_REACHED) collapsePile(sandbox, row, col);
    }

    private static void collapsePile(int[][] sandbox, int row, int col) {

        sandbox[row][col] = 0;

        addSand(sandbox, row - 1, col);
        addSand(sandbox, row + 1, col);
        addSand(sandbox, row, col - 1);
        addSand(sandbox, row, col + 1);
    }

}