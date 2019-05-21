package com.TTS;

import java.io.*;


public class FileTester {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("result.txt");
            int n = fis.read();
            while(n!=-1){
                System.out.print((char)n);
                n = fis.read();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
