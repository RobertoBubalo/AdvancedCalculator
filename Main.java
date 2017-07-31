package com.robertobubalo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeListener;


public class Main {

    public static JFrame frame;
    public static JPanel gui;
    public static JTextField a;
    public static JTextField b;
    public static String currentInput = "";
    public static String historyInput = "";
    public static String firstNumber = "";
    public static String operationInProgress;



    public static void main(String[] args) {

        frame = new JFrame();
        gui = new JPanel(new BorderLayout(5,5));


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
            gui.grabFocus();

            currentInput = "";
            historyInput += currentInput;
            b.setText("");
            }
        });
        content.add(c);

        javax.swing.JButton squareBtn = new javax.swing.JButton("x*x");
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
                    Long x = Long.valueOf(firstNumber);
                    historyInput = "";
                    historyInput += firstNumber + "*" + firstNumber;
                    b.setText(historyInput);

                    firstNumber = ("" + x*x);
                    a.setText(""+x*x);
                }else{
                    Long x = Long.valueOf(currentInput);
                    historyInput = "";
                    historyInput += currentInput + "*" + currentInput;
                    b.setText(historyInput);

                    currentInput = ("" + x*x);
                    checkingFont();
                    a.setText(""+x*x);

                }
                gui.grabFocus();
            }
        });
        content.add(squareBtn);


        javax.swing.JButton oneDividedByX = new javax.swing.JButton("1/x");
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
                float temporary = Float.valueOf(currentInput);
                float additionalOne = 1/temporary;
                System.out.println("1." + temporary);
                if(temporary == Math.floor(temporary) && additionalOne == Math.floor(additionalOne) ){
                    historyInput = "";
                    historyInput += "1/" + currentInput;
                    b.setText(historyInput);

                    Integer x = Integer.valueOf(currentInput);
                    float result = (float)1/(float)x;
                    currentInput = "" +result;
                    a.setText(result+"");
                }else if(additionalOne == Math.floor(additionalOne)){
                    historyInput = "";
                    historyInput += "1/" + currentInput;
                    b.setText(historyInput);

                    int b = Math.round(additionalOne);
                    currentInput = "" +b;
                    a.setText("" +b);
                }
                else{
                    historyInput = "";
                    historyInput += "1/" + currentInput;
                    b.setText(historyInput);

                    temporary = 1/temporary;
                    System.out.println("2." + temporary);
                    a.setText("" +temporary);
                    currentInput = "" + temporary;
                }
                gui.grabFocus();
            }
        });
        content.add(oneDividedByX);


        javax.swing.JButton division = new javax.swing.JButton("÷");
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
                if(currentInput.equals("")){

                }else{
                    firstNumber = currentInput;
                }

                operationInProgress = "division";

                if(currentInput.equals("")){
                    historyInput = resetOperations("/");
                }else{
                    historyInput = currentInput + "/";
                }
                b.setText(historyInput);
                currentInput = "";
                gui.grabFocus();
            }
        });
        content.add(division);


        javax.swing.JButton seventhBtn = new javax.swing.JButton("7");
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
                gui.grabFocus();
            }
        });
        content.add(seventhBtn);

        javax.swing.JButton eighthBtn = new javax.swing.JButton("8");
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
                gui.grabFocus();
            }
        });
        content.add(eighthBtn);


        javax.swing.JButton ninthBtn = new javax.swing.JButton("9");
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
                gui.grabFocus();
            }
        });
        content.add(ninthBtn);


        javax.swing.JButton multiplication = new javax.swing.JButton("*");
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
                if(currentInput.equals("")){

                }else{
                    firstNumber = currentInput;
                }
                operationInProgress = "multiplication";
                if(currentInput.equals("")){
                    historyInput = resetOperations("*");
                }else{
                    historyInput = currentInput + "*";
                }
                b.setText(historyInput);
                currentInput = "";
                gui.grabFocus();
            }
        });
        content.add(multiplication);

        javax.swing.JButton fourthBtn = new javax.swing.JButton("4");
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
                gui.grabFocus();
            }
        });
        content.add(fourthBtn);


        javax.swing.JButton fifthBtn = new javax.swing.JButton("5");
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
                gui.grabFocus();
            }
        });
        content.add(fifthBtn);

        javax.swing.JButton sixthBtn = new javax.swing.JButton("6");
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
                gui.grabFocus();
            }
        });
        content.add(sixthBtn);

        javax.swing.JButton subtraction = new javax.swing.JButton("-");
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
                if(currentInput.equals("")){

                }else{
                    firstNumber = currentInput;
                }
                operationInProgress = "subtraction";
                if(currentInput.equals("")){
                    historyInput = resetOperations("-");
                }else{
                    historyInput = currentInput + "-";
                }
                b.setText(historyInput);
                currentInput = "";
                gui.grabFocus();
            }
        });
        content.add(subtraction);


        javax.swing.JButton firstBtn = new javax.swing.JButton("1");
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
                gui.grabFocus();
            }
        });
        content.add(firstBtn);


        javax.swing.JButton secondBtn = new javax.swing.JButton("2");
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
                gui.grabFocus();
            }
        });
        content.add(secondBtn);


        javax.swing.JButton thirdBtn = new javax.swing.JButton("3");
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
                gui.grabFocus();
            }
        });
        content.add(thirdBtn);

        javax.swing.JButton addition = new javax.swing.JButton("+");
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
                if(currentInput.equals("")){

                }else{
                    firstNumber = currentInput;
                }
                operationInProgress = "addition";
                if(currentInput.equals("")){
                    historyInput = resetOperations("+");
                }else{
                    historyInput = currentInput + "+";
                }
                b.setText(historyInput);
                currentInput = "";
                gui.grabFocus();
            }
        });
        content.add(addition);

        javax.swing.JButton changePosNeg  = new javax.swing.JButton("±");
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
                if ( currentInput.indexOf("-") >= 0){
                    if (currentInput.equals("0") ){

                    }else{
                        currentInput = currentInput.replace("-", "");
                        a.setText(currentInput);
                    }

                }else{
                    if (currentInput.equals("0") ){

                    }else{
                        currentInput = "-" + currentInput;
                        a.setText(currentInput);
                    }

                }
                gui.grabFocus();
            }
        });
        content.add(changePosNeg);

        javax.swing.JButton zeroBtn = new javax.swing.JButton("0");
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
                gui.grabFocus();
            }
        });
        content.add(zeroBtn);

        javax.swing.JButton decimalPoint = new javax.swing.JButton(".");
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
                if(currentInput.indexOf(".")>= 0){

                }else{
                    if (currentInput.equals("")){
                        currentInput = 0 + ".";
                        a.setText(currentInput);
                    }else{
                        currentInput = currentInput + ".";
                        a.setText(currentInput);
                    }

                }
                gui.grabFocus();
            }
        });
        content.add(decimalPoint);

        javax.swing.JButton equal = new javax.swing.JButton("=");
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

                getResult();
            }
        });
        content.add(equal);


        gui.add(content, BorderLayout.CENTER);

        Container info = new JPanel(
                new FlowLayout(FlowLayout.LEFT, 60, 5));
        b = new JTextField();
        b.setHorizontalAlignment(SwingConstants.RIGHT);
        b.setEditable(false);
        b.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        b.setPreferredSize(new Dimension(270,50));
        b.setSelectionColor(Color.RED);
        b.setSelectedTextColor(Color.RED);
        b.setCaretColor(Color.RED);
        b.setForeground(Color.MAGENTA);
        b.setFont(new Font (Font.SANS_SERIF,Font.BOLD, 32));

        a = new JTextField();
        a.setHorizontalAlignment(SwingConstants.RIGHT);
        a.setEditable(false);
        a.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        a.setPreferredSize(new Dimension(270,50));
        a.setSelectionColor(Color.RED);
        a.setSelectedTextColor(Color.RED);
        a.setCaretColor(Color.RED);
        a.setForeground(Color.MAGENTA);
        a.setFont(new Font (Font.SANS_SERIF,Font.BOLD, 32));






        info.add(b, BorderLayout.PAGE_START);
        info.add(a, BorderLayout.LINE_START);

        info.setPreferredSize(new Dimension(gui.getWidth(),110));

        gui.add(info, BorderLayout.PAGE_START);

        gui.add(new JLabel(""), BorderLayout.LINE_END);
        gui.add(new JLabel(""), BorderLayout.LINE_START);
        gui.add(new JLabel("down under",SwingConstants.CENTER), BorderLayout.SOUTH);
        gui.setFocusable(true);
        gui.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                  String temp = String.valueOf(e.getKeyChar());
                if(temp.matches("[0-9]+") && temp.length() == 1){
                    currentInput += temp;
                    a.setText(currentInput);

                }else if ( temp.equals(".")){
                    if(currentInput.contains(".")){

                    }else{
                        if (currentInput.equals("")){
                            currentInput = 0 + ".";
                            a.setText(currentInput);
                        }else{
                            currentInput = currentInput + ".";
                            a.setText(currentInput);
                        }
                    }
                }else if (temp.equals("+")){
                    firstNumber = currentInput;
                    currentInput = "";
                    operationInProgress = "addition";
                    gui.grabFocus();
                }else if (temp.equals("-")){
                    firstNumber = currentInput;
                    currentInput = "";
                    operationInProgress = "subtraction";
                    gui.grabFocus();
                }else if (temp.equals("*")){
                    firstNumber = currentInput;
                    currentInput = "";
                    operationInProgress = "multiplication";
                    gui.grabFocus();
                }else if (temp.equals("/")){
                    firstNumber = currentInput;
                    currentInput = "";
                    operationInProgress = "division";
                    gui.grabFocus();
                }else if(temp.equals("=") ){
                    getResult();

                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    getResult();

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(gui);
        frame.setSize(350,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.hasFocus();




        frame.setVisible(true);
    }

    public static void checkingFont(){
        if(currentInput.length() >= 15){
            a.setFont(new Font (Font.SANS_SERIF,Font.BOLD, 27));
        }else{
            a.setFont(new Font (Font.SANS_SERIF,Font.BOLD, 32));
        }
    }

    public static void getResult(){
        float temporary;
        float firstFloatNum = Float.valueOf(firstNumber);
        float secondFloatNum = Float.valueOf(currentInput);
        int falseFloat;
        switch (operationInProgress){
            case "addition":
                temporary = (firstFloatNum +secondFloatNum);
                if (temporary == Math.floor(temporary) && firstFloatNum == Math.floor(firstFloatNum)
                        && secondFloatNum == Math.floor(secondFloatNum)) {
                    Integer firstNum = Integer.valueOf(firstNumber);
                    Integer secondNum = Integer.valueOf(currentInput);

                    historyInput = "";
                    historyInput += firstNumber + "+" + currentInput;
                    b.setText(historyInput);

                    firstNumber = "" + (firstNum+secondNum);
                    a.setText(firstNumber);
                    currentInput = firstNumber;
                }else if(temporary == Math.floor(temporary)) {
                    historyInput = "";
                    historyInput += firstNumber + "+" + currentInput;
                    b.setText(historyInput);

                    falseFloat = Math.round(temporary);
                    a.setText(""+falseFloat);
                    currentInput = "" + falseFloat;

                }else{
                    historyInput = "";
                    historyInput += firstNumber + "+" + currentInput;
                    b.setText(historyInput);

                    a.setText("" + temporary);
                    currentInput = "" + temporary;

                }
                break;
            case "subtraction":
                temporary = (firstFloatNum -secondFloatNum);
                if (temporary == Math.floor(temporary) && firstFloatNum == Math.floor(firstFloatNum)
                        && secondFloatNum == Math.floor(secondFloatNum)) {
                    Integer firstNum = Integer.valueOf(firstNumber);
                    Integer secondNum = Integer.valueOf(currentInput);

                    historyInput = "";
                    historyInput += firstNumber + "-" + currentInput;
                    b.setText(historyInput);

                    firstNumber = "" + (firstNum-secondNum);
                    a.setText(firstNumber);
                    currentInput = firstNumber;
                }else if(temporary == Math.floor(temporary)) {
                    historyInput = "";
                    historyInput += firstNumber + "-" + currentInput;
                    b.setText(historyInput);

                    falseFloat = Math.round(temporary);
                    a.setText(""+falseFloat);
                    currentInput = "" + falseFloat;

                }else{
                    historyInput = "";
                    historyInput += firstNumber + "-" + currentInput;
                    b.setText(historyInput);

                    a.setText("" + temporary);
                    currentInput = "" + temporary;

                }
                break;
            case "multiplication":
                temporary = (firstFloatNum *secondFloatNum);
                if (temporary == Math.floor(temporary) && firstFloatNum == Math.floor(firstFloatNum)
                        && secondFloatNum == Math.floor(secondFloatNum)) {
                    Integer firstNum = Integer.valueOf(firstNumber);
                    Integer secondNum = Integer.valueOf(currentInput);

                    historyInput = "";
                    historyInput += firstNumber + "*" + currentInput;
                    b.setText(historyInput);

                    firstNumber = "" + (firstNum*secondNum);
                    a.setText(firstNumber);
                    currentInput = firstNumber;
                }else if(temporary == Math.floor(temporary)) {
                    historyInput = "";
                    historyInput += firstNumber + "*" + currentInput;
                    b.setText(historyInput);

                    falseFloat = Math.round(temporary);
                    a.setText(""+falseFloat);
                    currentInput = "" + falseFloat;

                }else{
                    historyInput = "";
                    historyInput += firstNumber + "*" + currentInput;
                    b.setText(historyInput);

                    a.setText("" + temporary);
                    currentInput = "" + temporary;

                }
                break;

            case "division":
                temporary = (firstFloatNum / secondFloatNum);
                if (secondFloatNum != 0){
                    if (temporary == Math.floor(temporary) && firstFloatNum == Math.floor(firstFloatNum)
                            && secondFloatNum == Math.floor(secondFloatNum)) {
                        Integer firstNum = Integer.valueOf(firstNumber);
                        Integer secondNum = Integer.valueOf(currentInput);

                        historyInput = "";
                        historyInput += firstNumber + "/" + currentInput;
                        b.setText(historyInput);

                        firstNumber = "" + (firstNum/secondNum);
                        a.setText(firstNumber);
                        currentInput = firstNumber;
                    }else if(temporary == Math.floor(temporary)) {
                        historyInput = "";
                        historyInput += firstNumber + "/" + currentInput;
                        b.setText(historyInput);

                        falseFloat = Math.round(temporary);
                        a.setText(""+falseFloat);
                        currentInput = "" + falseFloat;

                    }else{
                        historyInput = "";
                        historyInput += firstNumber + "/" + currentInput;
                        b.setText(historyInput);

                        a.setText("" + temporary);
                        currentInput = "" + temporary;

                    }
                    break;
                }else{
                    historyInput = "";
                    historyInput += firstNumber + "/" + currentInput;
                    b.setText(historyInput);

                    a.setText("Error");
                    currentInput = "";
                }

        }
        gui.grabFocus();
    }

    public static String resetOperations(String operation){
        if(historyInput.contains("+") || historyInput.contains("-") || historyInput.contains("*")
                || historyInput.contains("/")){

                if(historyInput.contains("-")){
                    historyInput = historyInput.replace("-", operation);
                }else if (historyInput.contains("+")){
                    historyInput = historyInput.replace("+", operation);
                }else if (historyInput.contains("/")){
                    historyInput = historyInput.replace("/", operation);
                }else if (historyInput.contains("*")){
                    historyInput = historyInput.replace("*", operation);
                }



            return historyInput;
        }
        else{
            return historyInput+operation;
        }
    }

}
