package org.javafxdemo.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage stage;
    public static Stage addStuStage;
    public static Stage changeStuStage;

    public static Stage removeStuStage;

    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        HelloApplication.stage.setTitle("JavaFXDemo");
        HelloApplication.stage.setResizable(false);

        addStuStage = new Stage();
        addStuStage.setResizable(false);
        addStuStage.setTitle("添加学生");
        addStuStage.initModality(Modality.WINDOW_MODAL);
        addStuStage.initOwner(HelloApplication.stage);

        removeStuStage = new Stage();
        removeStuStage.setResizable(false);
        removeStuStage.setTitle("删除学生");
        removeStuStage.initModality(Modality.WINDOW_MODAL);
        removeStuStage.initOwner(HelloApplication.stage);

        changeStuStage = new Stage();
        changeStuStage.setResizable(false);
        changeStuStage.setTitle("修改学生信息");
        changeStuStage.initModality(Modality.WINDOW_MODAL);
        changeStuStage.initOwner(HelloApplication.stage);

        setScene(scene);
        HelloApplication.stage.show();
    }

    public static void setScene(Scene scene){
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}