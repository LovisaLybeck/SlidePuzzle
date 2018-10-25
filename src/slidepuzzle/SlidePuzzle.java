
package slidepuzzle;

import java.awt.*;
import javax.swing.*;


public class SlidePuzzle extends JFrame{
    JPanel backgroundPanel = new JPanel();
    JPanel puzzlePanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JLabel newGameLabel = new JLabel();
    JLabel wonLabel = new JLabel("Puzzle Game");
    JButton newGameButton = new JButton("Nytt spel");
    
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");
    JButton button11 = new JButton("11");
    JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");
    JButton button14 = new JButton("14");
    JButton button15 = new JButton("15");
    JButton button16 = new JButton("16");
    
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
        
        setSize(250, 330);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        SlidePuzzle sp = new SlidePuzzle();
    }

}
