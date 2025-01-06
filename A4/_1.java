import java.applet.*;
import java.awt.*;

/*<applet code="_1" width=300 height=300></applet>*/

public class _1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(75,50,140,200);
		Color c = new Color(160,160,160);
		g.setColor(c);
		g.fillOval(113,110,17,23);
		g.fillOval(160,110,17,23);
		g.setColor(Color.BLACK);
		g.drawLine(145,130,135,160);
		g.drawLine(135,160,155,160);
		g.drawArc(100,120,90,90,220,100);
	}
}