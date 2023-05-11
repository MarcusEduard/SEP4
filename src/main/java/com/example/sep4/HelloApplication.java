package com.example.sep4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Create a FXMLLoader
        FXMLLoader solcelleLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // Initialize Scene and stages
        Scene scene1 = new Scene(solcelleLoader.load(), 1280, 700);
        stage.setTitle("Ejby Maskinfabrik");
        stage.setScene(scene1);
        stage.show();
        stage.setResizable(false);
        // Attach scene to controller
        StartView startView = (StartView) solcelleLoader.getController();

        FXMLLoader solfangerLoader = new FXMLLoader(HelloApplication.class.getResource("solfanger-scene.fxml"));
        Scene scene2 = new Scene(solfangerLoader.load(), 1280, 700);
        stage.setTitle("Ejby Maskinfabrik - Solar Collector");
        stage.setScene(scene2);
        stage.show();
        stage.setResizable(false);
        StartViewFanger startViewFanger = (StartViewFanger) solfangerLoader.getController();

        //Create another FXMLLoader and re-apply steps from before
        FXMLLoader forsideLoader = new FXMLLoader(HelloApplication.class.getResource("front-page.fxml"));
        Scene scene = new Scene(forsideLoader.load(), 400, 600);
        stage.setTitle("Ejby Maskinfabrik - Solar System");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
        stage.setResizable(false);
        HelloController helloController = (HelloController) forsideLoader.getController();


        // Attaching controllers to stage and scenes
        helloController.setAppStage(stage);
        helloController.setFrontPage(scene);
        helloController.setSolarPanelScene(scene1);
        helloController.setThermalPanelScene(scene2);

        startView.setAppStage(stage);
        startView.setSolarPanelScene(scene1);
        startView.setFrontPage(scene);
        startView.setSavingsScene(scene1);

        startViewFanger.setAppStage(stage);
        startViewFanger.setFrontPage(scene);
        startViewFanger.setSavingsScene(scene2);
        startViewFanger.setThermalPanelData(scene2);

    }

    public static void main(String[] args) {
        launch();
    }
}