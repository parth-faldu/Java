import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="factorial.java" width=400 height=150></applet>*/

public class _4 extends Applet implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	
	public void init()
	{
		setLayout(null);
		l1 = new Label("Enter any Integer Value");
		l1.setBounds(150,10,150,20);
		add(l1);
		t1 = new TextField();
		t1.setBounds(130,30,180,20);
		add(t1);
		
		l2 = new Label("Factorial Value is");
		l2.setBounds(115,50,150,20);
		add(l2);
		t2 = new TextField();
		t2.setBounds(100,70,170,20);
		add(t2);
		
		b1 = new Button("compute");
		b1.setBounds(280,70,70,20);
		add(b1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n=Integer.parseInt(t1.getText());
		int f=1;
		if(n==0)
			f=0;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		t2.setText(String.valueOf(f));
	}
}