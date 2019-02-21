/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;

import btl.oop.entity.Location;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class GenLocation extends GenEntity {
     public ArrayList<Location> genLocation(int amount){
        GenLocation.listName = readFile("listLocationName.txt");
        GenLocation.listDescription = readFile("listLocationDescription.txt");
        
        ArrayList<Location> listLocation = new ArrayList<Location>();
        
        for(int i = 1; i <= amount; i++){
            String id = "BachKhoa" + i;
            String name = getRandom(listName);
            String description = getRandom(listDescription);
            ArrayList<SourceExtracted> listSource = getRandomSource(listSourceEx);
            
            Location l = new Location(id, name, description, listSource);
            listLocation.add(l);
        }
        return listLocation;
    }   
    
}
