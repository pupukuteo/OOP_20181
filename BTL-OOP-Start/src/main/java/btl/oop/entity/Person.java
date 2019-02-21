/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.entity;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class Person extends Entity {
    private String job;
    public Person(String id, String name, String description, ArrayList<SourceExtracted> sourceEx, String job) {
        super(id, name, description, sourceEx);
        setJob(job);
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }  
}
