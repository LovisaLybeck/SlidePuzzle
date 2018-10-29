package slidepuzzle;

import java.util.Random;
import javax.swing.JButton;

public class PuzzleUtil {
    
//    SlidePuzzle sp = new SlidePuzzle();
    String[] shuffledButtonNumbers = new String[15];
    
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
    
    public void setRandomNumbersOnButtons(){
        SlidePuzzle sp = new SlidePuzzle();
        sp.button1.setText(shuffledButtonNumbers[0]);
        sp.button2.setText(shuffledButtonNumbers[1]);
        sp.button3.setText(shuffledButtonNumbers[2]);
        sp.button4.setText(shuffledButtonNumbers[3]);
        sp.button5.setText(shuffledButtonNumbers[4]);
        sp.button6.setText(shuffledButtonNumbers[5]);
        sp.button7.setText(shuffledButtonNumbers[6]);
        sp.button8.setText(shuffledButtonNumbers[7]);
        sp.button9.setText(shuffledButtonNumbers[8]);
        sp.button10.setText(shuffledButtonNumbers[9]);
        sp.button11.setText(shuffledButtonNumbers[10]);
        sp.button12.setText(shuffledButtonNumbers[11]);
        sp.button13.setText(shuffledButtonNumbers[12]);
        sp.button14.setText(shuffledButtonNumbers[13]);
        sp.button15.setText(shuffledButtonNumbers[14]);
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
