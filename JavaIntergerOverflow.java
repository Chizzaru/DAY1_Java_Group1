public class JavaIntergerOverflow
{
    public static void main(String[] args)
    {
        int n = 2000000000; //2 billion; 9 zeros
        System.out.println("First, the value is " + n);
        n = n + 1000000000; // 1 billion; 9 zeros
        System.out.println("After adding, the value is " + n);
    }
}