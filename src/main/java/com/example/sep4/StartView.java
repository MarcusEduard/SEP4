package com.example.sep4;

import com.example.sep4.HelloController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartView extends HelloController
{
    
    @FXML
    private Button onSolarPanelsButtonClick;

    @FXML
    private Button onBesparelsesButtonClick;

    @FXML
    private Button onBackButtonClick;

    @FXML
    private void setOnSolarPanelsButtonClick()
    {
        appStage.setScene(solarPanelData);
    }

    @FXML
    private void setOnBesparelsesButtonClick()
    {
        appStage.setScene(savingsScene);
    }

    @FXML
    private void setOnBackButtonClick()
    {
        appStage.setScene(frontPage);
    }
}
