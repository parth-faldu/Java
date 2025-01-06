import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="KeyDemo" width=300 height=200></applet>*/

public class KeyDemo extends Applet implements KeyListener
{
	int code;
	char ch;
	public void init()
	{
		addKeyListener(this);
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Released...");
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Pressed...");
		code = ke.getKeyCode();
		ch = ke.getKeyChar();
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		showStatus("Key Typed...");
	}
	public void paint(Graphics g)
	{
		g.drawString(""+ch+code,40,50);
	}
}
