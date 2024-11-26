package arrays.multidimensional;

public class MultiDimensionalArray {

    public void explainMultiDimensionalArray() {
        // Declare and initialize a 2D array
        int[][] matrix = {
                {1, 2, 3},//0
                {4, 5, 6},//1
                {7, 8, 9} //2
                //0  1  2
        };

        // Accessing elements of the 2D array
        System.out.println("Element at [1][2]: " + matrix[1][2]);

        System.out.println("Matrix :");
        //nested for loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
