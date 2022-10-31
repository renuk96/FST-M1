package Activities;

public class Activity2 {
    public static void main(String args[])
    {
        //int numbers[]=new int[5];
        int numArr[] = {10, 77, 10, 54, -11, 10};
        System.out.println("The sum of numbers is array is 30:"+sumCheck(numArr));
    }
        public static boolean sumCheck(int []numArr)
        {int sum=0;
            for (int num : numArr)
            {
                if(num==10)
                sum = sum + num;

            }
            if (sum > 30)
            {
                return false;

            }
            return true;
        }

}
