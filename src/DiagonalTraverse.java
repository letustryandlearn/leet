import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalTraverse {

    public static int[] diagonalTraverse(int[][] mat) {

        int myRows = mat.length;
        int myCols = mat[0].length;
        int[] myArr =new int[myRows*myCols];
        int curRow = 0;
        int curCol = 0;
        boolean up = true;
        int k=0;

        while (k < myRows * myCols) {
            if (up) {
                while (curRow >= 0 && curCol <= myCols-1) {
                    myArr[k]=(mat[curRow][curCol]);
                    curRow = curRow - 1;
                    curCol = curCol + 1;
                    k++;
                }
                if (curCol == myCols) {
                    curCol = curCol - 1;
                    curRow = curRow + 2;
                } else {
                    curRow = curRow + 1;
                }
                up = false;


            } else {

                while (curRow <=myRows-1 && curCol >= 0) {
                    myArr[k]=mat[curRow][curCol];
                    curRow = curRow + 1;
                    curCol = curCol - 1;
                    k++;
                }
                if (curRow == myRows) {
                    curCol = curCol + 2;
                    curRow = curRow - 1;
                } else {
                    curCol = curCol + 1;
                }
                up = true;


            }
        }
       return  myArr;


    }

    public static void main(String[] args) {
        int[][] matrix ={{1,3,5},{10,11,16},{23,30,34}};
        System.out.println(Arrays.toString(diagonalTraverse(matrix)));

    }
}
