/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;

import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class GenTime {
    public static ArrayList<String> listTime;
    public static ArrayList<String> genTime(){
        GenTime.listTime = readFile("listTime.txt");
        return listTime;
    }
    
}
