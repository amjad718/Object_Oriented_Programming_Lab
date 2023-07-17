package C05;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;

public class Question3 extends Frame implements ActionListener{
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button btn;

    public Question3(){
        setTitle("Marks");
        setLayout(new FlowLayout());

        l1 = new Label("Mark1");
        l2 = new Label("Mark2");
        l3 = new Label("Mark3");
        l4 = new Label("Mark4");
        l5 = new Label("Mark5");

        t1 = new TextField("Out of 100",10);
        t2 = new TextField("Out of 100",10);
        t3 = new TextField("Out of 100",10);
        t4 = new TextField("Out of 100",10);
        t5 = new TextField("Out of 100",10);

        btn = new Button("Submit");
        btn.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(btn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btn){
            System.exit(0);
        }

        Integer a,b,c,d,e;
        a = Integer.valueOf(t1.getText());
        b = Integer.valueOf(t2.getText());
        c = Integer.valueOf(t3.getText());
        d = Integer.valueOf(t4.getText());
        e = Integer.valueOf(t5.getText());

        Double avg = (double) ((a+b+c+d+e)/5);

        
    }

    public static void main(String[] args) {
        Question3 obj = new Question3();
        obj.setSize(200,300);
    }
}
