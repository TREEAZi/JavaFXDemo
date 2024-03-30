package org.javafxdemo.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.javafxdemo.javafxdemo.stu_system.StuSystem;

import static org.javafxdemo.javafxdemo.HelloApplication.searchStuStage;

public class SearchStuView {

    @FXML
    private Button confirm;

    @FXML
    private AnchorPane infoAP;

    @FXML
    private Button search;

    @FXML
    private AnchorPane searchAP;

    @FXML
    private Label searchError;

    @FXML
    private Label stuClassName;

    @FXML
    private Label stuName;

    @FXML
    private TextField stuNum;

    @FXML
    void confirmStuInfo(ActionEvent event) {
        searchStuStage.close();
    }

    @FXML
    void searchStu(ActionEvent event) {
        String num = stuNum.getText();
        if(num.isEmpty()){
            searchError.setText("输入不能为空!");
            searchError.setVisible(true);
            return;
        }
        if(!StuSystem.isExist(num)){
            searchError.setText("学号不存在!");
            searchError.setVisible(true);
            return;
        }

        // 显示学生信息
        stuName.setText(StuSystem.getCurrentStudent().getStuName());
        stuClassName.setText(StuSystem.getCurrentStudent().getStuClassName());

        // 切换界面
        searchAP.setVisible(false);
        searchError.setVisible(false);
        infoAP.setVisible(true);
    }

}