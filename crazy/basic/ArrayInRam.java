public class ArrayInRam
{
    public static void main(String[] args)
    {
        int[] a = {5, 7, 20};
        int[] b = new int[4];
        System.out.println("b length: " + b.length);

        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
        
        for (int i = 0; i < b.length; ++i) {
            System.out.println(b[i]);
        }
        b = a;
        System.out.println("b length: " + b.length);
    }
}
