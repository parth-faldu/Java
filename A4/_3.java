import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_3" width=400 height=500></applet> */
	
public class _3 extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	
	public void init()
	{
		setLayout(null);
		Label l1 = new Label("First Number");
		l1.setBounds(50,50,100,50);
		add(l1);
		t1 = new TextField();
		t1.setBounds(200,65,100,20);
		add(t1);
		
		Label l2 = new Label("Second Number");
		l2.setBounds(50,100,100,50);
		add(l2);
		t2 = new TextField();
		t2.setBounds(200,115,100,20);
		add(t2);
		
		Label l3 = new Label("Result");
		l3.setBounds(50,150,100,50);
		add(l3);
		t3 = new TextField();
		t3.setBounds(200,160,100,20);
		add(t3);
		
		Button b1 = new Button("Add");
		b1.setBounds(50,250,50,20);
		add(b1);
		
		Button b2 = new Button("Sub");
		b2.setBounds(110,250,50,20);
		add(b2);
		
		Button b3 = new Button("Mul");
		b3.setBounds(170,250,50,20);
		add(b3);
		
		Button b4 = new Button("Div");
		b4.setBounds(230,250,50,20);
		add(b4);
		
		Button b5 = new Button("Cancel");
		b5.setBounds(290,250,50,20);
		add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		
		if(s.equals("Add"))
		{
			t3.setText(String.valueOf(n1+n2));
		}
		else if(s.equals("Sub"))
		{
			t3.setText(String.valueOf(n1-n2));
		}
		else if(s.equals("Mul"))
		{
			t3.setText(String.valueOf(n1*n2));
		}
		else if(s.equals("Div"))
		{
			t3.setText(String.valueOf(n1/n2));
		}
		else 
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}