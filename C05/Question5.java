package C05;
import java.awt.*;
import java.awt.event.*;

public class Question5 extends Frame implements ActionListener{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5,b6,b7;

    public Question5(){
        setTitle("Calculator");
//        setSize(500,500);
        setLayout(new FlowLayout());

        l1 = new Label("Num 1:");
        l2 = new Label("Num 2:");
        l3 = new Label("Result:");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");
        b5 = new Button("Mod");
        b6 = new Button("Reset");
        b7 = new Button("Close");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        double a=0,b=0,c=0;
        try
        {
            a = Double.parseDouble(t1.getText());
        }
        catch (NumberFormatException ge) {
            t1.setText("Invalid input");
        }
        try
        {
            b = Double.parseDouble(t2.getText());
        }
        catch (NumberFormatException ge) {
            t2.setText("Invalid input");
        }
        if(e.getSource()==b1){
            t3.setText(String.valueOf(a+b));
        }
        if(e.getSource()==b2){
            t3.setText(String.valueOf(a-b));
        }
        if(e.getSource()==b3){
            t3.setText(String.valueOf(a*b));
        }
        if(e.getSource()==b4){
            t3.setText(String.valueOf(a/b));
        }
        if(e.getSource()==b5){
            t3.setText(String.valueOf(a%b));
        }
        if(e.getSource()==b6){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        if(e.getSource()==b7){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Question5 clc = new Question5();
        clc.setSize(200,200);
    }
}