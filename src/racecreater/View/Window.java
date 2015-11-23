package racecreater.View;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author mAdMAx
 */
public class Window extends JFrame 
{
    
    public Window()
    {
        this.initComponent();
        
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void initComponent()
    {
        this.setLayout(new BorderLayout());
        MenuPrincipal menu = new MenuPrincipal();
        
        this.add(menu);
    }
}
