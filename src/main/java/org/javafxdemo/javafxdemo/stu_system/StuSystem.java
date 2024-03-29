package org.javafxdemo.javafxdemo.stu_system;

import java.util.ArrayList;
import java.util.List;

public class StuSystem {
    private static final String Admin = "admin";
    private static final String Password = "123456";

    private static List<Student> students = new ArrayList<>();
    private static int index;

    //登录
    public static boolean Login(String admin, String password) {
        return Admin.equals(admin) && Password.equals(password);
    }

    public static void addStudent(Student student) {
        if (!isExist(student.getStuNum())) {
            students.add(student);
            System.out.println("添加成功");
        } else System.out.println("学号已存在,无法添加");
    }

    public static void removeStudent(String stuNum) {
        if (isExist(stuNum)) {
            students.remove(index);
            System.out.println("删除成功");
        } else System.out.println("学号不存在");
    }

    public static void changeStudent(String stuNum, String p_stuNum, String p_stuName, String p_stuClassName) {
        if (!isExist(stuNum)){
            System.out.println("学号不存在");
            return;
        }

        if (!p_stuNum.isEmpty() && !p_stuName.equals(getCurrentStudent().getStuName()))
            getCurrentStudent().setStuName(p_stuName);
        /*
        if(!p_stuNum.isEmpty() && !p_stuNum.equals(getCurrentStudent().getStuNum)
            getCurrentStudent().setStuNum(p_stuNum);
        */
        if (!p_stuClassName.isEmpty() && !p_stuClassName.equals(getCurrentStudent().getStuClassName()))
            getCurrentStudent().setStuClassName(p_stuClassName);

    }

    public static void searchStu(String stuNum) {
        if (isExist(stuNum))
            System.out.println(students.get(index).toString());
        else System.out.println("学号不存在");
    }

    public static void searchAllStu() {
        for (Student stu : students)
            System.out.println(stu.toString());
    }

    public static boolean isExist(String stuNum) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStuNum().equals(stuNum)) {
                index = i;
                return true;
            }
        }
        return false;
    }

    public static Student getCurrentStudent() {
        return students.get(index);
    }

    public List<Student> getStudents() {
        // 返回学生列表
        return students;
    }

}
