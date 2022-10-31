package Activities;
import java.util.Arrays;
public class Activity4 {
    public static void main(String args[])
    {
        int[] array = {4, 3, 2, 10, 12, 1, 5, 6};
        int[] BeforeSort= array;
        int temp=0;
        for (int i = 0; i < 8; i++)
        {
            for (int j =i+1; j<8; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        System.out.println("Before Sorting"+Arrays.toString(BeforeSort));
        System.out.println("Before Sorting"+Arrays.toString(array));

    }
}
