
package slidepuzzle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class SlidePuzzle extends JFrame{
    PuzzleUtil pu = new PuzzleUtil();
    
    JPanel backgroundPanel = new JPanel();
    JPanel puzzlePanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JLabel newGameLabel = new JLabel();
    JLabel wonLabel = new JLabel("Puzzle Game");
    JButton newGameButton = new JButton("Nytt spel");
    
    // Tog bort initialiseringen här, på alla utom den tomma knappen. 
    // De byter nummer längre ner, innan de visas för första gången.
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button10 = new JButton();
    JButton button11 = new JButton();
    JButton button12 = new JButton();
    JButton button13 = new JButton();
    JButton button14 = new JButton();
    JButton button15 = new JButton();
    JButton button16 = new JButton("");
    
    SlidePuzzle(){
        backgroundPanel.setLayout(new FlowLayout());
        puzzlePanel.setLayout(new GridLayout(4, 4));
        add(backgroundPanel);
        backgroundPanel.add(topPanel);
        backgroundPanel.add(puzzlePanel);
        backgroundPanel.add(bottomPanel);
        
        bottomPanel.add(newGameButton);
        topPanel.add(wonLabel);
        
        puzzlePanel.add(button1);
        puzzlePanel.add(button2);
        puzzlePanel.add(button3);
        puzzlePanel.add(button4);
        puzzlePanel.add(button5);
        puzzlePanel.add(button6);
        puzzlePanel.add(button7);
        puzzlePanel.add(button8);
        puzzlePanel.add(button9);
        puzzlePanel.add(button10);
        puzzlePanel.add(button11);
        puzzlePanel.add(button12);
        puzzlePanel.add(button13);
        puzzlePanel.add(button14);
        puzzlePanel.add(button15);
        puzzlePanel.add(button16);
        
        button1.setPreferredSize(new Dimension(50, 50));
        
        setSize(300, 330);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pu.shuffleNumbersForButtons();
        button1.setText(pu.shuffledButtonNumbers[0]);
        button2.setText(pu.shuffledButtonNumbers[1]);
        button3.setText(pu.shuffledButtonNumbers[2]);
        button4.setText(pu.shuffledButtonNumbers[3]);
        button5.setText(pu.shuffledButtonNumbers[4]);
        button6.setText(pu.shuffledButtonNumbers[5]);
        button7.setText(pu.shuffledButtonNumbers[6]);
        button8.setText(pu.shuffledButtonNumbers[7]);
        button9.setText(pu.shuffledButtonNumbers[8]);
        button10.setText(pu.shuffledButtonNumbers[9]);
        button11.setText(pu.shuffledButtonNumbers[10]);
        button12.setText(pu.shuffledButtonNumbers[11]);
        button13.setText(pu.shuffledButtonNumbers[12]);
        button14.setText(pu.shuffledButtonNumbers[13]);
        button15.setText(pu.shuffledButtonNumbers[14]);
        // Kolla direkt här om sifforna råkat hamna i ordning, 
        // så att spelet redan är vunnet.
        // isWon()
        
        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // pu.isNextToEmptyButton(ae.getSource());
            }
        }
    }
    
    public static void main(String[] args) {
        SlidePuzzle sp = new SlidePuzzle();
    }
}
