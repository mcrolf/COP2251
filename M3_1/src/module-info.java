module Napoli15 {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	
	opens napoli15 to javafx.graphics, javafx.fxml;
}
