package com.TTS;

import java.io.*;
public class JavaExam {
    public static void main(String[] args){
        try {
            File file = new File("result.tx.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(74);
            fileWriter.write(97);
            fileWriter.write(118);
            fileWriter.write(97);
            fileWriter.write(32);
            fileWriter.write(29579);
            fileWriter.write(22283);
            fileWriter.write(21235);
            fileWriter.write("\n兩個方法都一樣QQ\r\n");
            fileWriter.write("JAVA 王國勳");

            fileWriter.flush();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();

        }


    }

}