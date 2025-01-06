import java.applet.*;
import java.awt.*;

/*	<applet code="shapes.java" width=200 height=600></applet>*/

public class shapes extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		setBackground(Color.black);	
		
		Font f = new Font("Calibri",Font.ITALIC,30);
		g.setFont(f);
		
		g.drawString("hi",50,30);
		
		Color c = new Color(120,50,140);
		g.setColor(c);
		
		g.drawString("parth",50,50);
		
		g.drawRect(50,60,50,40);
		g.fillRect(50,110,30,30);
		g.drawOval(50,150,50,40);
		g.fillOval(50,200,50,40);
		g.drawLine(50,260,100,260);
		g.drawRoundRect(30,280,100,50,60,100);
		g.drawArc(50,360,80,80,0,90);
		g.fillArc(50,370,80,80,180,90);
		
		int x[]={80,40,120};
		int y[]={470,550,550};
		g.drawPolygon(x,y,x.length);
	}
}
