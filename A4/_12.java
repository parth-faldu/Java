import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_12" width=500 height=100></applet>*/

public class _12 extends Applet implements ActionListener
{
	List l1,l2;
	Button b1,b2,b3,b4;
	
	String fruit1,fruit2;
	
	public void init()
	{
		setLayout(null);
		
		l1 = new List();
		l1.setBounds(20,14,125,63);
		add(l1);
		
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Orange");
		
		
		b1 = new Button(">");
		b1.setBounds(160,35,30,20);
		add(b1);
		
		b2 = new Button("<");
		b2.setBounds(200,35,30,20);
		add(b2);
		
		b3 = new Button(">>");
		b3.setBounds(240,35,30,20);
		add(b3);
		
		b4 = new Button("<<");
		b4.setBounds(280,35,30,20);
		add(b4);
		
		l2 = new List();
		l2.setBounds(330,14,125,63);
		add(l2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String b = ae.getActionCommand(); 
		fruit1 = l1.getSelectedItem();
		fruit2 = l2.getSelectedItem();
		
		if(b == ">")
		{
			if(fruit1 != null)
			{
				l2.add(fruit1);
				l1.remove(fruit1);
			}
		}
		else if(b == "<")
		{
			if(fruit2 != null)
			{
				l1.add(fruit2);
				l2.remove(fruit2);
			}
		}
		else if(b == ">>")
		{
			for(String item : l1.getItems())
			{
				l2.add(item);
			}
			l1.removeAll();
		}
		else
		{
			for(String item : l2.getItems())
			{
				l1.add(item);
			}
			l2.removeAll();
		}
	}
}