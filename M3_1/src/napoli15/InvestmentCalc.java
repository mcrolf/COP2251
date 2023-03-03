//*****************************************************************************
// Investment Calculator using JavaFX Exercise 15.5
// COP2251 Chapter 15
// By: Michael Napoli
// In collaboration with: Textbook Video Examples
//                        Oracle Java Class Documentation docs.oracle.com
//*****************************************************************************

package napoli15;
	

import java.util.Formatter;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class InvestmentCalc extends Application {
	
	// init variables for calculation
	double inv, yr, intr, fut;
	
	
	public void start(Stage primaryStage) {
	try {
		
		// Create button for calculate
		Button calculate = new Button("Calculate");
		calculate.setAlignment(Pos.BASELINE_RIGHT);
		
		
		// Labels for text input
		Text investment_amount = new Text("Investment Amount: ");
		investment_amount.setFont(Font.font(14));
		Text years = new Text("Number Of Years: ");
		years.setFont(Font.font(14));
		Text interest_rate = new Text("Annual Interest Rate: ");
		interest_rate.setFont(Font.font(14));
		Text future_value = new Text("Future Value: ");
		future_value.setFont(Font.font(14));
		
		TextField tfInvest = new TextField();
		TextField tfYrs = new TextField();
		TextField tfInterest = new TextField();
		TextField tfFuture = new TextField();
		
		// Grid pane time
		GridPane mainBox = new GridPane();
		mainBox.setVgap(10);
		mainBox.setAlignment(Pos.BASELINE_CENTER);
		
					
		// create window scene and display
		Scene scene = new Scene(mainBox, 400, 400);
		mainBox.addRow(0, investment_amount, tfInvest);
		mainBox.addRow(1, years, tfYrs);
		mainBox.addRow(2, interest_rate, tfInterest);
		mainBox.addRow(3, future_value, tfFuture);
		mainBox.addRow(4, calculate);
		primaryStage.setTitle("Investment Calculator Program");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// event handler for calculation button
		// includes calculation for finding future investment
		// handles output formatting with Formatter method
		calculate.setOnAction(e -> {
			
			Formatter future = new Formatter();
			
			future.format("%.2f", Double.parseDouble(tfInvest.getText()) * 
					 Math.pow(1 + (Double.parseDouble(tfInterest.getText())/100), (Double.parseDouble(tfYrs.getText()) * 12)));
			
			tfFuture.setText("$" + future);
		});
		
		
		} catch(Exception e) {
		e.printStackTrace();
		}
	
	}
			
	
	// Launch the application
	public static void main(String[] args) {
		launch(args);
	}
}