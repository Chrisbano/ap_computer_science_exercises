
public class TestBox    
{
    public static void main(String[] args)
    {
        Box box = new Box(2.5, 5.0, 6.0);
        Box newBox = new Box(box);

        newBox = newBox.biggerBox(box);

        
        

    

        System.out.println("Surface area: " + box.surfaceArea() + " Volume: " + box.volume()); 
        
        System.out.println( "length: " + box.getLength() + " height: " + box.getHeight() + "width:  " + box.getWidth() ); 

        System.out.println( "topArea: "  + box.topArea() );

        System.out.println( "Big Box Length: " + newBox.getLenth() + " Old Box Lenght: " + box.getLenght());
    }
}