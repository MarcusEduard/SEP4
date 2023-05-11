package com.example.sep4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FrontPage extends HelloController
{
    @FXML
    private Button onSolcelleButtonClick;

    @FXML
    private void setOnSolcelleButtonClick()
    {
        appStage.setScene(solarPanelScene);
    }

    @FXML
    private Button onSolFangerButtonClick;

    @FXML
    private void setOnSolFangerButtonClick() {appStage.setScene(thermalPanelScene);}
}
