package org.javafxdemo.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.javafxdemo.javafxdemo.stu_system.StuSystem;

import static org.javafxdemo.javafxdemo.HelloApplication.removeStuStage;

public class RemvStuView {

    @FXML
    private Button remvStu;

    @FXML
    private TextField stuNum;

    @FXML
    private Label success;

    @FXML
    void remvStu(ActionEvent event) {

        // 获取学号
        String num = stuNum.getText();

        if (num.isEmpty()){
            // 显示失败消息
            success.setText("输入不能为空!");
            success.setVisible(true);
            return;
        }
        if(!StuSystem.isExist(num)){
            // 显示失败消息
            success.setText("该学生不存在!");
            success.setVisible(true);
            return;
        }

        //删除学生信息
        StuSystem.removeStudent(num);

        // 关闭窗口
        removeStuStage.close();

    }

}
