import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {
    /** Program that receives input m x n matrix and for each row or column that
     * contains a 0, sets its row and column to 0 **/

    public static int[][] zero(int[][] matrix){
        ArrayList<Integer> rows0 = new ArrayList<Integer>();
        ArrayList<Integer> columns0 = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    rows0.add(i);
                    columns0.add(j);
                    j = matrix[0].length;
                }
            }
        }
        int[][] result = matrix;
        for (int i = 0; i < rows0.size(); i++){
            Arrays.fill(result[rows0.get(i)], 0);
        }
        for (int j = 0; j < columns0.size(); j++){
            for (int q = 0; q < matrix.length; q++){
                result[q][columns0.get(j)] = 0;
            }
        }
        return result;
    }

    public static void zeroOpt(int[][] matrix) {
        boolean rowContains0 = false;
        boolean columnContains0 = false;
        // check for 0 in first column
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                columnContains0 = true;
                break;
            }
        }
        // check for 0 in first row
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                rowContains0 = true;
                break;
            }
        }
        // Check for 0's in all positions after first column and first row.
        //  If found, set the 0 index of the column or row to 0 as marker.
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                nullifyColumn(matrix, i);
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                nullifyRow(matrix, i);
            }
        }
        if (rowContains0){
            nullifyRow(matrix, 0);
        }
        if (columnContains0){
            nullifyRow(matrix, 0);
        }
    }

    public static void nullifyColumn (int[][] matrix, int columnIndex){
        for (int i = 0; i < matrix.length; i++){
            matrix[i][columnIndex] = 0;
        }
    }
    public static void nullifyRow ( int[][] matrix, int rowIndex){
        for (int i = 0; i < matrix[0].length; i++){
            matrix[rowIndex][i] = 0;
        }
    }

//    public static void main(String[] args){
//        int[][] test_matrix = {{1, 1, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
//        for (int i = 0; i < test_matrix.length; i++){
//            for(int j = 0; j < test_matrix[0].length; j++){
//                System.out.print(test_matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        zeroOpt(test_matrix);
//        for (int i = 0; i < test_matrix.length; i++){
//            for(int j = 0; j < test_matrix[0].length; j++){
//                System.out.print(test_matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
