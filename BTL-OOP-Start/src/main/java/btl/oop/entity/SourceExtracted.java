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
public class SourceExtracted {
    private String linkEx;
    private String timeEx;
    public SourceExtracted(String linkEx, String timeEx){
        setLinkEx(linkEx);
        setTimeEx(timeEx);       
    }
//    public String toString(){
//        return "link: " + linkEx + "time" + timeEx;
//    }
    public SourceExtracted(){
    }
    public String getLinkEx(){
        return linkEx;
    }
    public String getTimeEx(){
        return timeEx;
    }
    public void setLinkEx(String linkEx){
        this.linkEx =  linkEx;
    }
    public void setTimeEx(String timeEx){
        this.timeEx = timeEx;
    }
    public String toString(){
        return "\n" + "Link trích rút: " + linkEx + "\n" + " Thời gian trích rút: " + timeEx + "\n";
        
    }
}

