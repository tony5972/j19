
/*<html>
	<head>
	</head>
	<body bgcolor="000000">
		<center>
			<applet code="Slip19_1" width="500" height="500">
			</applet>
		</center>
	</body>
</html>*/
 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;

 public class Slip19_1  extends Applet implements KeyListener
{
	String msg="";

	public void init()
	{
 		setBackground(Color.red);
 		addKeyListener(this);
 	}
 	public void paint(Graphics g)
 	{
 		g.drawString("WELCOME OSIM"+msg,250,250);
		
 	}
 	public void keyTyped(KeyEvent e)
 	{
 		msg="Key Typed "+ e.getKeyChar();
		setBackground(Color.blue);
		showStatus(msg);
 		repaint();
 	}
 	public void keyPressed(KeyEvent e)
 	{
 		msg="Key pressed "+ e.getKeyChar();
		setBackground(Color.black);
		showStatus(msg);
 		repaint();
 	}
 	public void keyReleased(KeyEvent e)
 	{
 		msg="Key Released "+ e.getKeyChar();
		setBackground(Color.magenta);
		showStatus(msg);
 		repaint();
 	}
}
