public class Vehicle
{
   //declare and intialize value fields and constant value fields
   private String type, make, year, options;
   private double basePrice, finalPrice;
   private VIN_Report vinObject;
   private final double OPT_FEE = 2500.00;
   private final double MAJOR = 0.25;
   private final double MINOR = 0.10;
   
   /*
      Constructor with args passed to field values
      @param type The vehicle's type
      @param make The vehicle's make
      @param year The vehicle's year
      @param options The vehicle's option package choice
      @param basePrice The vehicle's base price
      @param vinObject Object from VIN_Report class
   */
   
   public Vehicle(String type, String make, String year, String options, double basePrice, VIN_Report vinNum)
   {
      //use 'this' reference to overcome shadowing
      this.type = type;
      this.make = make;
      this.year = year;
      this.options = options;
      this.basePrice = basePrice;
      vinObject = new VIN_Report(vinNum); //reference copy of object to avoid security holes
   }
   
   //setters and getters
   
   public void setType(String type)
   {
      this.type = type;
   }
   
   public void setMake(String make)
   {
      this.make = make;
   }
   
   public void setYear(String year)
   {
      this.year = year;
   }
   
   public void setOptions(String options)
   {
      this.options = options;
   }
   
   public void setBasePrice(double basePrice)
   {
      this.basePrice = basePrice;
   }

   public void setFinalPrice(double finalPrice)
   {
      this.finalPrice = finalPrice;
   }   

   public void setVinObject(VIN_Report vinObject)
   {
      this.vinObject = new VIN_Report(vinObject);
   }
   
   public String getType()
   {
      return type;
   }
   
   public String getMake()
   {
      return make;
   }
   
   public String getYear()
   {
      return year;
   }
   
   public String getOptions()
   {
      return options;
   }
   
   public double getBasePrice()
   {
      return basePrice;
   }
   
   public VIN_Report getVinObject()
   {
      return new VIN_Report(vinObject);
   }
   
   /*
      getFinalPrice method determines final price based on value returned
      from options instance field as well as value returned from the statusNum
      method of the VIN_Report class
   */
   public double getFinalPrice()
   {
      double reduction = vinObject.statusNum();
      
      if(options.equalsIgnoreCase("Yes"))
      {
         return finalPrice = (basePrice + OPT_FEE) - ((basePrice + OPT_FEE) * reduction);
      }
      else
      {
         return finalPrice = basePrice - (basePrice * reduction);
      }
   }
   
   public String toString()
   {
      return String.format("Type: " + type +
                           "\nMake: " + make +
                           "\nYear: " + year +
                           "\nBase Price: $%,.2f" +
                           "\nOptions Package: " + options +
                           vinObject.toString() +
                           "\nFinal Price: $%,.2f\n", basePrice, getFinalPrice());
   }
}