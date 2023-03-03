//*********************************************************************
// Product DB Display Application for Chapter 34
// COP2251 with Professor Cutler
// By: Michael Napoli 2275778
// Collaboration: Chapter 34 Textbook Chapter
//                Javatpoint.com Online Documentation
//                Chapter 34 Powerpoint
//*********************************************************************



package napoli34;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import java.sql.*;

// products class extends application class
public class Products extends Application {
	// define UI elements
	Text placeholderText = new Text("");
	Text placeholderText2 = new Text("");
	Text fieldOptions = new Text("vin, make, model, year, color, price");
	Text field = new Text("Specify Desired Fields");
	Text orderOptions = new Text("vin, make, model, year, color, price");
	Text order = new Text("Specify Order(separate with commas)");
	Text where = new Text("Where");
	TextField fieldField = new TextField();
	TextField orderField = new TextField();
	TextField whereField = new TextField("true");
	Button submitButton = new Button("Submit");
	Text resultText1 = new Text();
	
	// array to store query order
	String orderArray[];
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Split pane is the whole window
			SplitPane splitWindow = new SplitPane();
			
			// pane on right side to hold results
			TextFlow resultPane = new TextFlow();
			
			// set up grid pane for left side
			GridPane gridPane = new GridPane();
			gridPane.setVgap(5);
			gridPane.setHgap(5);
			
			// add UI elements to grid pane
			gridPane.addRow(0, placeholderText, fieldOptions);
			gridPane.addRow(1, field, fieldField);
			gridPane.addRow(2, placeholderText2, orderOptions);
			gridPane.addRow(3, order, orderField);
			gridPane.addRow(4, where, whereField);
			gridPane.addRow(5, submitButton);
			
			// add UI element to result pane
			resultPane.getChildren().add(resultText1);
			
			
			
			// Event for Submit Button
			submitButton.setOnAction(e -> {
				// set text blank upon button action
				resultText1.setText("");
				
				// make order field into array of fields
				orderArray = orderField.getText().split(", ");
				
				// define query
				String query = "select " + orderField.getText() + " from product where " +
				whereField.getText();
				
				// define statement. set null
				Statement statement = null;
				
				
				// Loading the Database and drivers, Establish connection
				try {
					// load the driver
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded");
					
					// connect to DB
					Connection conn = DriverManager.getConnection
							("jdbc:mysql://localhost:3306/example", "root" , "0Rbixrules10");
					System.out.println("Database Connected");
					System.out.println(query);
					statement = conn.prepareStatement(query);		
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				
				// define result set and set null
				ResultSet results = null;
				
				
				// result is execute query
				try {
					results = statement.executeQuery(query);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				// while loop through results
				try {
					while (results.next()) {
						resultText1.setText(resultText1.getText() + " | ");
						for (int i = 0; i < orderArray.length; i++) {
							// logs to console for comparison
							String foop = results.getString(orderArray[i]);
							System.out.print(foop + ", ");
							// output in the window
							resultText1.setText(resultText1.getText() + "   " + 
							results.getString(orderArray[i]));
						}
						resultText1.setText(resultText1.getText() + "   |" + "\n");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			});
			
			
			// Display scene
			splitWindow.getItems().addAll(gridPane, resultPane);
			Scene scene = new Scene(splitWindow,800,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Product Search");
			primaryStage.show();
		
		} // catch for start try
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	// launch the program
	public static void main(String[] args) {
		launch(args);
	}
}
