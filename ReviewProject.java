/*
   Mike Bechtel - Review Project CSC151-60
   This program will read data from a given text file (data pertains to number of books students have read).
   The program will read and calculate awards for each student (given how many books were read), calculate total
   books read, average books read, total awards, and how many students met the goal.  Student names, awards, and
   calculations will be displayed to the screen.
*/

import java.io.*; //for file I/O classes
import java.util.Scanner; //for scanner class

public class ReviewProject
{
   public static void main (String[] args) throws IOException //needed to handle exceptions
   {
      //open file and create scanner object for file
      File f = new File("books.txt");
      Scanner inputFile = new Scanner(f);
      
      //declare and initialize variables and accumulators
      String firstName, lastName;
      int books, goal = 0, stars = 0, badges = 0, totalBooks = 0, totalStudents = 0, totalStars = 0, totalBadges = 0;
      double average;
      
      System.out.println("First Name \tLast Name \tStars \tBadges\n");
      
      //loop through data in file, reading all lines and assigning variables
      while(inputFile.hasNext())
      {
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         books = inputFile.nextInt();
         
         //consume blank line separating data in text file
         inputFile.nextLine();
            
            //check for end of file
            if(inputFile.hasNext())
            {
               inputFile.nextLine();
            }
         
         //if statements to check number of stars and badges awarded for each book students have read
         if(books < 1)
         {
            stars = 0;
            badges = 0;
         }
         if(books > 0 && books <= 1)
         {
           stars = 1;
           badges = 0;
         }
         if(books > 1 && books <= 2)
         {
           stars = 2;
           badges = 0;
         }
         if(books > 2 && books <= 3)
         {
           stars = 3;
           badges = 0;
         }
         if(books > 3 && books <= 4)
         {
           stars = 4;
           badges = 0;
         }
         if(books >= 5)
         {
           stars = 5;
           badges = books / 5;
           
           //nested if to check goal qualifications
           if(books >= 10)
           {
               goal++;
           }
         }
         
         //increment totalStudents, used in average calc          
         totalStudents++;
         
         //calculate accumulators
         totalBooks += books;
         totalStars += stars;
         totalBadges += badges;
         
         //display results
         System.out.printf("%-12s%-12s%-12d%-12d\n",firstName, lastName, stars, badges);
      }
      
      //calc average books read - casting int variables as double to avoid int division
      average = (double)totalBooks / (double)totalStudents;
      
      //display results
      System.out.println("\n\nTotal Stars Awarded: \t" + totalStars);
      System.out.println("Total Books Read: \t\t" + totalBooks);
      System.out.printf("Average Books Read: \t\t%.2f\n", average);
      System.out.println("Total Badges Awarded: \t" + totalBadges);
      System.out.println(goal + " student(s) met the goal.");
   }
}