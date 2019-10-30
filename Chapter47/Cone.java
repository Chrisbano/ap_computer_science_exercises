
public class Cone
{
    private double height;
    private double radius;

    public Cone(double radius, double height)
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

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height/3.0;
    }
    public double area()
    {
        return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius));   
    }

    public double slantHeight()
    {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }

    public double angle()
    {
        return Math.atan(radius/height);
    }
    



}