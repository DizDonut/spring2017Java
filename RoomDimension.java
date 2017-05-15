public class RoomDimension
{
   private double width, length;
   
   /*
      constructor
   */
   
   public RoomDimension(double width, double length)
   {
      this.width = width;
      this.length = length;
   }
   
   /*
      copy constructor
   */
   
   public RoomDimension(RoomDimension object)
   {
      width = object.width;
      length = object.width;
   }
   
   //setters and getters
   public void setWidth(double width)
   {
      this.width = width;
   }
   
   public void setLength(double length)
   {
      this.length = length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public double getArea()
   {
      double area = length * width; 
      return area;
   }
}