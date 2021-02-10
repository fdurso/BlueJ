
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static int [] main()
    {
        int[] a = {1, 7, 5, 6, 4, 14, 11};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                a[i + 1] = a[i + 1] * 2;
            }
        }
        return a;
    }

}
