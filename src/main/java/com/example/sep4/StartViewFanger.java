package com.example.sep4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartViewFanger extends HelloController
{
    @FXML
    private Button onSolFangerButtonClick;

    @FXML
    private Button onBesparelsesButtonClick;

    @FXML
    private Button onBackButtonClick;

    @FXML
    private void setOnSolFangerButtonClick()
    {
        appStage.setScene(thermalPanelData);
    }

    @FXML
    private void setOnBesparelsesButtonClick()
    {
        appStage.setScene(savingsScene);
    }

    @FXML
    private void setOnBackButtonClick() {appStage.setScene(frontPage);}
}
