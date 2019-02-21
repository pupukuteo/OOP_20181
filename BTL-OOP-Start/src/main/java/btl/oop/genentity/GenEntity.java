/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;


import btl.oop.entity.SourceExtracted;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Nguyen Anh Phuong
 */
public abstract class GenEntity {
    protected static ArrayList<String> listID;
    protected static ArrayList<String> listName;
    protected static ArrayList<String> listDescription;
    protected final ArrayList<SourceExtracted> listSourceEx = GenSourceExtracted.genSourceExtracted();
    
    public final Random rd = new Random();
    
    public <T> T getRandom(ArrayList<T> list){
        int rdIndex = rd.nextInt(list.size());
        T random = list.get(rdIndex);
        return random;
    }
    public ArrayList<SourceExtracted> getRandomSource(ArrayList<SourceExtracted> list){
        ArrayList<SourceExtracted> listSource = new ArrayList<SourceExtracted>();
        int n = rd.nextInt(3) + 1;
        int x = rd.nextInt(list.size());
        int y = rd.nextInt(list.size());
        int z = rd.nextInt(list.size());
        while(x == y){
            y = rd.nextInt(list.size());
        }
        while(z == x || z == y){
            z = rd.nextInt(list.size());
        }        
        switch (n) {
            case 1:
                listSource.add(list.get(x));
                return listSource;
            case 2:
                listSource.add(list.get(x));
                listSource.add(list.get(y));
                return listSource;
            default:
                listSource.add(list.get(x));
                listSource.add(list.get(y));
                listSource.add(list.get(z));
                return listSource;
        }
    }
}
