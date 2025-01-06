import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="_10" width=500 height=300></applet>*/

public class _10 extends Applet implements ActionListener
{
	Button b1;
	Label l;
	List l1,l2;
	
	public void init()
	{
		setLayout(null);
		
		l = new Label("");
		l.setBounds(10,50,1000,20);
		add(l);
		
		l1 = new List(4);
		l1.add("C");
		l1.add("C++");
		l1.add("Java");
		l1.add("PHP");
		l1.setBounds(100,100,80,70);
		add(l1);
		
		l2 = new List(4,true);
		l2.add("Turbo C++");
		l2.add("Spring");
		l2.add("Hibernate");
		l2.add("Codelgniter");
		l2.setBounds(100,200,100,70);
		add(l2);
		
		b1 = new Button("Show");
		b1.setBounds(220,160,50,30);
		add(b1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1 = l1.getSelectedItem();
		String s2[] = l2.getSelectedItems();
		String framwork="";
		
		for(String s : s2)
		{
			framwork += s + " ";
		}
		l.setText("Programming language Selected : "+ s1 +",Framework Selected : " + framwork);
	}
} 