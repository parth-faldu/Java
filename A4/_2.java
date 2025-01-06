import java.applet.*;
import java.awt.*;

/*<applet code="_2" width=500 height=400></applet>*/

public class _2 extends Applet
{
	public void paint(Graphics g)
	{
		Color c1 = new Color(255,204,154);
		g.setColor(c1);
		g.fillRect(40,50,390,270);
		
		Color c2 = new Color(46,98,110);
		g.setColor(c2);
		g.fillOval(70,70,160,100);
		g.setColor(Color.black);
		
		Font f1 = new Font("",Font.BOLD,20);
		g.setFont(f1);
		g.drawString("Circle",120,125);
		
		Color c3 = new Color(125,51,51);
		g.setColor(c3);
		g.fillRect(260,70,130,110);
		
		g.setColor(Color.black);
		g.drawString("Square",290,125);
		
		Color c4 = new Color(51,99,125);
		g.setColor(c4);
		g.fillOval(100,220,230,80);
		
		g.setColor(Color.black);
		g.drawString("Oval",190,270);
	}
}