package com.hms.hms_dashboard_01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;


public class LoginController {

    private String User="admin";
    private String Pass = "123";
Stage stage;
Scene scene;
Parent root;
@FXML
private Button loginButton;
@FXML
TextField username;
@FXML
TextField password;
public void login(ActionEvent event) throws IOException {


    String username1 = username.getText();
    String password1 = password.getText();

    if(Objects.equals(username1, User) && Objects.equals(password1, Pass)){
        System.out.println(username1);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hms_dash.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        controller.greet(username1);

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }else{
        Alert loginAlert = new Alert(Alert.AlertType.ERROR);
        loginAlert.setTitle("Login Error");
        loginAlert.setHeaderText("Invalid Username or Password");
        loginAlert.showAndWait();

    }

}
}
