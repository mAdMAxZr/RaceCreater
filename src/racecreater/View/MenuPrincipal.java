/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racecreater.View;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mAdMAx
 */
public class MenuPrincipal extends JPanel 
{
    private JLabel title;
    private JButton newCompetition;
    private JButton credit;
    private JButton quit;
    
    public MenuPrincipal() 
    {
        this.initComponent();
        
        Box boitePanel = Box.createVerticalBox();
        
        boitePanel.add(title);
        boitePanel.add(newCompetition);
        boitePanel.add(credit);
        boitePanel.add(quit);
        
        this.add(boitePanel);
    }
    
    private void initComponent()
    {
        title = new JLabel("Bienvenue dans RaceCreater");
        
        this.newCompetition = new JButton("Nouvelle compétition");
        this.credit         = new JButton("Credit");
        this.quit           = new JButton("Quitter");
    }
    
    
}
