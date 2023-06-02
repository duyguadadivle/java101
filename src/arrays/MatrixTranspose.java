package arrays;

public class MatrixTranspose {

    public static void main(String[] args) {

        int [][] matrix = {
                {1,2,3},
                {4,5,6,},
                {7,8,9},
                {0,0,0}
        };

        System.out.println("Matrix : ");
        for(int[] row: matrix){
            for(int column: row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose: ");
        int column = matrix[0].length;
        for(int i=0; i<column; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(" " + matrix[j][i] + " ");
            }
        }
        System.out.println();
    }
}
