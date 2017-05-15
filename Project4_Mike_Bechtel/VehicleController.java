/*
   Controller class for the Vehicle GUI   
*/

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class VehicleController
{
    @FXML
    private RadioButton fxStatusMajRadio;

    @FXML
    private Button fxSubmitButton;

    @FXML
    private RadioButton fxCarRadio;

    @FXML
    private RadioButton fxOptNRadio;

    @FXML
    private ToggleGroup OptionsGroup;

    @FXML
    private RadioButton fxTruckRadio;

    @FXML
    private ToggleGroup AccidentGroup;

    @FXML
    private RadioButton fxAccNRadio;

    @FXML
    private RadioButton fxStatusMinorRadio;

    @FXML
    private ToggleGroup TypeGroup;

    @FXML
    private TextField fxYearText;

    @FXML
    private TextField fxVINText;

    @FXML
    private RadioButton fxStatusNARadio;

    @FXML
    private Label fxBasePrice;

    @FXML
    private TextField fxTowingText;

    @FXML
    private RadioButton fxAccYRadio;

    @FXML
    private Label fxMake;

    @FXML
    private RadioButton fxOptYRadio;

    @FXML
    private Label fxAccident;

    @FXML
    private ToggleGroup accStatusGroup;

    @FXML
    private Label fxTowing;

    @FXML
    private TextField fxMakeText;

    @FXML
    private Label fxAccidentStatus;

    @FXML
    private Label fxYear;

    @FXML
    private Label fxOptions;

    @FXML
    private Label fxVIN;

    @FXML
    private Label fxType;

    @FXML
    private TextField fxBPText;
    
    @FXML
    private Label fxoutputLabel;
   
    public void truckTowingEventListener()
    {
      if(fxTruckRadio.isSelected())
      {
         fxTowingText.setDisable(false);
      }
      else if(fxCarRadio.isSelected())
      {
         fxTowingText.setDisable(true);
      }
    }//end truckTowingEventListener
    
    public void submitButtonEvent()
    {
      String type = "";
      double towingCapacity = 0;
      
      if(fxCarRadio.isSelected())
      {
         type = fxCarRadio.getText();
      }
      else
      {
         type = fxTruckRadio.getText();
         String str2 = fxTowingText.getText();
         towingCapacity = Double.parseDouble(str2); 
      }
      
      String make = fxMakeText.getText();
      String year = fxYearText.getText();
      
      String options = "";
      if(fxOptYRadio.isSelected())
      {
         options = fxOptYRadio.getText();
      }
      else
      {
         options = fxOptNRadio.getText();
      }
      
      String str = fxBPText.getText();
      double basePrice = Double.parseDouble(str);
            
      String vinNum = fxVINText.getText();
      
      String accident = "";
      
      if(fxAccYRadio.isSelected())
      {
         accident = fxAccYRadio.getText();
      }
      else
      {
         accident = fxAccNRadio.getText();
      }
      
      String accStatus = "";
      
      if(fxStatusMajRadio.isSelected())
      {
         accStatus = fxStatusMajRadio.getText();
      }
      else if(fxStatusMinorRadio.isSelected())
      {
         accStatus = fxStatusMinorRadio.getText();
      }
      else
      {
         accStatus = fxStatusNARadio.getText();
      }
      
      VIN_Report vin = new VIN_Report(vinNum, accident, accStatus);
      Truck truck = new Truck(type, make, year, options, basePrice, vin, towingCapacity);
            
      double towingFee = truck.towingCalc(towingCapacity);
      double finalPrice = basePrice + towingFee;
      
      Vehicle vehicle = new Vehicle(type, make, year, options, finalPrice, vin);
            
      fxoutputLabel.setText(truck.toString());
    }
    
    public void accidentStatusEventListener()
    {
      if(fxAccYRadio.isSelected())
      {
         fxStatusNARadio.setDisable(true);
         fxStatusMinorRadio.setDisable(false);
         fxStatusMajRadio.setDisable(false);
      }
      else
      {
         fxStatusNARadio.setDisable(false);
         fxStatusNARadio.setSelected(true);
         fxStatusMinorRadio.setDisable(true);
         fxStatusMajRadio.setDisable(true);
      }
    }
}
