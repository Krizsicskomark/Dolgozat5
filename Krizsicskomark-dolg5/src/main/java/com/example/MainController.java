/*
* File: Cylinder.java
* Author: Krizsicskó Márk
* Copyright: 2025, Krizsicskó Márk
* Group: Szoft II/1/N
* Date: 2025-02-19
* Github: https://github.com/krizsicskomark/
* Licenc: GNU GPL
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField surfaceField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField heightField;

    Cylinder cylinder;

    @FXML
    void onClickAboutButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("2025-02-13 Dol 5 - Circle Cylinder Surface Calculator");
        alert.setContentText("Krizsicskó Márk\n2025.02.19\nSzoft II/1/N");
        alert.showAndWait();
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        System.exit(0);
    }

    private void startCalc() 
    {
        String radiusStr = radiusField.getText();
        String heightStr = heightField.getText();
        
        Double radius = Double.parseDouble(radiusStr);
        Double height = Double.parseDouble(heightStr);

        Double surface = 2 * Math.PI * radius * (radius + height);
        surfaceField.setText(surface.toString());

        addToDatabase(radius, height, surface);
    }

    private void addToDatabase(Double radius, Double height, Double surface) {
        cylinder = new Cylinder(radius, height, surface);
        DataSource.tryCreateCylinder(cylinder);

    }
}
