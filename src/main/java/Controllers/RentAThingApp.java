package Controllers;

import AbstractFactories.PersonenAutoFactory;
import AbstractFactories.ProductFactory;
import Producten.BoorMachine;
import Producten.PersonenAuto;
import Producten.Product;
import Producten.Voorraad;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RentAThingApp extends Application {

    public static FXMLLoader fxmlLoader;
    public static Stage stage;




    @Override
    public void start(Stage stage) throws IOException {



        FXMLLoader fxmlLoader = new FXMLLoader(RentAThingApp.class.getResource("LoginScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);



        stage.setTitle("Rent A Thing");
        stage.setScene(scene);
        stage.setResizable(stage.isResizable());
        stage.setWidth(600);
        stage.setHeight(600);




        stage.show();
        this.stage = stage;
        new Voorraad();




    }

    public InlogController getCurrentController() {
        return fxmlLoader.getController();
    }

    public static void setScene(String fxmlFileNaam) {
        fxmlLoader = new FXMLLoader(RentAThingApp.class.getResource(fxmlFileNaam + ".fxml"));

        try {

            Scene scene = new Scene(fxmlLoader.load(), 600, 600);
            stage.setScene(scene);

            stage.show();

        } catch (Exception err) {
            System.out.printf("FXMLLoader kon '%s' niet laden.\nException: %s", fxmlFileNaam + ".fxml", err);
        }
    }

    public static void main(String[] args) {

        launch();

    }
}