package Activities;

public class Activity8 {
public static void main(String args[])
{
    try {
        Activity8.exceptionTest("Testing exception");
        Activity8.exceptionTest(null);
    } catch (CustomException e) {
        System.out.println("Inside catch block"+e.getMessage());
    }

}
    static void exceptionTest(String str) throws CustomException
    {
        if(str==null)
        {
            throw new CustomException("String value is null");
        }
        else
        {
            System.out.println(str);
        }
    }
}

class CustomException extends Exception
{
  String message=null;
public CustomException(String s)
{
    message=s;
}
    public String getMessage() {
        return message;
    }
}