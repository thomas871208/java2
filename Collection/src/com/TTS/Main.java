package com.TTS;

import java.io.*;


public class Main {

    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            out = new PrintWriter(fos);
            out.write("印出來");
            out.println("很困難");
            out.flush();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            out.close();
        }


        /*fos.write(368);
                  fos.write(55);
                  fos.write(20320);
                  fos.flush();
                   fos.close();*/
    }
}
