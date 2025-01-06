import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_6" width=250 height=200></applet>*/

public class _6 extends Applet implements ItemListener
{
	CheckboxGroup cg;
	Checkbox c1,c2,c3;
	Label l1;
	
	public void init()
	{
		setLayout(null);
		
		cg = new CheckboxGroup();
		
		c1 = new Checkbox("Red",false,cg);
		c2 = new Checkbox("Green",false,cg);
		c3 = new Checkbox("Blue",false,cg);
		c1.setBounds(50,50,40,20);
		c2.setBounds(100,50,50,20);
		c3.setBounds(160,50,50,20);
		add(c1);
		add(c2);
		add(c3);
		
		l1 = new Label("");
		l1.setBounds(100,100,100,20);
		add(l1);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState())
		{
			l1.setText("Color : Red");
		}
		else if(c2.getState())
		{
			l1.setText("Color : Blue");
		}
		else
		{
			l1.setText("Color : Green");
		}
	}
}