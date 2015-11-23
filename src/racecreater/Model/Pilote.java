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
public class Pilote {
    private final String nom;
    private final String prenom;
    private final int age;
    private final String club;
    private final String numeroUCI;
    private final PiloteCategorie categorie;
    private final String numPlaque;
    
    public Pilote(String nom, String prenom, int age, PiloteCategorie categorie, String numPlaque, String club, String numUCI)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numPlaque = numPlaque;
        this.club = club;
        this.categorie = categorie;
        this.numeroUCI = numUCI;
    }
    
    @Override
    public String toString()
    {
        String str = "";
        str += "Nom: " + nom;
        str += "Prenom: " + prenom;
        str += "Age: " + age;
        str += "Categorie:" + categorie;
        str += "Numéro de plaque: " + numPlaque;
        str += "Club: " + club;
        str += "Numéro UCI: " + numeroUCI;
        
        return str;
    }
}
