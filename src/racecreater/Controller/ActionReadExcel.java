package racecreater.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import racecreater.Model.Pilote;
import racecreater.Model.PiloteCategorie;

/**
 *
 * @author rainbowdash
 */
public class ActionReadExcel implements ActionListener {    
    private final JFileChooser chooser;
    
    public ActionReadExcel(JFileChooser cho)
    {
        chooser = cho;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int returnVal = chooser.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {
            String filename = chooser.getSelectedFile().getName();
            System.out.println("You chose to open this file: " + filename);
           findAllPilotes(0, 1, filename); // TODO
        }
    }
    
    public List<Pilote> findAllPilotes(int numFeuille, int indexStart, String filename)
    {
        final File file = new File(filename);
        final ArrayList<Pilote> pilotes = new ArrayList<>();
        try
        {
            final Workbook workbook = WorkbookFactory.create(file);
            final Sheet sheet = workbook.getSheetAt(numFeuille);
            int index = indexStart;
            Row row = sheet.getRow(index++);
            
            while(row != null)
            {
                try
                {
                    row.getCell(0).getStringCellValue();
                }
                catch(Exception e)
                {
                    break;
                }
                final Pilote pilote = rowToPilote(row);
                pilotes.add(pilote);
                row = sheet.getRow(index++);
            }
        }
        catch(IOException | InvalidFormatException | EncryptedDocumentException e)
        {
            System.out.println(e.getMessage());
        }
        
        return pilotes;
    }
    
    private Pilote rowToPilote(final Row row)
    {
        final String nom = row.getCell(0).getStringCellValue();
        final String prenom = row.getCell(1).getStringCellValue();
        final int age = (int) row.getCell(2).getNumericCellValue();
        final PiloteCategorie cat = PiloteCategorie.Cadet;
        final String numPlaque = row.getCell(4).getStringCellValue();
        final String club = row.getCell(5).getStringCellValue();
        final String numUCI = row.getCell(6).getStringCellValue();
        
        return new Pilote(nom, prenom, age, cat, numPlaque, club, numUCI);
    }
}
