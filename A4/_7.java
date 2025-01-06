import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_7" width=300 height=300></applet>*/

public class _7 extends Applet implements ItemListener 
{
    CheckboxGroup cg;
    Checkbox c1, c2, c3;
    Label l1;

    public void init() 
	{
        cg = new CheckboxGroup();

        c1 = new Checkbox("Rectangle",false,cg);
        c2 = new Checkbox("Oval",false,cg);
        c3 = new Checkbox("Line",false,cg);
        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie) 
	{
        repaint();
    }
    public void paint(Graphics g) 
	{
        if(c1.getState()) 
		{
            g.drawRect(70,100,150,100);
        } 
		if(c2.getState()) 
		{
            g.drawOval(100,100,100,100);
        } 
		if(c3.getState())
		{
            g.drawLine(100,100,200,200);
        }
    }
}
