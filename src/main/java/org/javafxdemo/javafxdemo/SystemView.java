package org.javafxdemo.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import static org.javafxdemo.javafxdemo.HelloApplication.*;

public class SystemView {

    @FXML
    public Button changeStu;

    @FXML
    public Button searchStu;

    @FXML
    private Button addStu;

    @FXML
    private Button removeStu;

    @FXML
    void addStu(ActionEvent event) throws IOException {
        addStuStage.setScene(new Scene(new FXMLLoader(SystemView.class.getResource("AddStu-view.fxml")).load()));
        addStuStage.show();
    }

    @FXML
    void removeStu(ActionEvent event) throws IOException {
        removeStuStage.setScene(new Scene(new FXMLLoader(SystemView.class.getResource("RemvStu-view.fxml")).load()));
        removeStuStage.show();
    }

    @FXML
    void changeStu(ActionEvent event) throws IOException {
        changeStuStage.setScene(new Scene(new FXMLLoader(SystemView.class.getResource("ChangeStu-view.fxml")).load()));
        changeStuStage.show();
    }

    @FXML
    void searchStu(ActionEvent event) throws IOException {
        searchStuStage.setScene(new Scene(new FXMLLoader(SystemView.class.getResource("SearchStu-view.fxml")).load()));
        searchStuStage.show();
    }

}