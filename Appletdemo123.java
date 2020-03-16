import java.applet.*;
import java.awt.*;
/*
 <applet code =Appletdemo123.class height=1000 width=1500>
 <param name="x" value="25555">
  <param name="y" value="2000">

 </applet>
 */
	public class Appletdemo123 extends Applet
	{
		int bal;
		String accno;
		public void init()
		{
			setBackground(Color.red);
			setForeground(Color.blue);
			bal=Integer.parseInt(getParameter("x"));
			accno=getParameter("y");

		}
		
		public void paint(Graphics g)
		{
			if(bal<500)
			{
				g.drawString(""+accno+"low balance",100,20);
			}
			else
			{
				g.drawString(""+accno+"sufficent balance",100,20);
			}
			
		}
	}
