/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racecreater.Model;

/**
 *
 * @author rainbowdash
 */
public enum PiloteCategorie {
    Minimes("Minimes"),
    Cadet("Cadet");
    
    private String name;
    
    PiloteCategorie(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
