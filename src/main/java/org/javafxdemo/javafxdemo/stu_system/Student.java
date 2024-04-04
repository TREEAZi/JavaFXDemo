package org.javafxdemo.javafxdemo.stu_system;

public class Student {
    private String stuNum, stuName,stuClassName;

    public Student(String stuNum, String stuName, String stuClassName) {
        this(stuNum, stuName);
        this.stuClassName = stuClassName;
    }

    public Student(String stuNum, String stuName) {
        this.stuNum = stuNum;
        this.stuName = stuName;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClassName() {
        return stuClassName;
    }

    public void setStuClassName(String stuClassName) {
        this.stuClassName = stuClassName;
    }

    @Override
    public String toString() {
        return String.format("Student{stuNum=%s, stuName=%s, stuClassName=%s}", stuNum, stuName, stuClassName);
    }
}
