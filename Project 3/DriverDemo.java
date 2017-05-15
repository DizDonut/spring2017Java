/*
   Driver Demo will accept user inputs about vehicles, continuing to ask
   for inputs until prompted by user, then display results to the screen.
   Final price of the vehicle will be determined based on user inputs for
   any options package or accidents associated with the vehicle.
*/
import java.util.*;

public class DriverDemo
{
   public static void main(String[] a)
   {
      //declare and initialize variables
      Scanner k = new Scanner(System.in);
      String vn, accident, options, status, type, make, year;
      double bp, fp;
      
      //set counter for do-while loop
      String counter = "N";
      
      //create array list to hold our objects
      ArrayList<Vehicle> vList = new ArrayList<Vehicle>(); 
      
      //begin do-while loop to loop through user questions/inputs
      do
      {
         System.out.print("Type: ");
         type = k.nextLine();
         System.out.print("Make: ");
         make = k.nextLine();
         System.out.print("Year: ");
         year = k.nextLine();
         System.out.print("Base price: ");
         bp = k.nextDouble();
         
            while(bp < 1)
            {
               //validation for base price
               System.out.println("Invalid - please enter a number greater than 1: ");
               bp = k.nextDouble();
            }
         
         k.nextLine(); //eat buffer from entering double data type
         
         System.out.print("Options package: ");
         options = k.nextLine();
         System.out.print("VIN Number: ");
         vn = k.nextLine();
         System.out.print("Any accidents? ");
         accident = k.nextLine();
         System.out.print("If so, what kind? Major, Minor or N/A: ");
         status = k.nextLine();
    
         //assign user inputs to params of our class objects
         VIN_Report vnObject = new VIN_Report(vn, accident, status);
         Vehicle vObject = new Vehicle(type, make, year, options, bp, vnObject);  
         
         vList.add(vObject); //add objects to our array list vList

         System.out.print("Any other cars? ");
         counter = k.nextLine();
         System.out.println();              

      }while(counter.equalsIgnoreCase("Y")); //end do-while loop
      
      //loop through array list to display vehicle details
      for(int index = 0; index < vList.size(); index++)
      {
         System.out.println("Vehicle Information");
         System.out.println(vList.get(index));
      }    
      
   }//end main method 
}