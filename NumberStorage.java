/*
   Mike Bechtel - this program will prompt the user to
   enter 10 numbers and store those numbers in an array.
   Individual methods will be used to process the array
   and display both the largest and smallest values in
   the array.
*/

import java.util.Scanner; //needed for Scanner class

public class NumberStorage
{
   public static void main(String [] a)
   {
      //declare and initialize constants and variables
      final int NUM = 10;
      int[] array = new int[NUM];
      Scanner k = new Scanner(System.in);
      System.out.println("Enter 10 consecutive numbers. ");
      
      //fill array with user specified numbers
      for(int i = 0; i < NUM; i++)
      {
         array[i] = k.nextInt();
      }
      
      //call methods
      getLargest(array);
      getSmallest(array);
      
   }//end main method
   
   /**
      getLargest method accepts an array of integers, calculates the largest number
      in the array and displays it to the screen
      @param int[] array is the array value(s) passed from the main method
   */
   
   public static void getLargest(int[] array)
   {
      //set the largest value to the first element
      int largest = array[0];
      
      //loop through the elements and test if the current is larger than the next
      for(int i = 0; i < array.length; i++)
      {
         if(array[i] > largest)
            largest = array[i];
      }
      
      System.out.println("\nThe largest number in your array is " + largest);
   }//end getHighest method
   
   /**
      getSmallest method accepts an array of integers as an argument,
      finds the smallest number in the array and displays it to the screen
      @param int[] array is the array value(s) passed from the main method 
   */
   
   public static void getSmallest(int[] array)
   {
      //set the smallest to the first element in the array
      int smallest = array[0];
       
      //loop through all elements, testing if the current is smaller than the next 
      for(int i = 0; i < array.length; i++)
      {
         if(array[i] < smallest)
            smallest = array[i];
      }
      
      System.out.println("The smallest number in your array is " + smallest);
   }//end getSmallest method
}