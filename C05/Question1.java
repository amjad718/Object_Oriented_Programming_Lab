package applet_package;
import java.awt.*;
import java.applet.*;

public class Question1 extends Applet{
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawLine(10, 10, 100, 100);
		g.drawOval(40, 40, 80, 80);
		g.drawRect(90, 90, 60, 90);
	}
}
