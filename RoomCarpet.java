/*
   aggregate class
*/

public class RoomCarpet
{
   private RoomDimension object;
   private double carpetPrice;
   
   /*
      constructor
   */
   public RoomCarpet(RoomDimension rd, double carpetPrice)
   {
      rd = new RoomDimension(rd);
      this.carpetPrice = carpetPrice;
   }
   
   //setters and getters
   public void setRDObject(RoomDimension object)
   {
      this.object = new RoomDimension(object);
   }
   
   public void setCarpetPrice(double carpetPrice)
   {
      this.carpetPrice = carpetPrice;
   }
   
   public RoomDimension getRDObject()
   {
      return new RoomDimension(object);
   }
   
   public double getCarpetPrice()
   {
      return carpetPrice;
   }
   
   public double carpetCost(double cp, RoomDimension obj)
   {
      double area = obj.getArea();
      double totalCost = area * cp;
      
      return totalCost;  
   }
   
}