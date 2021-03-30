import java.util.*;

public class Main
{
    public static void main()
    {
        int[][] matrix = {{3,4,5}, {6,7,8}, {9,10,11}};
        
        //row major traversal
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[0].length; col++)
            {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //column major traversal
        for(int col = 0; col < matrix[0].length; col++)
        {
            for(int row = 0; row < matrix.length; row++)
            {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //print contents of 2D array by row
        for(int i = 0; i < matrix.length; i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        
        for(int[] row : matrix) //for each row, or 1D array, in the 2D array matrix
        {
            for (int element : row)//for each element in row
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
