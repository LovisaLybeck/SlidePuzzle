package slidepuzzle;

import junit.framework.TestCase;
import org.junit.Test;

public class SlidePuzzleTest {
    PuzzleUtil pu = new PuzzleUtil();
    SlidePuzzle sp = new SlidePuzzle();
    
    @Test
    public void isWonTest(){
        sp.button1.setText("1");
        sp.button2.setText("2");
        sp.button3.setText("3");
        sp.button4.setText("4");
        sp.button5.setText("5");
        sp.button6.setText("6");
        sp.button7.setText("7");
        sp.button8.setText("8");
        sp.button9.setText("9");
        sp.button10.setText("10");
        sp.button11.setText("11");
        sp.button12.setText("12");
        sp.button13.setText("13");
        sp.button14.setText("14");
        sp.button15.setText("15");
        sp.button16.setText("");
        
        TestCase.assertTrue(sp.isWon());
        
        sp.button15.setText("");
        sp.button16.setText("15");
        
        TestCase.assertFalse(sp.isWon());
    }
}
