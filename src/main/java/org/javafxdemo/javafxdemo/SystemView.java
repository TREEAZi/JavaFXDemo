package org.javafxdemo.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.javafxdemo.javafxdemo.stu_system.StuSystem;

import java.io.IOException;

import static org.javafxdemo.javafxdemo.HelloApplication.addStuStage;
import static org.javafxdemo.javafxdemo.HelloApplication.removeStuStage;
import static org.javafxdemo.javafxdemo.HelloApplication.changeStuStage;

public class SystemView {

    static StuSystem stuSystem = new StuSystem();

    @FXML
    private Button addStu;

    @FXML
    private Button removeStu;

    @FXML
    void addStu(ActionEvent event) throws IOException {
        addStuStage.setScene(new Scene(new FXMLLoader(SystemView.class.getResource("AddStu-view.fxml")).load()));
        addStuStage.show();
        //stuName.getItems().add("Item 1");
        //System.out.println(stuName.getItems().getFirst());
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

}