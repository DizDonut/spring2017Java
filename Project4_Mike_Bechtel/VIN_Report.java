/*
   Aggregate class
*/

public class VIN_Report
{
   //declare instance fields
   private String vinNum, accident, status;
   
   /*
      no arg constructor
      @param vinNum The vehicle object's VIN Number
      @param accident The value that indicates whether the vehicle object has been in an accident
      @param status The value that indicates severity of accident
   */
   public VIN_Report()
   {
      vinNum = "";
      accident = "";
      status = "";
   }
   
   /*
      Constructor accepting args from user input and assigning to class fields   
      @param vinNum The vehicle object's VIN Number
      @param accident The value that indicates whether the vehicle object has been in an accident
      @param status The value that indicates severity of accident 
   */
   public VIN_Report(String vin, String accident, String status)
   {
      vinNum = vin;
      this.accident = accident;
      this.status = status;
   }
   
   /*
      Copy constructor to be able to call object in an aggregate class   
   */

   public VIN_Report(VIN_Report object)
   {
      vinNum = object.vinNum;
      accident = object.accident;
      status = object.status;
   }
   
   //create setters & getters
   public void setVinNum(String vn)
   {
      vinNum = vn;
   }
   
   public void setAccident(String acc)
   {
      accident = acc;
   }
   
   public void setStatus(String status)
   {
      this.status = status;
   }
   
   public String getVinNum()
   {
      return vinNum;
   }

   public String getAccident()
   {
      return accident;
   }
   
   public String getStatus()
   {
      return status;
   }
   
   /*
      statusNum method to determine the % reduction in price if the
      vehicle object has had an accident.  Value returned will be called
      in aggregate Vehicle class
   */
   public double statusNum()
   {
      double reduction;
      
      if(status.equalsIgnoreCase("Major"))
      {
         reduction = 0.25;
      }
      else if(status.equalsIgnoreCase("Minor"))
      {
         reduction = 0.10;
      }
      else
      {
         reduction = 0.00;
      }
      
      return reduction;
   }
   
   public String toString()
   {
      String str = "\nVIN Number: " + vinNum +
                   "\nAccident: " + accident +
                   "\nAccident Status: " + status;
      
      return str;                
   }
}