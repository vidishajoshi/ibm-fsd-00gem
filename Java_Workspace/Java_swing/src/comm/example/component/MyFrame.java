package comm.example.component;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	private JLabel label1;
	private JTextField textfield1;
	private JButton button2;
	public MyFrame() throws HeadlessException {
		super();
		
		label1=new JLabel();
		label1.setText("Enter your Name:");
		textfield1=new JTextField(25);
		button2=new JButton();
		button2.setText("hello");
		this.setTitle("First program");
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		this.add(label1);
		this.add(textfield1);
		this.add(button2);
		button2.addActionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this,"hello "+textfield1.getText().toString());
		
	}
	
	
	
}
