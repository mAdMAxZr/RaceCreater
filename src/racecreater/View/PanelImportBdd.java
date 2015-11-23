/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racecreater.View;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mAdMAx
 */
public class PanelImportBdd extends JPanel
{
    private JButton next;
    private JButton addBdd;
    
    public PanelImportBdd() {
        this.initComponent();
    }

    
    
    private void initComponent()
    {
        this.next    = new JButton("Suivant");
        this.addBdd  = new JButton("Ajouter un fichier excel de pilotes");
        
        Box boite = Box.createVerticalBox();
        boite.add(addBdd);
        boite.add(next);
    
        this.add(boite);
    }
    
    
}
