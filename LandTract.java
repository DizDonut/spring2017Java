public class LandTract
{
   private double length;
   private double width;
   
   public double area(double len, double wid)
   {
      length = len;
      width = wid;
      double area = length * width;
      return area;
   }
   
   public String toString()
   {
      String str = "Length: " + length +
                   "\nWidth: " + width +
                   "\nArea: " + area;
                   
      return str;
   }
   
   public boolean equals(LandTract object2)
   {
      boolean check;
      
      //determine whether object's length & width are equal to object 2's length & width
      if(length == object2.length && width == object2.width)
         check = true;
      else
         check = false;
      
      return check;   
   }     
}