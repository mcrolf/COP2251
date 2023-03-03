//*****************************************************************************
// Emoji drawing using JavaFX
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
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;


public class emoji extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// pane for application window
			Pane pane = new Pane();
			
			// circle for back layer using gradient for "shadow" effect
			Circle head = new Circle(200, 200, 150);
			head.setStroke(Color.YELLOW);
			head.setFill(new RadialGradient(0.3, 0, 200, 200, 700, false,
					CycleMethod.NO_CYCLE, new Stop(0, Color.YELLOW), new Stop(0.5, Color.BROWN)));
			pane.getChildren().add(head);
			
			// drawing the eyes
			Ellipse leftEye = new Ellipse(150, 160, 10, 15);
			leftEye.setFill(Color.SADDLEBROWN);
			pane.getChildren().add(leftEye);
			
			Ellipse RightEye = new Ellipse(250, 160, 10, 15);
			RightEye.setFill(Color.SADDLEBROWN);
			pane.getChildren().add(RightEye);
			
			// drawing the glasses
			
			// left eye glass
			Circle leftGlass = new Circle(140, 160, 45);
			leftGlass.setFill(Color.TRANSPARENT);
			leftGlass.setStroke(Color.BLACK);
			leftGlass.setStrokeWidth(5);
			pane.getChildren().add(leftGlass);
			
			// right eye glass
			Circle rightGlass = new Circle(260, 160, 45);
			rightGlass.setFill(Color.TRANSPARENT);
			rightGlass.setStroke(Color.BLACK);
			rightGlass.setStrokeWidth(5);
			pane.getChildren().add(rightGlass);
			
			// glasses bridge
			Line glassBridge = new Line(185, 160, 215, 160);
			glassBridge.setStroke(Color.BLACK);
			glassBridge.setStrokeWidth(5);
			pane.getChildren().add(glassBridge);
			
			// drawing the mouth with rounded edges
			Arc mouth = new Arc(200, 240, 50, 50, 200, 140);
			mouth.setStroke(Color.SADDLEBROWN);
			mouth.setFill(Color.TRANSPARENT);
			mouth.setType(ArcType.OPEN);
			mouth.setStrokeLineCap(StrokeLineCap.ROUND);
			mouth.setStrokeWidth(10);
			pane.getChildren().add(mouth);
			
			
			// set size of window pane
			Scene scene = new Scene(pane,400,400);
			
			// this was generate in the default main file
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// window title
			primaryStage.setTitle("Program2 emoji");
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Launch the Application
	public static void main(String[] args) {
		launch(args);
	}
}