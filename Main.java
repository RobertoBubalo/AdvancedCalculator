package com.robertobubalo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Main {

    public static JTextField a;
    public static String currentInput = "";
    public static String firstNumber = "";
    public static String operationInProgress;
    public static boolean isEqualtoSign;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel gui = new JPanel(new BorderLayout(5,5));


        Container content = new JPanel(new GridLayout(5,4,25,25));

        JButton c = new JButton("C");
        c.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
            a.setText("");
            currentInput = "";
            }
        });
        content.add(c);

        JButton squareBtn = new JButton("x*x");
        squareBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentInput.equals("")){
                    Integer x = Integer.valueOf(firstNumber);
                    a.setText(""+x*x);
                }else{
                    Integer x = Integer.valueOf(currentInput);
                    a.setText(""+x*x);
                }
            }
        });
        content.add(squareBtn);


        JButton oneDividedByX = new JButton("1/x");
        oneDividedByX.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Integer x = Integer.valueOf(currentInput);
                float result = (float)1/(float)x;
                a.setText(result+"");
            }
        });
        content.add(oneDividedByX);


        JButton division = new JButton("÷");
        division.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = currentInput;
                operationInProgress = "divison";
                currentInput = "";
            }
        });
        content.add(division);


        JButton seventhBtn = new JButton("7");
        seventhBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "7";
                a.setText(currentInput);
            }
        });
        content.add(seventhBtn);

        JButton eighthBtn = new JButton("8");
        eighthBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "8";
                a.setText(currentInput);
            }
        });
        content.add(eighthBtn);


        JButton ninthBtn = new JButton("9");
        ninthBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "9";
                a.setText(currentInput);
            }
        });
        content.add(ninthBtn);


        JButton multiplication = new JButton("*");
        multiplication.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = currentInput;
                currentInput = "";
                operationInProgress = "multiplication";
            }
        });
        content.add(multiplication);


        JButton fourthBtn = new JButton("4");
        fourthBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "4";
                a.setText(currentInput);
            }
        });
        content.add(fourthBtn);


        JButton fifthBtn = new JButton("5");
        fifthBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "5";
                a.setText(currentInput);
            }
        });
        content.add(fifthBtn);



        JButton sixthBtn = new JButton("6");
        sixthBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "6";
                a.setText(currentInput);
            }
        });
        content.add(sixthBtn);

        JButton subtraction = new JButton("-");
        subtraction.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = currentInput;
                currentInput = "";
                operationInProgress = "subtraction";
            }
        });
        content.add(subtraction);


        JButton firstBtn = new JButton("1");
        firstBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "1";
                a.setText(currentInput);
            }
        });
        content.add(firstBtn);


        JButton secondBtn = new JButton("2");
        secondBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "2";
                a.setText(currentInput);
            }
        });
        content.add(secondBtn);


        JButton thirdBtn = new JButton("3");
        thirdBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "3";
                a.setText(currentInput);
            }
        });
        content.add(thirdBtn);

        JButton addition = new JButton("+");
        addition.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = currentInput;
                currentInput = "";
                operationInProgress = "addition";
            }
        });
        content.add(addition);

        JButton changePosNeg  = new JButton("±");
        changePosNeg.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                // treba dodati if da provjerava prvi znak, u slucaju da postoji da ga makne
                // u protivnom ga treba dodati
                currentInput = "-" + currentInput;
                a.setText(currentInput);
            }
        });
        content.add(changePosNeg);

        JButton zeroBtn = new JButton("0");
        zeroBtn.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + "0";
                a.setText(currentInput);
            }
        });
        content.add(zeroBtn);

        JButton decimalPoint = new JButton(".");
        decimalPoint.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                currentInput = currentInput + ".";
                a.setText(currentInput);
            }
        });
        content.add(decimalPoint);

        JButton equal = new JButton("=");
        equal.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Integer firstNum = Integer.valueOf(firstNumber);
                Integer secondNum = Integer.valueOf(currentInput);
                firstNumber = "" + (firstNum+secondNum);
                a.setText(firstNumber);
                System.out.printf(firstNumber);
                currentInput = "";

            }
        });
        content.add(equal);


        gui.add(content, BorderLayout.CENTER);

        Container info = new JPanel(
                new FlowLayout(FlowLayout.LEFT, 50, 5));
        a = new JTextField();
        a.setHorizontalAlignment(SwingConstants.RIGHT);

        a.setPreferredSize(new Dimension(270,50));
        a.setSelectionColor(Color.RED);
        a.setSelectedTextColor(Color.RED);
        a.setCaretColor(Color.RED);
        a.setForeground(Color.MAGENTA);

        a.setFont(new Font (Font.SANS_SERIF,Font.BOLD, 32));
        info.add(a);
        info.setPreferredSize(new Dimension(gui.getWidth(),65));

        gui.add(info, BorderLayout.PAGE_START);

        gui.add(new JLabel(""), BorderLayout.LINE_END);
        gui.add(new JLabel(""), BorderLayout.LINE_START);
        gui.add(new JLabel("down under",SwingConstants.CENTER), BorderLayout.SOUTH);

        frame.add(gui);
        frame.setSize(350,500);



        frame.setVisible(true);
    }
}
