/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;


import btl.oop.entity.Person;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class GenPerson extends GenEntity{
    private static ArrayList<String> listJob;

    public ArrayList<Person> genPerson(int amount){
        GenPerson.listName = readFile("listPersonName.txt");
        GenPerson.listDescription = readFile("listPersonDescription.txt");
        GenPerson.listJob = readFile("listPersonJob.txt");
        ArrayList<Person> listPerson = new ArrayList<Person>();
        for(int i = 1; i <= amount; i++){            
            String id = "NguoiLa" + i;
            String name = getRandom(listName);
            String description = getRandom(listDescription);
            ArrayList<SourceExtracted> listSource = getRandomSource(listSourceEx);
            String job = getRandom(listJob);
            
            Person p = new Person(id, name, description, listSource, job);
            
            listPerson.add(p);
        }
        return listPerson;
    }
}
