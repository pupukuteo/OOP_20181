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
public abstract class Entity {
    protected String id;
    protected String name;
    protected String description;
    protected ArrayList<SourceExtracted> sourceEx;
    public Entity(String id, String name, String description, ArrayList<SourceExtracted> sourceEx){
        setId(id);
        setName(name);
        setDescription(description);
        setSourceExtracted(sourceEx);
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public ArrayList<SourceExtracted> getSourceExtracted(){
        return sourceEx;
    }
    public void setSourceExtracted(ArrayList<SourceExtracted> sourceEx){
        this.sourceEx = sourceEx;       
    }
}
