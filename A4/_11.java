import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_11" width=300 height=250></applet>*/

public class _11 extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b1;
	int v1=0,v2=0,v3=0;
	
	public void init()
	{
		setLayout(null);
		
		t1 = new TextField();
		t1.setBounds(10,10,60,20);
		add(t1);
		
		t2 = new TextField();
		t2.setBounds(80,10,60,20);
		add(t2);
		
		t3 = new TextField();
		t3.setBounds(150,10,60,20);
		add(t3);
		
		b1 = new Button("Fill");
		b1.setBounds(95,40,30,20);
		add(b1);
				
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty())
		{
			return;
		}
		else
		{
			v1 = Integer.parseInt(t1.getText());
			v2 = Integer.parseInt(t2.getText());
			v3 = Integer.parseInt(t3.getText());
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty())
		{
			return;
		}
		else
		{
			Color c1 = new Color(v1,v2,v3);
			g.setColor(c1);
			g.fillRect(50,100,100,80);
		}
	}
}