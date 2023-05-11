package com.example.sep4;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.collections.ObservableList;

public class HelloController {
    //
    protected Stage appStage;
    protected Scene solarPanelScene;
    protected Scene solarPanelData;
    protected Scene thermalPanelScene;
    protected Scene thermalPanelData;
    protected Scene savingsScene;
    protected Scene frontPage;


    public void setThermalPanelData(Scene thermalPanelData)
    {
        this.thermalPanelData = thermalPanelData;
    }

    public void setThermalPanelScene(Scene thermalPanelScene)
    {
        this.thermalPanelScene = thermalPanelScene;
    }

    public void setFrontPage(Scene frontPage)
    {
        this.frontPage = frontPage;
    }

    public void setAppStage(Stage appStage)
    {
        this.appStage = appStage;
    }
    public void setSolarPanelScene(Scene solarPanelScene)
    {
        this.solarPanelScene = solarPanelScene;
    }
    public void setSavingsScene(Scene savingsScene)
    {
        this.savingsScene = savingsScene;
    }
    public void setSolarPanelData(Scene solarPanelData)
    {
        this.solarPanelData = solarPanelData;
    }
}