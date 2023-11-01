import javax.swing.*;
import java.awt.event.*;
class FirstSwing{
	JFrame jf;
	JTextField jtxf;
	JButton jbtn;
	JLabel jlbl;
	FirstSwing(){
		jf=new JFrame("Welcome");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //happens by default not necessary
		jf.setLayout(null);
		
		jlbl=new JLabel();
		jtxf=new JTextField();
		jbtn=new JButton("Display",new Font(PLAIN));
		jtxf.setBounds(50,50,150,25);
		jbtn.setBounds(250,50,75,15);
		jf.add(jtxf);
		jf.add(jbtn);
		
		jbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				FirstSwing l=new FirstSwing();
				l.jtxf.setText(jtxf.getText());
			}	
		});
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new FirstSwing();
			}
		});
	}
}