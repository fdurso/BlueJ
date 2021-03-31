
/**
 * Write a description of class Lab1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab1
{
    public int sum(int[][] matrix)
    {
        int sum = 0;
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                sum += matrix[row][col];
            }
        }
        return sum;
    }
    
    public int rowSum(int[][] matrix, int row)
    {
        int sum = 0;
        for(int col = 0; col < matrix[row].length; col++)
        {
            sum += matrix[row][col];
        }
        return sum;
    }
    
    public int colSum(int[][] matrix, int col)
    {
        int sum = 0;
        for(int row = 0; row < matrix.length; row++)
        {
            sum += matrix[row][col];
        }
        return sum;
    }
    
    public int sum2(int[][] matrix)
    {
        int sum = 0;
        for(int row = 0; row < matrix.length; row++)
        {
            sum += rowSum(matrix, row);
        }
        return sum;
    }
    
    public int largest(int[][] matrix)
    {
        int max = Integer.MIN_VALUE;
        for(int[] row : matrix)
        {
            for(int element : row)
            {
                if (element > max)
                    max = element;
            }
        }
        return max;
    }
    
    public int largestByRow(int[][] matrix, int row)
    {
        int max = Integer.MIN_VALUE;
        for(int element : matrix[row])
        {
            if (element > max)
                max = element;
        }
        return max;
    }
    
    public int largest2(int[][] matrix)
    {
        int max = Integer.MIN_VALUE;
        int rowMax;
        for(int row = 0; row < matrix.length; row++)
        {
            rowMax = largestByRow(matrix, row);
            if (rowMax > max)
                max = rowMax;
        }
        return max;
    }
    
    public void printTranspose(int[][] matrix)
    {
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                System.out.print(matrix[col][row] + " ");
            }
            System.out.println();
        }
    }
}
