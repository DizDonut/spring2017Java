/*
   Mike Bechtel - CSC151_60
   This program will read vehicle information from a given text file and display the
   make, model, year, base price, any options package, and total price of each vehicle.
   It will also display both the total and average price of all vehicles.  This is a modular
   program, so methods will be used to calc and display the results.
*/

import java.util.Scanner;
import java.io.*;

public class VehicleInventory
{
   public static void main(String[] a) throws IOException
   {
      //open file
      File f = new File("VehicleInformation.txt");
      //create scanner object to read in data from file
      Scanner inputFile = new Scanner(f);
      
      //declare and initialize variables
      int vehicleCount = 0;
      String type, make, year, options;
      double basePrice, optionsFee, finalPrice;
      
      //declare and initialize accumulators
      double totalPrice = 0, averagePrice = 0;
      
      //loop through file, looking for next available text and assigning appropriate variables
      while(inputFile.hasNext())
      {
         type = inputFile.nextLine();
         make = inputFile.nextLine();
         year = inputFile.nextLine();
         basePrice = inputFile.nextDouble();
         //eat buffer left behind from moving from Double to String value
         inputFile.nextLine();
         options = inputFile.nextLine();
         
         //find and handle end of the file
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
        
        //needed for the average of the total price of the cars
        vehicleCount++;
        
        finalPrice = calcFinalPrice(basePrice, options);
        
        //totalPrice accumulator
        totalPrice += finalPrice;
        
        averagePrice = calcAvgPrice(vehicleCount, totalPrice);
        displayCars(type, make, year, options, basePrice, finalPrice); 
      }
      
      //display total and average results
      System.out.println("\n---------------------------------------------");
      System.out.printf("Total Price Of All Vehicles: \t\t$%,.2f\n", totalPrice);
      System.out.printf("Average Price Of All Vehicles:  \t$%,.2f\n", averagePrice);
      
      //close file
      inputFile.close();
   }// end main

   /**
      The calcFinalPrice method calculates the total price of the car, given the base and options listed in the file
      @param price is the basePrice of the care returned from the input file
      @param option is the string variable of either Y or N and is used to determine whether additional fees will be added to the local variable totalPrice
   */
   
   public static double calcFinalPrice(double price, String option)
   {
      //declare and initialize constant value for the options fee
      final double FEE = 2500.00;
      double finalPrice = price;
      
      //.equals method must be used to compare string values
      if(option.equals("Y"))
      {
         finalPrice += FEE;
      }
      
      return finalPrice;
   }// end calcFinalPrice
   
   /**
      The calcAvgPrice method returns the average price of all cars in the file
      @param count is the count each set of vehicle data in the file
      @param price is the value returned from the calcFinalPrice method
   */
   
   public static double calcAvgPrice(int count, double price)
   {
      double average;
      average = price / count;
      return average;
   }// end calcAvgPrice

   /**
      The displayCars method displays the values returned from the parameters
      @param type is the type of the car returned from the file
      @param make is the make of the car returned from the file
      @param year is the year of the car returned from the file
      @param options is the options package returned from each car in the file
      @param base is the value stored in the main variable basePrice from the file
      @param total is the value returned from the calcFinalPrice method
   */
  
   public static void displayCars(String type, String make, String year, String options, double base, double total)
   {
      System.out.println("\nType: \t\t\t\t" + type);
      System.out.println("Make: \t\t\t\t" + make);
      System.out.println("Year: \t\t\t\t" + year);
      System.out.printf("Base Price: \t\t$%,.2f\n", base);
      System.out.println("Options Package: \t" + options);
      System.out.printf("Final Price: \t\t$%,.2f\n", total);
      
   }// end displayCars
}

