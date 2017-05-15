/*
   Truck class that is inheriting from Vehicle class
*/
public class Truck extends Vehicle
{
   private double towing;
   
   /*
      Truck class constructor
      @param super populates fields with field values from Vehicle class
      @param towing to hold towing capacity
   */
   public Truck(String type, String make, String year, String options, double basePrice, VIN_Report vinNum, double towing)
   {
      super(type, make, year, options, basePrice, vinNum);
      this.towing = towing;
   }
   
   /*
      getter
   */      
   public double getTowing()
   {
      return towing;
   }
   
   /*
      towingCalc method calculates an additional charge if towing capacity exceeds 14K lbs
      @param tow is the value from towing field
   */
   public double towingCalc(double tow)
   {
      double newPrice = 0;
      
      if(towing > 14000)
      {
         newPrice = super.getBasePrice() + 2000;     
      }
      else
      {
         newPrice = super.getBasePrice();   
      }
      
      return newPrice;
   }
   
   public String toString()
   {
      return String.format("Type: " + super.getType() +
                           "\nMake: " + super.getMake() +
                           "\nYear: " + super.getYear() +
                           "\nBase Price: $%,.2f" +
                           "\nOptions Package: " + super.getOptions() +
                           "\nTowing Capacity: %,.2f" +
                           super.getVinObject().toString() +
                           "\nFinal Price: $%,.2f\n", super.getBasePrice(), towing, super.getFinalPrice());
   }
}