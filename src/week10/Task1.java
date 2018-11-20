package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private  List<String> list = new ArrayList<>();
    public List<String> getAllFuntions(File path){
        BufferedReader bf = null;
        String line;
       try{
           bf  = new BufferedReader(new FileReader(path));
           while(bf.readLine()!= null){
               // kiem tra xem trong dong line co chuoi staic khong nieu co thi them vao Arraylist;
               line = bf.readLine();
               if(line.contains("static")==true){
                   list.add(line);
               }
           }
       }catch (IOException e){
           e.printStackTrace();
       }finally {
           try{
               bf.close();
           }catch (IOException e){
               e.printStackTrace();
           }
       }
        return list;
    }
    public String findFunctionByName(String name){
        String l ="";
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(name)==true){
               l= name;
            }
        }
        return l;
    }
    public static void main(String[] args){
        Task1 task1 = new Task1();
        task1.getAllFuntions(new File("C:\\GitHub\\oop2018\\src\\week9\\Utils.java"));
        task1.findFunctionByName("public static void main(String[] args");
    }
}
