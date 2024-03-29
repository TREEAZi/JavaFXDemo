package org.javafxdemo.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.javafxdemo.javafxdemo.stu_system.StuSystem;

import static org.javafxdemo.javafxdemo.HelloApplication.changeStuStage;

public class ChangeStuView {

    private static String num, p_num, p_name, p_className;

    @FXML
    private Button change;

    @FXML
    private AnchorPane changeAP;

    @FXML
    private Label changeError;

    @FXML
    private Button search;

    @FXML
    private AnchorPane searchAP;

    @FXML
    private Label searchError;

    @FXML
    private TextField stuClassName;

    @FXML
    private TextField stuName;

    @FXML
    private TextField stuNum;

    @FXML
    void changeStuInfo(ActionEvent event) {
        p_name = stuName.getText();
        p_className = stuClassName.getText();
        if(p_name.isEmpty() && p_className.isEmpty()){
            changeError.setText("至少输入一项!");
            changeError.setVisible(true);
            return;
        }

        // 修改学生信息
        StuSystem.changeStudent(num, num, p_name, p_className);
        System.out.println(StuSystem.getCurrentStudent().toString());

        // 关闭窗口
        changeStuStage.close();
    }

    @FXML
    void searchStu(ActionEvent event) {
        num = stuNum.getText();
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

        searchAP.setVisible(false);
        searchError.setVisible(false);
        changeAP.setVisible(true);

    }

}
