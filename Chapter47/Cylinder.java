
public class Cylinder
{
    private double height;
    private double radius;

    public Cylinder(double height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea()
    {
        return ((2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height));
    }



}