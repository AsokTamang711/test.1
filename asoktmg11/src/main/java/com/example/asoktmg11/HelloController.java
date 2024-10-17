package com.example.asoktmg11;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;
    @FXML
    private Button loginButton;

    private int failedAttempts = 0;
    private final String correctUsername = "Asok";
    private final String correctPassword = "456";

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please Provide Username or Password");
            return;
        }

        if (failedAttempts >= 5) {
            messageLabel.setText("Sorry, Your Account is Locked!!!");
            return;
        }

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            messageLabel.setText("Success!!!");
            failedAttempts = 0;
        } else {
            failedAttempts++;
            if (failedAttempts >= 5) {
                messageLabel.setText("Sorry, Your Account is Locked!!!");
            } else {
                messageLabel.setText("Sorry, Invalid Username or Password");
            }
        }
    }
}
