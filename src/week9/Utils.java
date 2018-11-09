package week9;

import java.io.*;
import java.util.ArrayList;

public class Utils {

    public static String readContentFromFile(String path){
         String srt = "";
        try {
            File f = new File(path);
            FileReader file = new FileReader(f);
            BufferedReader bf  = new BufferedReader(file);
            String line = bf.readLine() ;

            while(line!= null){
                System.out.println(line);
                line = bf.readLine();

            }
        }catch (IOException e){
            //e.printStackTrace();
        }
        return null;
    }

    // ghi vao file
    public static void writeContentToFile(String path){
        //BufferedWriter bf = null;
        FileWriter file = null;
        try {
            file = new FileWriter(path);
           // bf = new BufferedWriter(new FileWriter(path));
            String add = "hgfh";
            file.write(add);
        }catch (IOException e){
            //e.printStackTrace();
        }
        finally {
            try{
                file.close();
            }catch (IOException e){
              //  e.printStackTrace();
            }
        }
    }
    // ghi vao cuoi file
    public static void writeEndContentToFile(String path){
        BufferedWriter bf = null;
        try{
            bf = new BufferedWriter(new FileWriter(path,true));
           String add = "lap trinh";
            bf.write(add);

        }catch (IOException e){
            //e.printStackTrace();
        }
        finally {
            try {
                bf.close();
            }catch (IOException e)
            {
                //e.printStackTrace();
            }
        }
    }
    public static File findFileByName(String folderPath, String fileName) {
        // tao mot thu muc bang lech mkdir()
        String file = folderPath +"\\" + fileName;
         File f = new File(file);
         if(f.exists()){
             return f;
         }
         else return null;
    }
    public static void main(String[] args){
        System.out.println("check 1");
        System.out.println("doc file");
        readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\test1.txt");
        // kiem tra ham them neu  nhu file trong
        System.out.println("xoa file truoc khi xoa file");
        writeContentToFile("C:\\GitHub\\oop2018\\src\\week9\\test1.txt");
        readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\test1.txt");
        System.out.println("ghi vao cuoi file");
        writeEndContentToFile("C:\\GitHub\\oop2018\\src\\week9\\t.txt");
        readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\t.txt");
        // tim kiem  file trong thu muc
        System.out.println("Tim kiem file trong thu muc");
        System.out.println(findFileByName("C:\\GitHub\\oop2018\\src\\week9","test1.txt"));
    }
}
