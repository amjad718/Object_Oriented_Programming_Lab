package applet_package;
//import java.util.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Question2 implements ActionListener{
//	
//	public void main(String args[]) {
//		Frame f = new Frame();
//		f.setVisible(true);
//		
//		//Setting up the first text area
//		TextField t1 = new TextField("Insert 1st");
//		t1.setBounds(20, 30, 150, 30);
//		f.add(t1);
//		
//		//Setting up the second text area
//		TextField t2 = new TextField("Insert 2nd");
//		t2.setBounds(20, 70, 150, 30);
//		f.add(t2);
//		
//		//Setting up the third text area
//		TextField t3 = new TextField("Insert 3rd");
//		t3.setBounds(20, 110, 150, 30);
//		f.add(t3);
//		
//		//Setting up the fourth text area for result
//		TextField t4 = new TextField("Result");
//		t4.setBounds(20, 150, 200, 30);
//		f.add(t4);
//		
//		//Setting up the buttons
//		Button btn = new Button("Click Here");
//			btn.setBounds(100,200,80,30);
//			f.add(btn);
//			btn.addActionListener(this);
//			
//		//Setting up the frames
//		f.setSize(300,300);
//		f.setLayout(null);
//		f.setTitle("Sample Button");
//	}
//	public void actionPerformed(ActionEvent e) {
//		t4.setText("Welcome to JavaTPoint");
//	}
//}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question2 extends Frame {
    private TextField number1Field, number2Field, number3Field;
    private Label resultLabel;

    public Question2() {
        setTitle("Maximum Finder");
        setSize(800, 800);
        setLayout(null);

        Label number1Label = new Label("Number 1:");
        number1Label.setBounds(20,40,150,20);
        number1Field = new TextField();
        number1Field.setBounds(20, 70, 150, 30);

        Label number2Label = new Label("Number 2:");
        number2Label.setBounds(20,110,150,20);
        number2Field = new TextField();
        number2Field.setBounds(20, 140, 150, 30);

        Label number3Label = new Label("Number 3:");
        number3Label.setBounds(20,190,150,20);
        number3Field = new TextField();
        number3Field.setBounds(20, 210, 150, 30);

        Button findButton = new Button("Find Maximum");
        findButton.setBounds(30, 260, 100, 30);

        resultLabel = new Label();
        resultLabel.setBounds(10, 310, 150, 30);

        add(number1Label);
        add(number1Field);
        add(number2Label);
        add(number2Field);
        add(number3Label);
        add(number3Field);
        add(findButton);
        add(resultLabel);

        findButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(number1Field.getText());
                int number2 = Integer.parseInt(number2Field.getText());
                int number3 = Integer.parseInt(number3Field.getText());

                int maximum = Math.max(number1, Math.max(number2, number3));

                resultLabel.setText("Maximum: " + maximum);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Question2();
    }
}

