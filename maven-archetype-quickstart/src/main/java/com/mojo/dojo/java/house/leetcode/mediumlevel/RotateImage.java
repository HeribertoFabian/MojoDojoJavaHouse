package com.mojo.dojo.java.house.leetcode.mediumlevel;

public class RotateImage {
    
    public static void main(String[] args) {
        int[] fila1 = {1,2,3};
        int[] fila2 = {4,5,6};
        int[] fila3 = {7,8,9};

        int[][] matrix = {fila1, fila2, fila3};

        RotateImage rm = new RotateImage();
        System.out.println("Matriz antes de transponer");
        rm.printMatrix(matrix);

        System.out.println("\n\n\nMatriz despues de transponer");
        rm.printMatrix(rm.rotate(matrix));
        
    }

    public int[][] rotate(int[][] matrix){
        int size = matrix.length;

        for(int i = 0; i < size; i++){
            for(int j = i; j < size; j++){      // El bucle interior (j) recorre desde i hasta n para evitar intercambiar los mismos elementos dos veces y trabajar solo en la parte superior de la diagonal.
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // codigo para invertir cada fila
        for( int i = 0; i < size; i++){
            for(int j = 0; j < size/2 ; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][size-j-1];
                matrix[i][size -j -1] = tmp;
            }
        }

        return matrix;
    }


    public void printMatrix(int[][] matrix){
        int size = matrix.length;
        for(int i = 0; i< size; i++){
            System.out.print("[ ");
            for(int j = 0; j< matrix.length; j++){
                System.out.print(matrix[i][j]);
                if(j < size-1){
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");
        }
    }
}

/*
 You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [
  [1,2,3],
  [4,5,6],
  [7,8,9]
]
Output: [
  [7,4,1],
  [8,5,2],
  [9,6,3]
]


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]


 */