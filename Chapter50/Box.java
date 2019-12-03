public class Box
{
    // dada
    private double width = 0.0;
    private double height = 0.0;
    private double length = 0.0;
    
// constructors
    public Box(double width, double height, double length)
    {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box(double side)
    {
        this.width = side;
        this.height = side;
        this.length = side;
    }
    public Box(Box oldBox)
    {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
        
    }
   

        // methods public Box biggerBox(Box oldBox)
    public Box biggerBox(Box oldBox)
    {
        return new Box( 1.25*oldBox.getWidth(), 1.25*oldBox.getHeight(), 1.25*oldBox.getLength());
    }
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }



    public double volume()
    {
        return width * height * length;
    }
       
    public double surfaceArea()
    {
        return 6*(width * length);
    }

    public double topArea()
    {
        return width * length;
    }

    public double faceArea()
    {
        return height * width;
    }


    



}