public class SearchMatrix {

    public static boolean searchMatrix(int[][] mat, int element) {
        int myRows = mat.length;
        int myCols = mat[0].length;

        int topRow = 0;
        int rightCol = myCols - 1;

        while (topRow < myRows && rightCol >= 0) {
            if (element == mat[topRow][rightCol]) {
                return true;
            } else if (element < mat[topRow][rightCol]) {
                rightCol--;

            } else if (element > mat[topRow][rightCol]) {
                topRow++;

            }

        }

        return false;
    }

    public static void main(String[] args) {

       int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};//[[1,3,5,7],[10,11,16,20],[23,30,34,60]];
        System.out.println( searchMatrix(matrix,80));

    }
}
