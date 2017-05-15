import java.util.*;

public class RoomDemo
{
   public static void main(String[] args)
   {
      double width, length, carpetPrice, totalCost;
      Scanner k = new Scanner(System.in);
      String counter = "N";
      
      System.out.println("Welcome to the Carpet Showroom!");
      
      do
      {
         System.out.println("\nPlease enter the length of your room: ");
         length = k.nextDouble();
            while(length <= 0)
            {
               System.out.println("Invalid, please enter a positive number: ");
               length = k.nextDouble();
            }
         System.out.println("Please enter the width of your room: ");
         width = k.nextDouble();
            while(width <= 0)
            {
               System.out.println("Invalid, please enter a positive number: ");
               width = k.nextDouble();
            }
         System.out.println("Please enter the price per square foot of your desired carpet: ");
         carpetPrice = k.nextDouble();
            while(carpetPrice <= 0)
            {
               System.out.println("Invalid, please enter a positive number: ");
               carpetPrice = k.nextDouble();
            }
         k.nextLine();   
         
         RoomDimension dimensions = new RoomDimension(width, length);
         RoomCarpet carpet = new RoomCarpet(dimensions, carpetPrice);
         
         totalCost = carpet.carpetCost(carpetPrice, dimensions);
         
         System.out.printf("The total cost of your carpet is $%,.2f \n", totalCost);
         System.out.println("\nWould you like to get another quote? ");
         counter = k.nextLine();
                  
      }while(counter.equalsIgnoreCase("Y")); //end do-while loop   
   }//end main method
}