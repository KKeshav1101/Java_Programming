//srchPassGUI.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class srchPassGUI{
	JFrame jf;
	JTextField id;
	JLabel idlbl;
	JButton search;
	JLabel found;
	
	srchPassGUI(AirlinesManagement am){
		jf=new JFrame("Search Passenger");
		jf.setVisible(true);
		jf.setSize(400,150);
		jf.setLayout(new GridLayout(3,2,0,20));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		idlbl=new JLabel("Passenger ID :",JLabel.RIGHT);

		id=new JTextField(15);
		
		found=new JLabel("");
		
		search=new JButton("Search");
		
		jf.add(idlbl);
		jf.add(id);
		jf.add(search);
		jf.add(found);
		
		search.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(am.searchPassenger(id.getText()))
					found.setText("Found :)");
				else
					found.setText("Not Found :(");
				id.setText("");
			}
		});
	}
}