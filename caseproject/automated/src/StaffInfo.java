import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class StaffInfo extends Frame implements MouseMotionListener
{
	Label lmain;

	int x,y;
	String str;

	StaffInfo()
	{
		super("Staff Information");
		setSize(1024,768);
		setVisible(true);
		setLayout(null);
		addMouseMotionListener(this);
	
		lmain=new Label("Staff Information");
		lmain.setBounds(440,35,107,15);
		add(lmain);
	

	
	
	

	
	}
	public void paint(Graphics g)
	{
		str=x+","+y;
		g.drawString(str,x,y);
		
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();	
	}

	public static void main(String[] args) 
	{
		new StaffInfo();
		System.out.println("Staff Info");
	}
}
