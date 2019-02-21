/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;


import btl.oop.entity.Country;
import btl.oop.entity.Event;
import btl.oop.entity.Location;
import btl.oop.entity.Organization;
import btl.oop.entity.Person;
import btl.oop.entity.Relationship;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Nguyen Anh Phuong
 */
public class GenGeneral {

    public static ArrayList<Person> listPerson;
    public static ArrayList<Location> listLocation;
    public static ArrayList<Event> listEvent;
    public static ArrayList<Organization> listOrganization;
    public static ArrayList<Country> listCountry;
    public static ArrayList<Relationship> listRelationship = new ArrayList<Relationship>();
    private final String s1 = "tổ_chức";
    private final String s2 = "đến_thăm";
    private final String s3 = "diễn_ra_tại";
    private final String s4 = "tham_gia";
    private final ArrayList<String> listTime = GenTime.genTime();
    
    Random rd = new Random();
    public <T> T getRandom(ArrayList<T> list){
        int rdIndex = rd.nextInt(list.size());
        T random = list.get(rdIndex);
        return random;
    }  
    public void genGeneral(int m, int n){
        genEntity(m);
        genListRelationship(n);
    }
    public void genEntity(int m){
        //Phan tich m thanh 5 so nguyen duong 
        int x1 = m/5;
        int x2 = m/5;
        int x3 = m/5;
        int x4 = m/5;
        int x5 = m - x1 - x2 - x3 - x4;
        // Sinh nguoi
        GenPerson person = new GenPerson();
        listPerson = person.genPerson(x1);
        // Sinh dia diem
        GenLocation location = new GenLocation();
        listLocation = location.genLocation(x2);
        // Sinh Su Kien      
        GenEvent event = new GenEvent();
        listEvent = event.genEvent(x3);
        // Sinh To chuc
        GenOrganization organization = new GenOrganization();
        listOrganization = organization.genOrganization(x4);
        // Sinh Dat nuoc
       
        GenCountry country = new GenCountry();
        listCountry = country.genCountry(x5);
        // Sinh quan he
    }
    public void genListRelationship(int n){
//        ArrayList<Relationship> listRelationship = new ArrayList<Relationship>();
        
        GenGeneral gen = new GenGeneral();
        //Phan tich n thanh 7 so nguyen duong
        int n1 = n/7;
        int n2 = n1;
        int n3 = n1;
        int n4 = n1;
        int n5 = n1;
        int n6 = n1;
        int n7 = n - n1 - n2 -n3 - n4 - n5 - n6;
        for(int  i = 1; i <= n1; i++){
            Relationship r = gen.genRelationship(listOrganization, s1 , listEvent);
            listRelationship.add(r);
        }
        
        for(int  i = 1; i <= n2; i++){
            Relationship r = gen.genRelationship(listPerson, s2 , listLocation);
            listRelationship.add(r);
        }
        
        for(int  i = 1; i <= n3; i++){
            Relationship r = gen.genRelationship(listOrganization, s2 , listLocation);
            listRelationship.add(r);
        }
        
        for(int  i = 1; i <= n4; i++){
            Relationship r = gen.genRelationship(listEvent, s3 , listLocation);
            listRelationship.add(r);
        }
        
        for(int  i = 1; i <= n5; i++){
            Relationship r = gen.genRelationship(listCountry, s4 , listEvent);
            listRelationship.add(r);
        }
        
        for(int  i = 1; i <= n6; i++){
            Relationship r = gen.genRelationship(listEvent, s3 , listCountry);
            listRelationship.add(r);
        }
        
        for(int  i = 1; i <= n7; i++){
            Relationship r = gen.genRelationship(listPerson, s4 , listEvent);
            listRelationship.add(r);
        }
              
    }
    public <T1, T2> Relationship genRelationship(ArrayList<T1> list1, String name, ArrayList<T2> list2){       
        T1 e1 = getRandom(list1);
        
        T2 e2 = getRandom(list2);
       
        String time = getRandom(listTime);
        
        Relationship r = new Relationship(e1, name, e2, time);
        return r;
    }
}