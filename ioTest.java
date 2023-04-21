package ioTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ioTest {
    public static void main(String[] args) throws Exception {
        String input = "D:/music1.mp3";
        String output = "./music1.mp3";

        copyFile(input, output);
        copyFileByte(input, output);
        copyFileBuffer(input, output);
        copyFileBufferByte(input, output);

        String str1 = "D:/test1.txt";
        String str2 = "./test1.txt";
        copyFileChar(str1, str2);

        File file = new File(output);
        boolean exist = file.exists();
        System.out.println(exist);
    }

    public static int seconds(long afterIO, long beforeIO) {
        int seconds = (int) (afterIO - beforeIO);
        return seconds;
    }

    public static void copyFile(String input, String output) throws IOException {
        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);
        int by = 0;
        long beforeIO = System.currentTimeMillis();
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();

        long afterIO = System.currentTimeMillis();
        System.out.println("ToTal cost:" + seconds(afterIO, beforeIO) + "ms");
    }

    public static void copyFileByte(String input, String output) throws IOException {
        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);
        int by = 0;
        byte[] bytes = new byte[1024];
        long beforeIO = System.currentTimeMillis();
        while ((by = fis.read()) != -1) {
            fos.write(bytes, 0, by);
        }
        fis.close();
        fos.close();

        long afterIO = System.currentTimeMillis();
        System.out.println("ToTal cost:" + seconds(afterIO, beforeIO) + "ms");
    }

    public static void copyFileBuffer(String input, String output) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output));
        int by = 0;
        long beforeIO = System.currentTimeMillis();
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();

        long afterIO = System.currentTimeMillis();
        System.out.println("ToTal cost:" + seconds(afterIO, beforeIO) + "ms");
    }

    public static void copyFileBufferByte(String input, String output) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output));
        int by = 0;
        byte[] bytes = new byte[1024];
        long beforeIO = System.currentTimeMillis();
        while ((by = bis.read()) != -1) {
            bos.write(bytes, 0, by);
        }
        bis.close();
        bos.close();

        long afterIO = System.currentTimeMillis();
        System.out.println("ToTal cost:" + seconds(afterIO, beforeIO) + "ms");
    }

    public static void copyFileChar(String input, String output) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "GBK"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output), "GBK"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
        }
        br.close();
        bw.close();
    }
}
