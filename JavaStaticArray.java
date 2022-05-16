public class JavaStaticArray
{
    public static void main(String[] args)
    {
        String[] strings;
        strings = new String[]{
            "First string",
            "Second string",
            "Third string",
            "Fourth string"
        };
        strings[0] = "Replaced first string";
        for(int n=0;n<strings.length;n++)
        {
            System.out.println(strings[n]);
        }
    }
}