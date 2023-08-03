import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question1 extends Frame implements ActionListener {
    TextField t1,t111,t2,t222,t3;
    Button b1,b2;
    Label l1,l111,l2,l222,l3;
    Question1(){
        setTitle("Name and Address");
        setSize(400,400);
        setBackground(Color.yellow);
        setLayout(new FlowLayout());

        l1 = new Label("Name");
        t1 = new TextField(10);
        l111 = new Label("Length");
        t111 = new TextField(10);
        l2 = new Label("Address");
        t2 = new TextField(10);
        l222 = new Label("Length");
        t222 = new TextField(10);
        l3 = new Label("Result");
        t3 = new TextField(20);
        b1 = new Button("Result");
        b2 = new Button("Close");

        add(l1);
        add(t1);
        add(l111);
        add(t111);
        add(l2);
        add(t2);
        add(l222);
        add(t222);
        add(l3);
        add(t3);
        add(b1);
        add(b2);


        b1.addActionListener(this);
        b2.addActionListener(this);

        b1.setBackground(Color.red);
        b2.setBackground(Color.red);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Question1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            int t11 = t1.getText().length();
            int t22 = t2.getText().length();
            int t33 = t11+t22;
            t111.setText(String.valueOf(t11));
            t222.setText(String.valueOf(t22));
            t3.setText(String.valueOf(t33));
        }
        if(e.getSource()==b2){
            System.exit(0);
        }
    }
}
