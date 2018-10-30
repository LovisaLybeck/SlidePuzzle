package slidepuzzle;

import java.util.Random;
import javax.swing.JButton;

public class PuzzleUtil {
    
    String[] shuffledButtonNumbers = new String[15];
    
    public String isNextToEmptyButton(JButton[] buttonArray, JButton pressedButton){
        String result = "Puzzle Game";
        if (pressedButton == buttonArray[0]){
            if (buttonArray[1].getText().equals("")) {
                switchButtons(pressedButton, buttonArray[1]);
            } else if (buttonArray[4].getText().equals("")){
                switchButtons(pressedButton, buttonArray[4]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[1]) {
            if (buttonArray[0].getText().equals("")){
                switchButtons(pressedButton, buttonArray[0]);
            } else if (buttonArray[2].getText().equals("")){
                switchButtons(pressedButton, buttonArray[2]);
            } else if (buttonArray[5].getText().equals("")){
                switchButtons(pressedButton, buttonArray[5]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[2]) {
            if (buttonArray[1].getText().equals("")){
                switchButtons(pressedButton, buttonArray[1]);
            } else if (buttonArray[3].getText().equals("")){
                switchButtons(pressedButton, buttonArray[3]);
            } else if (buttonArray[6].getText().equals("")){
                switchButtons(pressedButton, buttonArray[6]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        }else if (pressedButton == buttonArray[3]) {
            if (buttonArray[2].getText().equals("")){
                switchButtons(pressedButton, buttonArray[2]);
            } else if (buttonArray[7].getText().equals("")){
                switchButtons(pressedButton, buttonArray[7]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        }else if (pressedButton == buttonArray[4]) {
            if (buttonArray[0].getText().equals("")){
                switchButtons(pressedButton, buttonArray[0]);
            } else if (buttonArray[5].getText().equals("")){
                switchButtons(pressedButton, buttonArray[5]);
            } else if (buttonArray[8].getText().equals("")){
                switchButtons(pressedButton, buttonArray[8]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[5]) {
            if (buttonArray[1].getText().equals("")){
                switchButtons(pressedButton, buttonArray[1]);
            } else if (buttonArray[4].getText().equals("")){
                switchButtons(pressedButton, buttonArray[4]);
            } else if (buttonArray[6].getText().equals("")){
                switchButtons(pressedButton, buttonArray[6]);
            } else if (buttonArray[9].getText().equals("")){
                switchButtons(pressedButton, buttonArray[9]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[6]) {
            if (buttonArray[2].getText().equals("")){
                switchButtons(pressedButton, buttonArray[2]);
            } else if (buttonArray[5].getText().equals("")){
                switchButtons(pressedButton, buttonArray[5]);
            } else if (buttonArray[7].getText().equals("")){
                switchButtons(pressedButton, buttonArray[7]);
            } else if (buttonArray[10].getText().equals("")){
                switchButtons(pressedButton, buttonArray[10]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[7]) {
            if (buttonArray[3].getText().equals("")){
                switchButtons(pressedButton, buttonArray[3]);
            } else if (buttonArray[6].getText().equals("")){
                switchButtons(pressedButton, buttonArray[6]);
            } else if (buttonArray[11].getText().equals("")){
                switchButtons(pressedButton, buttonArray[11]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[8]) {
            if (buttonArray[4].getText().equals("")){
                switchButtons(pressedButton, buttonArray[4]);
            } else if (buttonArray[9].getText().equals("")){
                switchButtons(pressedButton, buttonArray[9]);
            } else if (buttonArray[12].getText().equals("")){
                switchButtons(pressedButton, buttonArray[12]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[9]) {
            if (buttonArray[5].getText().equals("")){
                switchButtons(pressedButton, buttonArray[5]);
            } else if (buttonArray[8].getText().equals("")){
                switchButtons(pressedButton, buttonArray[8]);
            } else if (buttonArray[10].getText().equals("")){
                switchButtons(pressedButton, buttonArray[10]);
            } else if (buttonArray[13].getText().equals("")){
                switchButtons(pressedButton, buttonArray[13]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[10]) {
            if (buttonArray[6].getText().equals("")){
                switchButtons(pressedButton, buttonArray[6]);
            } else if (buttonArray[9].getText().equals("")){
                switchButtons(pressedButton, buttonArray[9]);
            } else if (buttonArray[11].getText().equals("")){
                switchButtons(pressedButton, buttonArray[11]);
            } else if (buttonArray[14].getText().equals("")){
                switchButtons(pressedButton, buttonArray[14]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[11]) {
            if (buttonArray[7].getText().equals("")){
                switchButtons(pressedButton, buttonArray[7]);
            } else if (buttonArray[10].getText().equals("")){
                switchButtons(pressedButton, buttonArray[10]);
            } else if (buttonArray[15].getText().equals("")){
                switchButtons(pressedButton, buttonArray[15]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[12]) {
            if (buttonArray[8].getText().equals("")){
                switchButtons(pressedButton, buttonArray[8]);
            } else if (buttonArray[13].getText().equals("")){
                switchButtons(pressedButton, buttonArray[13]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[13]) {
            if (buttonArray[9].getText().equals("")){
                switchButtons(pressedButton, buttonArray[9]);
            } else if (buttonArray[12].getText().equals("")){
                switchButtons(pressedButton, buttonArray[12]);
            } else if (buttonArray[14].getText().equals("")){
                switchButtons(pressedButton, buttonArray[14]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[14]) {
            if (buttonArray[10].getText().equals("")){
                switchButtons(pressedButton, buttonArray[10]);
            } else if (buttonArray[13].getText().equals("")){
                switchButtons(pressedButton, buttonArray[13]);
            } else if (buttonArray[15].getText().equals("")){
                switchButtons(pressedButton, buttonArray[15]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
            
        } else if (pressedButton == buttonArray[15]) {
            if (buttonArray[11].getText().equals("")){
                switchButtons(pressedButton, buttonArray[11]);
            } else if (buttonArray[14].getText().equals("")){
                switchButtons(pressedButton, buttonArray[14]);
            } else {
                result = "Det måste finnas en tom ruta bredvid!";
            }
        }
        
        if (isWon(buttonArray)){
            result = "Du vann!";
        }
        
        return result;
        
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
    
    public void setRandomNumbersOnButtons(JButton[] buttonArray){
        buttonArray[0].setText(shuffledButtonNumbers[0]);
        buttonArray[1].setText(shuffledButtonNumbers[1]);
        buttonArray[2].setText(shuffledButtonNumbers[2]);
        buttonArray[3].setText(shuffledButtonNumbers[3]);
        buttonArray[4].setText(shuffledButtonNumbers[4]);
        buttonArray[5].setText(shuffledButtonNumbers[5]);
        buttonArray[6].setText(shuffledButtonNumbers[6]);
        buttonArray[7].setText(shuffledButtonNumbers[7]);
        buttonArray[8].setText(shuffledButtonNumbers[8]);
        buttonArray[9].setText(shuffledButtonNumbers[9]);
        buttonArray[10].setText(shuffledButtonNumbers[10]);
        buttonArray[11].setText(shuffledButtonNumbers[11]);
        buttonArray[12].setText(shuffledButtonNumbers[12]);
        buttonArray[13].setText(shuffledButtonNumbers[13]);
        buttonArray[14].setText(shuffledButtonNumbers[14]);
        buttonArray[15].setText("");
        
        for (int i = 0; i <= 14; i++) {
            shuffledButtonNumbers[i] = null;
        }
        
    }
    
    public void switchButtons(JButton pressedButton, JButton emptyButton){
        emptyButton.setText(pressedButton.getText());
        pressedButton.setText("");
    }
    
    public boolean isWon(JButton[] buttonArray){
        if (buttonArray[0].getText().equals("1") && buttonArray[1].getText().equals("2") && 
                buttonArray[2].getText().equals("3") && buttonArray[3].getText().equals("4") && 
                buttonArray[4].getText().equals("5") && buttonArray[5].getText().equals("6") && 
                buttonArray[6].getText().equals("7") && buttonArray[7].getText().equals("8") && 
                buttonArray[8].getText().equals("9") && buttonArray[9].getText().equals("10") && 
                buttonArray[10].getText().equals("11") && buttonArray[11].getText().equals("12") && 
                buttonArray[12].getText().equals("13") && buttonArray[13].getText().equals("14") && 
                buttonArray[14].getText().equals("15") && buttonArray[15].getText().equals("")){
            return true;
            
        } else {
            return false;
        }
    }
}
