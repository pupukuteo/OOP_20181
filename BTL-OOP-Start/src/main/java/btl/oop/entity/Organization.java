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
public class Organization extends Entity {
    private String headOffice;
    public Organization(String id, String name, String description, ArrayList<SourceExtracted> sourceEx, String headOffice) {
        super(id, name, description, sourceEx);
        setHeadOffice(headOffice);   
    }
    public String getHeadOffice() {
        return headOffice;
    }
    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;  
    }
    
}
