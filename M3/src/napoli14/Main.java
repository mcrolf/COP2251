//*****************************************************************************
// Basic Shapes drawing using JavaFX
// COP2251 Chapter 14
// By: Michael Napoli
// In collaboration with: Textbook Video Examples
//                        Oracle Java Class Documentation docs.oracle.com
//*****************************************************************************



package napoli14;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// pane for application window
			Pane pane = new Pane();
			
			// creating the rectangle and displaying it on the pane
			Rectangle r1 = new Rectangle(25, 25, 100, 100);
			r1.setStroke(Color.BLUE);
			r1.setFill(Color.BLUE);
			pane.getChildren().add(r1);
			
			// creating the circle and displaying it on the pane
			Circle c1 = new Circle(200, 200, 60);
			c1.setStroke(Color.RED);
			c1.setFill(Color.RED);
			pane.getChildren().add(c1);
			
			// creating lines that intersect and display on pane
			// except I used rectangles to control the line width
			Rectangle l1 = new Rectangle(300, 300, 70, 5);
			l1.setStroke(Color.GREEN);
			l1.setFill(Color.GREEN);
			pane.getChildren().add(l1);
			
			Rectangle l2 = new Rectangle(333, 270, 5, 100);
			l2.setStroke(Color.GREEN);
			l2.setFill(Color.GREEN);
			pane.getChildren().add(l2);
			
			
			// set size if window pane
			Scene scene = new Scene(pane,400,400);
			
			// this was here by default
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// title for window
			primaryStage.setTitle("Program1 Shapes");
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Launch application
	public static void main(String[] args) {
		launch(args);
	}
}