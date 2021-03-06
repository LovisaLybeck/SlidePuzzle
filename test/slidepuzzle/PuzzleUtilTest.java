package slidepuzzle;

import javax.swing.JButton;
import junit.framework.TestCase;
import org.junit.Test;

public class PuzzleUtilTest {
    
    PuzzleUtil pu = new PuzzleUtil();
    SlidePuzzle sp = new SlidePuzzle();
    
    @Test
    public void shuffleNumbersForButtonsTest(){
        pu.shuffleNumbersForButtons();
        int nr1 = Integer.parseInt(pu.shuffledButtonNumbers[0]);
        int nr2 = Integer.parseInt(pu.shuffledButtonNumbers[1]);
        int nr3 = Integer.parseInt(pu.shuffledButtonNumbers[2]);
        int nr4 = Integer.parseInt(pu.shuffledButtonNumbers[3]);
        int nr5 = Integer.parseInt(pu.shuffledButtonNumbers[4]);
        int nr6 = Integer.parseInt(pu.shuffledButtonNumbers[5]);
        int nr7 = Integer.parseInt(pu.shuffledButtonNumbers[6]);
        int nr8 = Integer.parseInt(pu.shuffledButtonNumbers[7]);
        int nr9 = Integer.parseInt(pu.shuffledButtonNumbers[8]);
        int nr10 = Integer.parseInt(pu.shuffledButtonNumbers[9]);
        int nr11 = Integer.parseInt(pu.shuffledButtonNumbers[10]);
        int nr12 = Integer.parseInt(pu.shuffledButtonNumbers[11]);
        int nr13 = Integer.parseInt(pu.shuffledButtonNumbers[12]);
        int nr14 = Integer.parseInt(pu.shuffledButtonNumbers[13]);
        int nr15 = Integer.parseInt(pu.shuffledButtonNumbers[14]);
        TestCase.assertTrue(nr1 > nr2 || nr2 > nr3 || nr3 > nr4 || 
                            nr4 > nr5 || nr5 > nr6 || nr6 > nr7 ||
                            nr7 > nr8 || nr8 > nr9 || nr9 > nr10 ||
                            nr10 > nr11 || nr11 > nr12 || nr12 > nr13 ||
                            nr13 > nr14 || nr14 > nr15);
    }
    
    @Test
    public void switchButtonsTest(){
        JButton button15 = new JButton("9");
        JButton button16 = new JButton("");
        pu.switchButtons(button15, button16);
        TestCase.assertTrue(button15.getText() == "");
        TestCase.assertFalse(button15.getText() == "9");
        TestCase.assertTrue(button16.getText() == "9");
        TestCase.assertFalse(button16.getText() == "");
    }
    
    @Test
    public void isWonTest(){
        JButton[] buttonArray = new JButton[16];
        buttonArray[0] = new JButton("1");
        buttonArray[1] = new JButton("2");
        buttonArray[2] = new JButton("3");
        buttonArray[3] = new JButton("4");
        buttonArray[4] = new JButton("5");
        buttonArray[5] = new JButton("6");
        buttonArray[6] = new JButton("7");
        buttonArray[7] = new JButton("8");
        buttonArray[8] = new JButton("9");
        buttonArray[9] = new JButton("10");
        buttonArray[10] = new JButton("11");
        buttonArray[11] = new JButton("12");
        buttonArray[12] = new JButton("13");
        buttonArray[13] = new JButton("14");
        buttonArray[14] = new JButton("15");
        buttonArray[15] = new JButton("");
        
        TestCase.assertTrue(pu.isWon(buttonArray));
        
        buttonArray[7].setText("1");
        
        TestCase.assertFalse(pu.isWon(buttonArray));
    }
}
