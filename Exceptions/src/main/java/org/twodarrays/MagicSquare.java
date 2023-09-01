package org.twodarrays;

public class MagicSquare {

    public static void main(String[] args) {
        int[][][] myArray = new int [3][3][3];
        //myArray[width][height].length


        int[][] magicSquare = {{2,7,6},
                               {9,5,1},
                               {4,3,8}};

        int rowTotal= 0;
        for(int row = 0; row < magicSquare.length; row++){
            for(int col = 0; col < magicSquare[row].length; col++){
                System.out.println("The current element: "+ magicSquare[row][col]);
                rowTotal += magicSquare[row][col];
            }

            System.out.println(rowTotal);
            rowTotal = 0;
        }
    }
}
