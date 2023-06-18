module com.example.rentathingapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens Controllers to javafx.fxml;
    exports Controllers;
    exports Producten;
    opens Producten to javafx.fxml;
    exports AbstractFactories;
    opens AbstractFactories to javafx.fxml;
}