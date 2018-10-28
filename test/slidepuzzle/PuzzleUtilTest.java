package slidepuzzle;

import javax.swing.JButton;
import junit.framework.TestCase;
import org.junit.Test;

public class PuzzleUtilTest {
    
    PuzzleUtil pu = new PuzzleUtil();
    SlidePuzzle sp = new SlidePuzzle();
    
    @Test
    public void isNextToEmptyButtonTest(){
        
    }
    
    // Det här testet förutsätter att man alltid börjar med siffrorna i ordning.
    // Först kolla att de ligger i ordning? I en egen testmetod? Därefter köra shuffle,
    // och därefter denna testmetod.
    @Test //jny
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
    
    @Test //jny
    public void switchButtonsTest(){
        
    }
    
    @Test
    public void isWonTest(){
        
    }
    
    // Används inte
//    @Test
//    public void buttonsTextToIntTest() {
//        JButton button20 = new JButton("20");
//        int actualNumber = pu.buttonsTextToInt(button20);
//        int expectedNumber = 20;
//        int wrongNumber = 10;
//        TestCase.assertTrue(actualNumber == expectedNumber);
//        TestCase.assertFalse(actualNumber == wrongNumber);
//    }
    
}
