package com.hms.hms_dashboard_01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;
    @FXML
    private Button registerButton;

    public void register(ActionEvent event){
        RegisteredEntities.students.add(new Student(userName.getText(), password.getText()));
        HMSApplication.launch();
    }
}
