package com.dengjiwen;

/**
 * @Author Jarvan
 * @create 2020/9/14 14:53
 * Entity class Student
 */
public class Student {
    private String name;
    private String studentId;
    private String credit;
    private String grade;

    public Student(String name, String studentId, String credit, String grade) {
        this.name = name;
        this.studentId = studentId;
        this.credit = credit;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", credit='" + credit + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCredit() {
        return credit;
    }

    public String getGrade() {
        return grade;
    }
}
