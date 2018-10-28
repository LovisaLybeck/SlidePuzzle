package slidepuzzle;

import javax.swing.JButton;

public class PuzzleUtil {
    
    SlidePuzzle sp = new SlidePuzzle();
    
    // para: klickad knapp  return: tom knapp = obj JButton
    public void isNextToEmptyButton(){
        // Om tom knapp inte finns bredvid klickad knapp så ändrar den 
        // texten i wonLabel
        // kallar på switchButtons
        
    }
    
    // ingen para eller return
    public void shuffleButtons(){
        
    }
    
    // para: klickad knapp + tom knapp = obj JButton
    public void switchButtons(){
        // Ändrar innehållet i variablerna
    }
    
    // para: inget, return boolean
    public void isWon(){
        
    }
    
    // parameter: knappnamn (obj), retur: texten på knappen som int
    public int buttonsTextAsInt(JButton button) {
        return 1; // ändra när metoden är skriven
    }
}
