class BaseClass
{
    public int book = 6;
    public void base()
    {
        System.out.println("BaseClass Method");
    }
    public void test()
    {
        System.out.println("BaseClass Override");
    }
}

public class SubClass extends BaseClass
{
    public String book = "light java EE";
    public void test()
    {
        System.out.println("Subclass override");
    }
    public void sub()
    {
        System.out.println("subclass method");
    }
    public static void main(String[] args)
    {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        BaseClass ploymophicBc = new SubClass();
        System.out.println(ploymophicBc.book);
        ploymophicBc.base();
        ploymophicBc.test();
    }
}
/*
output:
6
BaseClass Method
BaseClass Override
light java EE
BaseClass Method
Subclass override
6
BaseClass Method
Subclass override
*/
