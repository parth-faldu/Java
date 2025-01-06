import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="form.java" width=350 height=450></applet>*/

public class form extends Applet implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	TextField t1,t2,t3,t4,t5,t6;
	public void init()
	{
		setLayout(null);
		
		l1 = new Label("User Name:");
		l1.setBounds(10,0,70,30);
		add(l1);
		t1 = new TextField();
		t1.setBounds(90,5,150,20);
		add(t1);
		
		l2 = new Label("Mobile No:");
		l2.setBounds(10,30,70,30);
		add(l2);
		t2 = new TextField();
		t2.setBounds(90,35,150,20);
		add(t2);
		
		l3 = new Label("Faculty:");
		l3.setBounds(10,60,70,30);
		add(l3);
		t3 = new TextField();
		t3.setBounds(90,65,150,20);
		add(t3);
		
		l4 = new Label("Program:");
		l4.setBounds(10,90,70,30);
		add(l4);
		t4 = new TextField();
		t4.setBounds(90,95,150,20);
		add(t4);
		
		l5 = new Label("Enrno:");
		l5.setBounds(10,120,70,30);
		add(l5);
		t5 = new TextField();
		t5.setBounds(90,125,150,20);
		add(t5);
		
		l6 = new Label("Result:");
		l6.setBounds(10,150,70,30);
		add(l6);
		t6 = new TextField();
		t6.setBounds(90,155,150,20);
		add(t6);
		
		Button b1 = new Button("Show Details");
		b1.setBounds(100,220,110,20);
		add(b1);
		
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		l7 = new Label("-:Personal Details:-");
		l7.setBounds(100,280,110,20);
		add(l7);
		
		l8 = new Label("Your Name is "+t1.getText());
		l8.setBounds(100,330,200,20);
		add(l8);
		
		l9 = new Label("Your Mobile no is "+t2.getText());
		l9.setBounds(100,350,200,20);
		add(l9);
		
		l10 = new Label("Your Faculty is "+t3.getText());
		l10.setBounds(100,370,200,20);
		add(l10);
		
		l11 = new Label("Your Program is "+t4.getText());
		l11.setBounds(100,390,200,20);
		add(l11);
		
		l12 = new Label("Your Enrno is "+t5.getText());
		l12.setBounds(100,410,200,20);
		add(l12);
		
		l13 = new Label("Your Result is "+t4.getText());
		l13.setBounds(100,430,200,20);
		add(l13);
	}
}
