package com.hms.hms_dashboard_01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
Stage stage;
@FXML
    private Button logoutButton;
@FXML
Label greet;
    public void logout(ActionEvent event) throws IOException {
        Alert logOutAlert = new Alert(Alert.AlertType.CONFIRMATION);
        logOutAlert.setTitle("Log Out");
        logOutAlert.setHeaderText("Are you sure you want to log out?");
        if(logOutAlert.showAndWait().get() == ButtonType.OK){

        Parent root = FXMLLoader.load(getClass().getResource("hms_login.fxml"));
        Stage stage = (Stage) logoutButton.getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
        }

    }

    public void greet(String username){
    greet.setText("Hi, "+username);

    }
}
