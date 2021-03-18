import java.io.*;
import java.util.Arrays;

public class day1
{
    public static void main() throws IOException
    {
        File file = new File("input.txt");
        
        BufferedReader input = new BufferedReader(new FileReader(file));
        
        int[] numbers;
        int i = 0;
        String st;
        while ((st = input.readLine()) != null)
        {
            int[i] = Integer.parseInt(st);
            i++;
        }
        
        
    }
}
