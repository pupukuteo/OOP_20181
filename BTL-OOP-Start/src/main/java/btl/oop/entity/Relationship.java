/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.entity;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class Relationship {
    private Entity entity1;
    private String nameRelationship; 
    private Entity entity2;
    private String time;
    
    public <T1, T2> Relationship(T1 entity1, String nameRelationship, T2 entity2, String time){
        this.entity1 = (Entity) entity1;
        this.entity2 = (Entity) entity2;
        this.nameRelationship = nameRelationship;
        this.time = time;
    }
    
    public Entity getEntity1(){
        return entity1;
    }
    public void setEntity1(Entity entity1){
        this.entity1 = entity1;
    }
    public Entity getEntity2(){
        return entity2;
    }
    public void setEntity2(Entity entity2){
        this.entity2 = entity2;
    }
    public String getNameRelationship(){
        return nameRelationship;
    }
    public void setNameRelationship(String nameRelationship){
        this.nameRelationship = nameRelationship;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
}
