package org.javafxdemo.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginView {

    @FXML
    private TextField Login;

    @FXML
    private PasswordField password;

    @FXML
    public void onAtion(ActionEvent event) throws IOException {
        if(true/*StuSystem.Login(Login.getText(),password.getText())*/){
            System.out.println("Login");
            HelloApplication.setScene(new Scene(new FXMLLoader(HelloApplication.class.getResource("System-view.fxml")).load()));
        }

    }

}
