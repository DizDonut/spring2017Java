import java.util.Scanner; //for input and output

public class PeerProgrammingOne
{
   public static void main(String[] args)
   {
      //variable declaration and accumulator initialization
      double num, sum = 0;
      int i;
      String name;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter 3 numbers: ");
      
      //enter for loop to read input 3 different times, accumulate to sum variable
      for(i = 0; i < 3; i++)
      {
         num = keyboard.nextInt();
         sum += num;
      }
      
      keyboard.nextLine(); //consume buffer from nextInt
      System.out.println("Enter your name: ");
      name = keyboard.nextLine();
      
      System.out.println("Your name is " + name);
      System.out.println("The sum of your numbers is: " + sum);
   }
}//end main