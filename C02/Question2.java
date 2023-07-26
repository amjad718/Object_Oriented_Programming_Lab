package C05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question2 extends Frame implements  ActionListener{
    TextField number1Field,number2Field,number3Field;
    Label number1Label,number2Label,number3Label,resultLabel;
    Button btn, findButton;
    public Question2() {
        setTitle("Maximum Finder");
        setSize(200,200);
        setLayout(new FlowLayout());
         number1Label = new Label("Number 1:");
         number1Field = new TextField();
         number2Label = new Label("Number 2:");
         number2Field = new TextField();
        number3Label = new Label("Number 3:");
         number3Field = new TextField();
         findButton = new Button("Find Maximum");
         btn = new Button("Close");
         resultLabel = new Label();

        add(number1Label);
        add(number1Field);
        add(number2Label);
        add(number2Field);
        add(number3Label);
        add(number3Field);
        add(findButton);
        add(resultLabel);
        add(btn);

        btn.addActionListener(this);
        findButton.addActionListener(this);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==findButton) {
            int number1 = Integer.parseInt(number1Field.getText());
            int number2 = Integer.parseInt(number2Field.getText());
            int number3 = Integer.parseInt(number3Field.getText());

            int maximum = Math.max(number1, Math.max(number2, number3));

            resultLabel.setText("Maximum: " + maximum);
        }
        if(e.getSource()==btn){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Question2();
    }

}

