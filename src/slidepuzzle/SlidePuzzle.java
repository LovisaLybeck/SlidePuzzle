
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
        do {
            pu.shuffleNumbersForButtons();
            setRandomNumbersOnButtons();
        } while (isWon());
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
        
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                do {
                    pu.shuffleNumbersForButtons();
                    setRandomNumbersOnButtons();
                } while (isWon());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button3);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button7);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button8);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button9);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button10);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button11);
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button12);
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button13);
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button14);
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button15);
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isNextToEmptyButton(button16);
            }
        });
        button1.setPreferredSize(new Dimension(50, 50));
        puzzlePanel.setPreferredSize(new Dimension(250, 250));
        
        puzzlePanel.setPreferredSize(new Dimension(250, 250));
        
        setSize(300, 380);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public void isNextToEmptyButton(JButton pressedButton){
        wonLabel.setText("Puzzle Game");
        if (pressedButton == button1){
            if (button2.getText().equals("")) {
                pu.switchButtons(pressedButton, button2);
            } else if (button5.getText().equals("")){
                pu.switchButtons(pressedButton, button5);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button2) {
            if (button1.getText().equals("")){
                pu.switchButtons(pressedButton, button1);
            } else if (button3.getText().equals("")){
                pu.switchButtons(pressedButton, button3);
            } else if (button6.getText().equals("")){
                pu.switchButtons(pressedButton, button6);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button3) {
            if (button2.getText().equals("")){
                pu.switchButtons(pressedButton, button2);
            } else if (button4.getText().equals("")){
                pu.switchButtons(pressedButton, button4);
            } else if (button7.getText().equals("")){
                pu.switchButtons(pressedButton, button7);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        }else if (pressedButton == button4) {
            if (button3.getText().equals("")){
                pu.switchButtons(pressedButton, button3);
            } else if (button8.getText().equals("")){
                pu.switchButtons(pressedButton, button8);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        }else if (pressedButton == button5) {
            if (button1.getText().equals("")){
                pu.switchButtons(pressedButton, button1);
            } else if (button6.getText().equals("")){
                pu.switchButtons(pressedButton, button6);
            } else if (button9.getText().equals("")){
                pu.switchButtons(pressedButton, button9);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button6) {
            if (button2.getText().equals("")){
                pu.switchButtons(pressedButton, button2);
            } else if (button5.getText().equals("")){
                pu.switchButtons(pressedButton, button5);
            } else if (button7.getText().equals("")){
                pu.switchButtons(pressedButton, button7);
            } else if (button10.getText().equals("")){
                pu.switchButtons(pressedButton, button10);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button7) {
            if (button3.getText().equals("")){
                pu.switchButtons(pressedButton, button3);
            } else if (button6.getText().equals("")){
                pu.switchButtons(pressedButton, button6);
            } else if (button8.getText().equals("")){
                pu.switchButtons(pressedButton, button8);
            } else if (button11.getText().equals("")){
                pu.switchButtons(pressedButton, button11);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button8) {
            if (button4.getText().equals("")){
                pu.switchButtons(pressedButton, button4);
            } else if (button7.getText().equals("")){
                pu.switchButtons(pressedButton, button7);
            } else if (button12.getText().equals("")){
                pu.switchButtons(pressedButton, button12);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button9) {
            if (button5.getText().equals("")){
                pu.switchButtons(pressedButton, button5);
            } else if (button10.getText().equals("")){
                pu.switchButtons(pressedButton, button10);
            } else if (button13.getText().equals("")){
                pu.switchButtons(pressedButton, button13);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button10) {
            if (button6.getText().equals("")){
                pu.switchButtons(pressedButton, button6);
            } else if (button9.getText().equals("")){
                pu.switchButtons(pressedButton, button9);
            } else if (button11.getText().equals("")){
                pu.switchButtons(pressedButton, button11);
            } else if (button14.getText().equals("")){
                pu.switchButtons(pressedButton, button14);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button11) {
            if (button7.getText().equals("")){
                pu.switchButtons(pressedButton, button7);
            } else if (button10.getText().equals("")){
                pu.switchButtons(pressedButton, button10);
            } else if (button12.getText().equals("")){
                pu.switchButtons(pressedButton, button12);
            } else if (button15.getText().equals("")){
                pu.switchButtons(pressedButton, button15);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button12) {
            if (button8.getText().equals("")){
                pu.switchButtons(pressedButton, button8);
            } else if (button11.getText().equals("")){
                pu.switchButtons(pressedButton, button11);
            } else if (button16.getText().equals("")){
                pu.switchButtons(pressedButton, button16);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button13) {
            if (button9.getText().equals("")){
                pu.switchButtons(pressedButton, button9);
            } else if (button14.getText().equals("")){
                pu.switchButtons(pressedButton, button14);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button14) {
            if (button10.getText().equals("")){
                pu.switchButtons(pressedButton, button10);
            } else if (button13.getText().equals("")){
                pu.switchButtons(pressedButton, button13);
            } else if (button15.getText().equals("")){
                pu.switchButtons(pressedButton, button15);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button15) {
            if (button11.getText().equals("")){
                pu.switchButtons(pressedButton, button11);
            } else if (button14.getText().equals("")){
                pu.switchButtons(pressedButton, button14);
            } else if (button16.getText().equals("")){
                pu.switchButtons(pressedButton, button16);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
            
        } else if (pressedButton == button16) {
            if (button12.getText().equals("")){
                pu.switchButtons(pressedButton, button12);
            } else if (button15.getText().equals("")){
                pu.switchButtons(pressedButton, button15);
            } else {
                wonLabel.setText("Det måste finnas en tom ruta bredvid!");
            }
        }
        
        if (isWon()){
            wonLabel.setText("Du vann!");
        }
    }
     
     public void setRandomNumbersOnButtons(){
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
        button16.setText("");
        
        for (int i = 0; i <= 14; i++) {
            pu.shuffledButtonNumbers[i] = null;
        }
        
    }
     
    public boolean isWon(){
        if (button1.getText().equals("1") && button2.getText().equals("2") && 
                button3.getText().equals("3") && button4.getText().equals("4") && 
                button5.getText().equals("5") && button6.getText().equals("6") && 
                button7.getText().equals("7") && button8.getText().equals("8") && 
                button9.getText().equals("9") && button10.getText().equals("10") && 
                button11.getText().equals("11") && button12.getText().equals("12") && 
                button13.getText().equals("13") && button14.getText().equals("14") && 
                button15.getText().equals("15") && button16.getText().equals("")){
            return true;
            
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        SlidePuzzle sp = new SlidePuzzle();
        PuzzleUtil pu = new PuzzleUtil();
    }
}
