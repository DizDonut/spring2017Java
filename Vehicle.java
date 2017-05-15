import java.util.Scanner;

public class Vehicle
{
   //Field declarations
   
   private String type;
   private String make;
   private String year;
   private double basePrice;
   private String options;
   private double finalPrice;
      
   /**
      no arg constructor
      @param type The vehicle's type
      @param make The vehicle's make
      @param year The vehicle's year
      @param basePrice The vehicle's base price
      @param options The vehicle's option package choice
      @param finalPrice The vehicle's base + option fee
   */
   public Vehicle()
   {
      type = "";
      make = "";
      year = "";
      basePrice = 0;
      options = "";
      finalPrice = 0;   
   }
   
   /**
      This constructor sets the field assignments to the values
      passed in the arguments
       
      @param type The vehicle's type
      @param make The vehicle's make
      @param year The vehicle's year
      @param basePrice The vehicle's base price
      @param options The vehicle's option package choice
      @param finalPrice The vehicle's base + option fee
   */
   public Vehicle(String type, String make, String year, double basePrice, String options, double finalPrice)
   {
      this.type = type;
      this.make = make;
      this.year = year;
      this.basePrice = basePrice;
      this.options = options;
      this.finalPrice = finalPrice;
   }
   
   public void setType(String i)
   {
      type = i;
   }
   
   public void setMake(String i)
   {
      make = i;
   }
   
   public void setYear(String i)
   {
      year = i;
   }
   
   public void setBasePrice(double x)
   {
      basePrice = x;
   }
   
   public void setOptions(String i)
   {
      options = i;
   }
   
   public void setFinalPrice(double x)
   {
      finalPrice = x;
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
   
   public double getBasePrice()
   {
      return basePrice;
   }
   
   public String getOptions()
   {
      return options;
   }
   
   public double getFinalPrice()
   {
      return finalPrice;
   }
   
   public double calcFinalPrice(double basePrice, String options)
   {
      final double BASE = 2500.00;
      if(options.equals("Y"))
      {
         finalPrice = basePrice + BASE;         
      }
      else
      {
         finalPrice = basePrice;
      }
      return finalPrice;
   }
   
   public void display(String type, String make, String year, double basePrice, String options, double finalPrice)
   {
      System.out.println("Type:\t\t\t\t" + type);
      System.out.println("Make:\t\t\t\t" + make);
      System.out.println("Year:\t\t\t\t" + year);
      System.out.printf("Base Price:\t\t$%,.2f\n", basePrice);
      System.out.println("Options:\t\t\t" + options);
      System.out.printf("Final Price:\t$%,.2f\n\n", finalPrice);
   }

}