package com.dengjiwen;

/**
 * @Author Jarvan
 * @create 2020/9/14 14:53
 * Entity class Student
 */
public class UndergraduateStudentStudent extends Student{
    private String teacherName;
    private String researchDirection;

    public UndergraduateStudentStudent(String name, String studentId, String credit, String grade,String teacherName,String researchDirection) {
        super(name, studentId, credit, grade);
        this.teacherName = teacherName;
        this.researchDirection = researchDirection;
    }

    @Override
    public String toString() {
        return "UndergraduateStudentStudent{" +super.toString()+
                "teacherName='" + teacherName + '\'' +
                ", researchDirection='" + researchDirection + '\'' +
                '}';
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getResearchDirection() {
        return researchDirection;
    }
}
