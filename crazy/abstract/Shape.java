public abstract class Shape
{
    {
        System.out.println("init Shape scope");
    }
    private String color;
    public abstract double calPerimeter();
    public abstract String getType();
    public Shape() {}
    public Shape(String color)
    {
        System.out.println("Shape's constructor");
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
}
