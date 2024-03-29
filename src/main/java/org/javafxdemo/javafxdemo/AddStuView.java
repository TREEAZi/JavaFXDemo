package org.javafxdemo.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.javafxdemo.javafxdemo.stu_system.StuSystem;
import org.javafxdemo.javafxdemo.stu_system.Student;

import static org.javafxdemo.javafxdemo.HelloApplication.addStuStage;

public class AddStuView {


    @FXML
    private Button addStu;

    @FXML
    private TextField stuClassName;

    @FXML
    private TextField stuName;

    @FXML
    private TextField stuNum;

    @FXML
    private Label success;

    @FXML
    void addStu(ActionEvent event) throws InterruptedException {

        // 获取输入的学生信息
        String className = stuClassName.getText();
        String name = stuName.getText();
        String num = stuNum.getText();
        System.out.println(num.isEmpty());

        if(className.isEmpty() || name.isEmpty() || num.isEmpty()) {
            // 显示失败消息
            success.setText("输入不能为空!");
            success.setVisible(true);
            return;
        }
        if(StuSystem.isExist(num)){
            // 显示失败消息
            success.setText("学号已存在!");
            success.setVisible(true);
            return;
        }
        // 创建学生对象
        Student student = new Student(num, name, className);

        // 添加学生信息到数据库
        StuSystem.addStudent(student);
        System.out.println(STR."\{num} \{name} \{className}");

        // 关闭窗口
        addStuStage.close();
        // 关闭显示成功消息
        success.setVisible(false);

    }

}
