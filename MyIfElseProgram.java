public class MyIfElseProgram
{
    public static void main(String[] args)
    {
        int n;
        for(n = 0; n < 10; n++)
        {
            if(n == 0)
            {
                System.out.println("First one: " + n);
            }
            else if(n < 5)
            {
                System.out.println("Less than five: " + n);
            }
            else
            {
                System.out.println("NOT less than five: " + n);
            }
        }
    }
}