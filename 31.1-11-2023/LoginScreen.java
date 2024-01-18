import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
       	JFrame frame;
	JPanel panel;
	JLabel userLabel;	
	JLabel passLabel;
	JTextField userTextField;	
	JPasswordField passField;
	JButton loginButton;
	
	LoginScreen(){
		frame=new JFrame("Login");
       		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       		frame.setSize(300, 150);
		panel = new JPanel();


  		userLabel = new JLabel("Username:");
       		passLabel = new JLabel("Password:");

       		userTextField = new JTextField(20);
       		passField = new JPasswordField(20);

   		loginButton = new JButton("Login");
		
		panel.add(userLabel);
        	panel.add(userTextField);
        	panel.add(passLabel);
        	panel.add(passField);
        	panel.add(loginButton);

        	frame.add(panel);

        	frame.setVisible(true);

		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
    				String username = userTextField.getText(); // Get the entered username
    				String password = new String(passField.getPassword()); // Get the entered password
				System.out.println("Recorded entry for "+username+" with password "+ password);
			}
        	});
	}
	public static void main(String args[]){
		new LoginScreen();
	}   		
}
