/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.readfile;
import java.util.*;
import java.io.*;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class ReadFile {
    public static ArrayList<String> readFile(String Path){
        ArrayList<String> list = new ArrayList<String>();
        try{ 
            Reader fr = new FileReader(Path);
            BufferedReader bfr = new BufferedReader(fr);
            String line = bfr.readLine();
            while(line != null){
                list.add(line);
               line = bfr.readLine();
            }       
            fr.close();
            bfr.close();
        }
        catch(Exception ex){
            System.out.println("Đọc File không thành công");
        }
        return list;
    }
    
}
