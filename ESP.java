import java.util.Scanner;
import java.util.Random;

public class ESP
{
   public static void main (String[] a)
   {
      String userAnswer = "", compAnswer = "";
      int i = 0, total = 0, compare = 0;
      
      while(i < 11)
      {
         compAnswer = random();
         userAnswer = userGuess(); 
         System.out.println("You guessed " + userAnswer);
         System.out.println("The computer guessed " + compAnswer);
         
         if(compAnswer.equals(userAnswer))
         {
            total++;
         }
         
         i++;
      }
      
      System.out.println("The number of correct guesses is: " + total);
   }
   
   public static String userGuess()
   {
      Scanner keyboard = new Scanner(System.in);
      String color = "";
      
      System.out.println("Guess a color: ");
      color = keyboard.nextLine();
      
      return color;
   }//end userGuess method
   
   public static String random()
   {
      String color = "";
      Random randomNum = new Random();
      int compGuess = 0;
      
      compGuess = randomNum.nextInt(4) + 1;
         
         if(compGuess == 1)
         {
            color = "Red";
         }
            else
               if(compGuess == 2)
               {
                  color = "Green";
               }
            else
               if(compGuess == 3)
               {
                  color = "Orange";
               }
            else 
               if(compGuess == 4)
                  {
                     color = "Yellow";
                  }
         
      return color;
      
   }//end random method
}