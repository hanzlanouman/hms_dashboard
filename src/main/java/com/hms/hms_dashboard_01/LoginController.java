package com.hms.hms_dashboard_01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {

    private  String adminUser = "admin";
    private  String adminPassword = "123";

    private  String cookUser = "cook";
    private  String cookPassword = "123";

    private  String securityUser = "security";
    private  String securityPassword = "123";

    private final RegisteredEntities registeredEntities = new RegisteredEntities();

    @FXML
    private Button loginButton;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    public void initialize() {
        // Initialize any necessary components or variables here
    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        String username1 = username.getText();
        String password1 = password.getText();

        if (Objects.equals(username1, adminUser) && Objects.equals(password1, adminPassword)) {
            openDashboard(event, "hms_dash.fxml", username1);
        } else if (Objects.equals(username1, cookUser) && Objects.equals(password1, cookPassword)) {
            openDashboard(event, "hms_dash_cook.fxml", username1);
        } else if (Objects.equals(username1, securityUser) && Objects.equals(password1, securityPassword)) {
            openDashboard(event, "hms_dash_security.fxml", username1);
        } else {
            for (Student student : registeredEntities.getStudents()) {
                if (Objects.equals(username1, student.getStudentUsername()) &&
                        Objects.equals(password1, student.getStudentPassword())) {
                    openDashboard(event, "hms_dash_student.fxml", username1);
                    return;
                }
            }
            showLoginError();
        }
    }

    @FXML
    public void registerForm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hms_register.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void openDashboard(ActionEvent event, String fxmlPath, String username) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.greet(username);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void showLoginError() {
        Alert loginAlert = new Alert(Alert.AlertType.ERROR);
        loginAlert.setTitle("Login Error");
        loginAlert.setHeaderText("Invalid Username or Password");
        loginAlert.showAndWait();
    }
}
