
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
    
    JButton[] buttonArray = new JButton[16];
    
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
        
        puzzlePanel.add(buttonArray[0] = button1);
        puzzlePanel.add(buttonArray[1] = button2);
        puzzlePanel.add(buttonArray[2] = button3);
        puzzlePanel.add(buttonArray[3] = button4);
        puzzlePanel.add(buttonArray[4] = button5);
        puzzlePanel.add(buttonArray[5] = button6);
        puzzlePanel.add(buttonArray[6] = button7);
        puzzlePanel.add(buttonArray[7] = button8);
        puzzlePanel.add(buttonArray[8] = button9);
        puzzlePanel.add(buttonArray[9] = button10);
        puzzlePanel.add(buttonArray[10] = button11);
        puzzlePanel.add(buttonArray[11] = button12);
        puzzlePanel.add(buttonArray[12] = button13);
        puzzlePanel.add(buttonArray[13] = button14);
        puzzlePanel.add(buttonArray[14] = button15);
        puzzlePanel.add(buttonArray[15] = button16);
        
        do {
            pu.shuffleNumbersForButtons();
            pu.setRandomNumbersOnButtons(buttonArray);
        } while (pu.isWon(buttonArray));
        
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                do {
                    pu.shuffleNumbersForButtons();
                    pu.setRandomNumbersOnButtons(buttonArray);
                } while (pu.isWon(buttonArray));
                
                wonLabel.setText("Puzzle Game");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[0]));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[1]));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[2]));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[3]));
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[4]));
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[5]));
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[6]));
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[7]));
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[8]));
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[9]));
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[10]));
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[11]));
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[12]));
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[13]));
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[14]));
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                wonLabel.setText(pu.isNextToEmptyButton(buttonArray, buttonArray[15]));
            }
        });
        
        button1.setPreferredSize(new Dimension(50, 50));
        puzzlePanel.setPreferredSize(new Dimension(250, 250));
        setSize(300, 380);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
        SlidePuzzle sp = new SlidePuzzle();
    }
}
