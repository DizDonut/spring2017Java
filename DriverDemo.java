import java.util.Scanner;
import java.io.*;

public class DriverDemo
{
   public static void main(String[] a)
   {
      Scanner k = new Scanner(System.in);
      String vn, accident, status, type, make, year;
      double bp, fp;
      String counter = "N";
      do
      {
         System.out.println("Enter VIN Number: ");
         vn = k.nextLine();
         System.out.println("Any accidents? ");
         accident = k.nextLine();
         System.out.println("If so, what kind? ");
         status = k.nextLine();
         System.out.println("Any other cars? ");
         counter = k.nextLine();
         
         VIN_Report object = new VIN_Report(vn, accident, status);
         System.out.println(object);
         
      }while(counter.equalsIgnoreCase("N"));    
   }   
}