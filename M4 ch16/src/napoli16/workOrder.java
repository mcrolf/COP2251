//***********************************************************************************
// Work Order Program for Chapter 16
// COP2251 with Professor Cutler
// By: Michael Napoli 2275778
// Collaboration: Video Notes Chapter 16
//                Intro to Java Programming and Data Structures 12th Edition
//                Online documentation from Oracle
//                Javapoint.com Online Documentation
//***********************************************************************************


package napoli16;
	

import java.text.NumberFormat;


import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


public class workOrder extends Application {
	
	// number format to format currency. default is US.
	NumberFormat totalAmount = NumberFormat.getCurrencyInstance();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			System.out.println("start");
			
			// set up grid pane to place items
			GridPane mainBox = new GridPane();
			mainBox.setVgap(10);
			mainBox.setAlignment(Pos.BASELINE_CENTER);
			
			// set up text labels
			Text itemText = new Text("Item");
			Text priceText = new Text("Price");
			Text quantityText = new Text("Quantity");
			Text shipText = new Text("Shipping");
			Text nextDayText = new Text("Next Day");
			Text thisWeekText = new Text("This Week");
			Text someDayText = new Text("Some Day");
			Text totalDueText = new Text("Total Due");
			Text totalAmountText = new Text("$0.00");
			
			
			// text fields for data entry
			TextField itemField = new TextField();
			TextField priceField = new TextField();
			TextField quantityField = new TextField();
			
			// buttons
			Button processButton = new Button("Process");
			Button resetButton = new Button("Reset");
			
			// check box
			CheckBox taxableBox = new CheckBox("Taxable?");
			taxableBox.setIndeterminate(false);
			
			// toggle group for shipping option radio buttons
			ToggleGroup shippingOptionsGroup = new ToggleGroup();
			RadioButton nextDayButton = new RadioButton("$20");
			RadioButton thisWeekButton = new RadioButton("$12");
			RadioButton someDayButton = new RadioButton("$5");
		    nextDayButton.setToggleGroup(shippingOptionsGroup);
			thisWeekButton.setToggleGroup(shippingOptionsGroup);
			someDayButton.setToggleGroup(shippingOptionsGroup);
			nextDayButton.setSelected(false);
			thisWeekButton.setSelected(false);
			someDayButton.setSelected(false);
			
			
						
			// event handler for total amount
			processButton.setOnAction(e -> {
							
				// calculated unweighted total
				Double total;
				total = (Double.parseDouble(priceField.getText()) * 
						Double.parseDouble(quantityField.getText()));
							
				// add next day shipping
				if (nextDayButton.isSelected() == true) {
					
					total += 20;	
				}
				
				// add this week shipping
				if (thisWeekButton.isSelected() == true) {
					
					total += 12;	
				}
				
				// add some time shipping
				if (someDayButton.isSelected() == true) {
					
					total += 5;	
				}
				
				// when taxable, apply sales tax
				if (taxableBox.isSelected() == true) {
					total = total * 1.07;
				}
							
				// set total amount
				totalAmountText.setText("" + totalAmount.format(total));
				
			});
						
			// event handler for reset button
			resetButton.setOnAction(e -> {
							
				// resetting all to default settings
				itemField.clear();
				priceField.clear();
				quantityField.clear();
				
				// reset taxable
				taxableBox.setSelected(false);
				
				if (shippingOptionsGroup.getSelectedToggle() != null) {
				
					shippingOptionsGroup.getSelectedToggle().setSelected(false);
				}
				
				totalAmountText.setText("$0.00");
										
			});
			
			
			
			// build window layout
			Scene scene = new Scene(mainBox,275,325);
			mainBox.addRow(0, itemText, itemField);
			mainBox.addRow(1, priceText, priceField);
			mainBox.addRow(2, quantityText, quantityField);
			mainBox.addRow(3, taxableBox);
			mainBox.addRow(4, shipText);
			mainBox.addRow(5, nextDayText, nextDayButton);
			mainBox.addRow(6, thisWeekText, thisWeekButton);
			mainBox.addRow(7, someDayText, someDayButton);
			mainBox.addRow(8, totalDueText, totalAmountText);
			mainBox.addRow(9, processButton, resetButton);
			
			
			
			primaryStage.setTitle("Orinoco.com");
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
