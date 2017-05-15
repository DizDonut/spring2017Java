import java.util.Scanner; //for input and output

public class PeerProgrammingTwo
{
   public static void main(String[] args)
   {
      //declare and initialize variables
      String name;
      final int SENT = -99; // initialize sentinal value to constant
      int num, lowest = Integer.MAX_VALUE; //initiliaze lowest variable to max num an int var can hold 
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter your name: ");
      name = keyboard.nextLine();
            
      do
      {
         System.out.println("Enter a whole number.  Enter -99 to exit. ");
         num = keyboard.nextInt();
         
         //if number entered is not the sentinel value and is lower than the lowest variable, re-assign the number entered to the lowest variable
         if(num != SENT & num < lowest)
         {
            lowest = num;
         }
         if(num == SENT)
         {
            lowest = 0;
         }
         
      }while(num != SENT);
    
      System.out.println("Your name is " + name + " and the lowest number you entered was " + lowest);
   }//end main
}