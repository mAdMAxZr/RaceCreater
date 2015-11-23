package racecreater.Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author rainbowdash
 */
public class PiloteBDD {
    private final HashMap<String, Pilote> pilotes;
    
    PiloteBDD()
    {
        pilotes = new HashMap<>();
    }
    
    public void addPilote(Pilote p)
    {
        pilotes.put(p.getNumUCI(), p);
    }
    
    public void removePilote(String numUCI)
    {
        pilotes.remove(numUCI);
    }
    
    public Pilote getPilote(String numUCI)
    {
        return pilotes.get(numUCI);
    }
    
    public ArrayList<Pilote> getPilotesByCategorie(PiloteCategorie cat)
    {
        ArrayList<Pilote> ret = new ArrayList<>();
        
        for(String numUCI : pilotes.keySet())
        {
            Pilote p = pilotes.get(numUCI);
            if(p.getCategory() == cat)
            {
                ret.add(p);
            }
        }
        
        return ret;
    }
}
