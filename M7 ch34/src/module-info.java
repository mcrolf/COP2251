module Napoli34 {
	requires javafx.controls;
	requires java.sql;
	requires javafx.graphics;
	
	opens napoli34 to javafx.graphics, javafx.fxml;
}
