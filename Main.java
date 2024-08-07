public class Main
{
    static int x=1111;
    static
    {
        x=x-- - --x;//2
    }
    {
        x=x++ + ++x;  
    }
    public static void main(String args[])
    {
        System.out.println(x);
    }
}