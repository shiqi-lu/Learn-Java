public class Primitive2String
{
    public static void main(String [] args)
    {
        String intStr = "123";
        int it1 = Integer.parseInt(intStr);
        int it2 = new Integer(intStr);
        System.out.println(it2);
        String floatStr = "4.56";
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = new Float(floatStr);
        System.out.println(ft2);
        String ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);
        String dbStr = String.valueOf(3.344);
        System.out.println(dbStr);
        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());
    }
}

/*
output:
123
4.56
2.345
3.344
TRUE
*/
