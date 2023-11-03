import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ErrorFrame{
	JFrame frame;
	JLabel wcred;
	ErrorFrame(){
		frame=new JFrame();
		frame.setSize(200,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setLayout(new GridLayout(1,1));
		wcred=new JLabel("Wrong Credentials");
		wcred.setForeground(Color.RED);
		frame.add(wcred);
	}
}
class LoginScreen{
	JFrame frame;
	JPanel panel;
	JLabel userlbl,passlbl;
	JTextField usertxf;
	JPasswordField passfld;
	JButton loginbtn;
	JButton cancelbtn;

	LoginScreen(){
		frame=new JFrame("LOGIN");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,150);
		frame.setLayout(new GridLayout(3,2));
		
		userlbl=new JLabel("Username :");
		usertxf=new JTextField(20);

		passlbl=new JLabel("Password :");
		passfld=new JPasswordField(20);
		
		loginbtn=new JButton("Login");
		cancelbtn=new JButton("Cancel");
		cancelbtn.setBackground(Color.RED);
		
		frame.add(userlbl);
		frame.add(usertxf);
		frame.add(passlbl);
		frame.add(passfld);
		frame.add(loginbtn);
		frame.add(cancelbtn);
		
		frame.setVisible(true);

		loginbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String username=usertxf.getText();
				String password=passfld.getText();
				if(username.equals("kkeshav1101") && password.equals("password")){
					PaintFrame pf=new PaintFrame();
					try{
						Thread.sleep(500);
					}catch(Exception e){}
					frame.setVisible(false);
				}
				else
					new ErrorFrame();
			}
		});
		cancelbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				usertxf.setText("");
				passfld.setText("");
			}
		});
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new LoginScreen();
			}
		});
	}
}