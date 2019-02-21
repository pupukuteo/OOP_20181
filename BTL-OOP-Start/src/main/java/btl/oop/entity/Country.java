/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.entity;
import java.util.ArrayList;


public class Country extends Entity {
    private String continent;
    public Country(String id, String name, String description, ArrayList<SourceExtracted> sourceEx, String continent){
        super(id, name, description, sourceEx);
        setContinent(continent);
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
        
    }
}
