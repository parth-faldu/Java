import java.applet.*;
import java.awt.*;

/*<applet code="lifecycle" width="600" height="400"></applet>*/

public class lifecycle extends Applet
{
	public static void main(String args[])
	{
		String s = "parth";
		
		public void init()
		{
			s = s + "Init() executed...";
		}
		public void start()
		{
			s = s + "start() executed...";
		}
		public void stop()
		{
			s = s + "stop() executed...";
		}
		public void paint(Graphics g)
		{
			g.drawString("hii",40,50);
		}
		public void destroy()
		{
			s = s + "destroy() executed...";
		}	
	}
}