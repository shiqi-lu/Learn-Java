interface Output
{
    int MAX_CACHE_LINE = 50;
    void out();
    void getData(String msg);
}
public class OutputTest
{
    public static void main(String[] args)
    {
        System.out.println(Output.MAX_CACHE_LINE);
    }
}
