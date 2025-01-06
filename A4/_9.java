import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_9" width=400 height=300></applet>*/

public class _9 extends Applet implements ActionListener
{
	Button b1;
	Choice c1;
	Label l1;
	
	public void init()
	{
		setLayout(null);
		c1 = new Choice();
		c1.add("C");
		c1.add("C++");
		c1.add("Java");
		c1.add("PHP");
		c1.add("Android");
		c1.setBounds(100,100,80,20);
		add(c1);
		b1 = new Button("Show");
		b1.setBounds(200,100,40,20);
		add(b1);
		
		l1 = new Label("");
		l1.setBounds(100,50,300,20);
		add(l1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("Programming language Selected : "+c1.getSelectedItem());
	}
} 