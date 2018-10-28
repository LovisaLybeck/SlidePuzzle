package slidepuzzle;

import java.util.Random;
import javax.swing.JButton;

public class PuzzleUtil {
    
    // SlidePuzzle sp = new SlidePuzzle();
    String[] shuffledButtonNumbers = new String[15];
    
    // para: klickad knapp  return: tom knapp = obj JButton
    public void isNextToEmptyButton(){
        // Om tom knapp inte finns bredvid klickad knapp så ändrar den 
        // texten i wonLabel
        // kallar på switchButtons
        
    }
    
    public void shuffleNumbersForButtons(){
        for (int i = 1; i <= 15; i++) {
            Random random = new Random();
            boolean run = true;
            while(run) {                
                int indexPlace = random.nextInt(15);
                if (shuffledButtonNumbers[indexPlace] == null){
                    shuffledButtonNumbers[indexPlace] = i + "";
                    run = false;
                }
            }
        }        
    }
    
    public void switchButtons(JButton pressedButton, JButton emptyButton){
        emptyButton.setText(pressedButton.getText());
        pressedButton.setText("");
    }
    
    // para: inget, return boolean
    public void isWon(){
        
    }
    
    // Används inte
    // parameter: knappnamn (obj), retur: texten på knappen som int
//    public int buttonsTextToInt(JButton button) {
//        String sNumber = button.getText();
//        int intNumber = Integer.parseInt(sNumber);
//        return intNumber; // ändra när metoden är skriven
//    }
}
