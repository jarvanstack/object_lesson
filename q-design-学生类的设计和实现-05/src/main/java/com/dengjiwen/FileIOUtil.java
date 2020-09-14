package com.dengjiwen;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Jarvan
 * @create 2020/9/14 15:05
 * this is a util class for the print the info of student and undergraduateStudent to D Driver
 */
public class FileIOUtil {
    private  FileWriter fileWriter;
    private  String fileName;

    public FileIOUtil(String fileName) {
        this.fileName = fileName;
    }

    /**
     * this is chain coding ,init the file location.
     * @return
     * @throws IOException
     * @param fileName
     */
   private FileIOUtil initFile(String fileName) throws IOException {
       fileWriter = new FileWriter("./log/"+ this.fileName,true);
       return this;
   }

    /**
     * write the string to the file,you need to init the file first
     * @param s
     * @throws IOException
     */
    public  void writeLine(String s) throws IOException {
        if (fileWriter == null) {
            initFile(fileName);
        }
        // this \n nextline just for Windows
        fileWriter.write(s+"\r\n");
        fileWriter.flush();
    }
}
