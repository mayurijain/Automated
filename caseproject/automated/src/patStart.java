import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class patStart extends JFrame implements ActionListener
{
	JButton badd,bmod,bview,bback,bexit;
	JLabel linfo,linfo1,linfo2,linfo3,linfo4;
	patStart()
	{
		super("Patient's Information");
		setSize(1024,768);
		setVisible(true);
		setLayout(null);

		linfo=new JLabel("Patient's   Information");
		linfo.setBounds(445,30,210,20);
		add(linfo);

		linfo1=new JLabel("1.  Add  Patients  Information");
		linfo1.setBounds(200,150,210,20);
		add(linfo1);

		badd=new JButton("Add Data",new ImageIcon("images/add.gif"));
		badd.setBounds(340,180,180,30);
		add(badd);

		linfo2=new JLabel("2.  Modify  Patients  Information");
		linfo2.setBounds(200,250,210,20);
		add(linfo2);

		bmod=new JButton("Modify Data",new ImageIcon("images/bModify.png"));
		bmod.setBounds(340,280,180,30);
		add(bmod);
		
		linfo3=new JLabel("3. View  Patients  Information");
		linfo3.setBounds(200,350,210,20);
		add(linfo3);

		bview=new JButton("View Data",new ImageIcon("images/search.png"));
		bview.setBounds(340,380,180,30);
		add(bview);
		
		bback=new JButton("BACK",new ImageIcon("images/restore.png"));
		bback.setBounds(503,545,100,30);
		add(bback);
		
		//bexit=new JButton("EXIT");
		//bexit.setBounds(730,515,100,30);
		//add(bexit);
		
		badd.addActionListener(new add());
		bmod.addActionListener(new mod());
		bview.addActionListener(new view());
		//bexit.addActionListener(new exit());
		bback.addActionListener(new back());
				
	}

	public void actionPerformed(ActionEvent ae)
		{}

	class back implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			new  start();
			setVisible(false);
		}
	}



	class add implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					new PatientInfo();
					setVisible(false);
				}
		}

	class mod implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					new PatientInfomodify();
					setVisible(false);
				}
		}

	class view implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					new PatientInfoView();
					setVisible(false);
				}
		}

/*
	class exit implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					System.exit(0);
				}
		}
*/
	public static void main(String[] args) 
	{
		new patStart();
		System.out.println("Hello World!");
	}
}
