package eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mango extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField pass ;
	
	public mango(){
	
		super("VARIOUS TYPES OF TEXT FIELDS");
		
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		item1.setToolTipText("u are hovering over item-1");
		add(item1);
		
		item2 = new JTextField("enter text",5);
		item2.setToolTipText("u are hovering over item-2");
		add(item2);
		
		item3 = new JTextField("uneditable");
		item3.setToolTipText("u are hovering over item-3");
		item3.setEditable(false);
		add(item3);
		
		pass = new JPasswordField("mypass",5);
		pass.setToolTipText("u are hovering over the password box");
		add(pass);
		
		handle handler = new handle();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		pass.addActionListener(handler);
		
		
		
	}
	private class handle implements ActionListener
	{
		
		public void actionPerformed(ActionEvent event)
		{
			String string = "";
			
			if(event.getSource() == item1)
				string = String.format("field 1 is : %s", event.getActionCommand());
			else if(event.getSource() == item2)
				string = String.format("field 2 is : %s", event.getActionCommand());
			else if(event.getSource() == item3)
				string = String.format("field 3 is: %s", event.getActionCommand());
			else if(event.getSource() == pass)
				string = String.format("password field is : %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
	}
	

}
