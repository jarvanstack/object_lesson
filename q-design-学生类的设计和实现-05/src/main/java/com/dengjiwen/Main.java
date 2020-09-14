package com.dengjiwen;

import java.io.IOException;

/**
 * @Author Jarvan
 * @create 2020/9/14 15:01
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Student student = new Student("邓嘉文", "2019214951", "100", "2019");
        FileIOUtil studentFile = new FileIOUtil("student.txt");
        studentFile.writeLine(student.toString());
        UndergraduateStudentStudent undergraduateStudentStudent = new UndergraduateStudentStudent("邓嘉文", "2019214951", "100", "2019", "周渝陇", "大数据");
        FileIOUtil fileIOUtil = new FileIOUtil("undergraduateStudentStudent.txt");
        fileIOUtil.writeLine(undergraduateStudentStudent.toString());
    }
}
