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

    private String adminUser="admin";
    private String adminPass = "123";
    private String studentUserName="student";
    private String studentPassword = "123";
    private String cookUser="cook";
    private String cookPass = "123";
    private String securityUser="security";
    private String securityPass = "123";
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

    if(Objects.equals(username1, adminUser) && Objects.equals(password1, adminPass)){
        System.out.println(username1);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hms_dash.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        controller.greet(username1);

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }else if(Objects.equals(username1, studentUserName) && Objects.equals(password1, studentPassword)){
        System.out.println(username1);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hms_dash_student.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        controller.greet(username1);

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }else if(Objects.equals(username1, cookUser) && Objects.equals(password1, cookPass)){
        System.out.println(username1);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hms_dash_cook.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        controller.greet(username1);

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }else if(Objects.equals(username1, securityUser) && Objects.equals(password1, securityPass)){
        System.out.println(username1);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hms_dash_security.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        controller.greet(username1);

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    else{
        Alert loginAlert = new Alert(Alert.AlertType.ERROR);
        loginAlert.setTitle("Login Error");
        loginAlert.setHeaderText("Invalid Username or Password");
        loginAlert.showAndWait();

    }

}
}
