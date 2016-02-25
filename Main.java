package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[4][4];
        int matrixMaker;

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                matrixMaker = (int) (Math.random() * 10000);
                matrix[row][column] = (int) (Math.pow(10, column) % 10);
            }
        }
    }

    public static void printMatrix(int[][] inputMatrix) {
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                System.out.print(inputMatrix[row][column] + " ");

            }
        }
    }
}
