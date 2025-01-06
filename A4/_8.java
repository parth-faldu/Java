import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_8" width=300 height=250></applet>*/

public class _8 extends Applet implements ActionListener
{
	Button b1,b2,b3;
	
	public void init()
	{
		setLayout(null);
		b1 = new Button("Red");
		b2 = new Button("Green");
		b3 = new Button("Blue");
		b1.setBounds(50,50,40,20);
		b2.setBounds(100,50,40,20);
		b3.setBounds(150,50,40,20);
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s=="Red")
		{
			setBackground(Color.red);
		}
		else if(s=="Green")
		{
			setBackground(Color.green);
		}
		else
		{
			setBackground(Color.blue);
		}
	}
} 