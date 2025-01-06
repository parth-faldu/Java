import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_5" width=400 height=200></applet>*/

public class _5 extends Applet implements ItemListener
{
	Checkbox c1,c2;
	Label l1;
	
	public void init()
	{
		setLayout(null);
		l1 = new Label("");
		l1.setBounds(150,50,500,20);
		add(l1);
		c1 = new Checkbox("C++");
		c2 = new Checkbox("Java");
		c1.setBounds(100,100,50,20);
		add(c1);
		c2.setBounds(100,120,50,20);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{			
        if (c1.getState() && c2.getState())
		{
            c1.setState(false);
            c2.setState(false);
            l1.setText("");
        } 
		else if(c1.getState())
		{
            l1.setText("C++ Checkbox : checked");
        } 
		else if(c2.getState()) 
		{
            l1.setText("Java Checkbox : checked");
        } 
		else 
		{
            l1.setText("");
        }
	}
}