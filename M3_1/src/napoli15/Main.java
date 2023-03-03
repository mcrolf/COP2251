//*****************************************************************************
// Moving Ball using JavaFX Exercise 15.3
// COP2251 Chapter 15
// By: Michael Napoli
// In collaboration with: Textbook Video Examples
//                        Oracle Java Class Documentation docs.oracle.com
//*****************************************************************************

package napoli15;
	

import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	
	CirclePane circlePane = new CirclePane();
	
	// class for circle pane extends stack pane
	class CirclePane extends Pane {
		
		// init circle with radius
		private Circle circle = new Circle(200, 200, 50);
		
		// constructor or circle pane adds circle
		public CirclePane() {
			getChildren().add(circle);
			circle.setStroke(Color.AQUAMARINE);
			circle.setFill(Color.TRANSPARENT);
			circle.setStrokeWidth(10);
		}
		
		// method to make circle move left. includes boundary
		public void goLeft() {
			if (circle.getCenterX() <= 50) {
				circle.setCenterX(circle.getCenterX());
			}
			else {
				circle.setCenterX(circle.getCenterX() -5);
			}	
		}
		
		// method to make circle move up. includes boundary
		public void goUp() {
			if (circle.getCenterY() <= 50) {
				circle.setCenterY(circle.getCenterY());
			}
			else {
				circle.setCenterY(circle.getCenterY() -5);
			}
		}
		
		// method to make circle move down. includes boundary
		public void goDown() {
			if (circle.getCenterY() >= 350) {
				circle.setCenterY(circle.getCenterY());
			}
			else {
				circle.setCenterY(circle.getCenterY() +5);
			}
		}
		
		// method for circle to move right. includes boundary
		public void goRight() {
			if (circle.getCenterX() >= 350) {
				circle.setCenterX(circle.getCenterX());
			}
			else {
				circle.setCenterX(circle.getCenterX() +5);
			}
		}
	}
	
	public void start(Stage primaryStage) {
		try {
			
			// making box for buttons to sit at bottom of pane
			HBox buttons = new HBox();
			buttons.setSpacing(10);
			buttons.setAlignment(Pos.CENTER);
			
			// add the buttons for controls
			Button left = new Button("Left");
			Button up = new Button("Up");
			Button down = new Button("Down");
			Button right = new Button("Right");
			buttons.getChildren().add(left);
			buttons.getChildren().add(up);
			buttons.getChildren().add(down);
			buttons.getChildren().add(right);
			
			// Init event handlers for buttons
			left.setOnAction(new LeftHandler());
			up.setOnAction(new UpHandler());
			down.setOnAction(new DownHandler());
			right.setOnAction(new RightHandler());
			
			// create border pane to stage things in the window
			BorderPane window = new BorderPane();
			window.setCenter(circlePane);
			window.setBottom(buttons);
			window.setAlignment(window, Pos.CENTER);
			
			// create window scene and display
			Scene scene = new Scene(window, 400, 400);
			primaryStage.setTitle("Moving Circle Program");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// class for event handler (Left)
	class LeftHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			circlePane.goLeft();
		}
	}
	
	// class for event handler (Up)
	class UpHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			circlePane.goUp();
		}
	}
	
	// class for event handler (Down)
	class DownHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			circlePane.goDown();
		}
	}
	
	// class for event handler (Right)
	class RightHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			circlePane.goRight();
		}
	}
	
	
	// Launch the application
	public static void main(String[] args) {
		launch(args);
	}
}
