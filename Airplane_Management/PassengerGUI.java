import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PassengerGUI{
	JFrame jf;
	JPanel jp;
	JButton addbtn,srchbtn,dispbtn;
	JTextArea details;
	AirlinesManagement am;
	
	PassengerGUI(){
		JFrame jf=new JFrame("JACK & JILL Airlines");
		JPanel jp=new JPanel();
		jf.setVisible(true);
		jf.setSize(450,100);
		jf.setLayout(new FlowLayout());
		jf.add(jp);
		jp.setLayout(new GridLayout(1,3,20,0));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addbtn=new JButton("Add");
		jp.add(addbtn);
		srchbtn=new JButton("Search");
		jp.add(srchbtn);
		dispbtn=new JButton("Display");
		jp.add(dispbtn);
	
		am=new AirlinesManagement();

		addbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new addPassGUI(am);
			}
		});
		srchbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new srchPassGUI(am);
			}
		});
		dispbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new dispGUI(am);
			}
		});
		
		jf.getContentPane().repaint();		
	}
	public static void main(String args[]){
		new PassengerGUI();
	}
}
class dispGUI{
	JFrame jf;
	JTextField id;
	JLabel idlbl;
	JButton search;
	JTextArea details;
	JLabel found;
	dispGUI(AirlinesManagement am){
		jf=new JFrame("Display Passenger");
		jf.setVisible(true);
		jf.setSize(400,150);
		jf.setLayout(new GridLayout(3,2,0,20));
		
		idlbl=new JLabel("Passenger ID :",JLabel.RIGHT);

		id=new JTextField(15);
		
		details=new JTextArea("");
		found=new JLabel("");
		
		search=new JButton("Display");
		
		jf.add(idlbl);
		jf.add(id);
		jf.add(search);
		jf.add(found);
		jf.add(details);

		search.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(am.searchPassenger(id.getText())){
					details.setText(""+am.displayPassenger(id.getText()));
					found.setText("found:)");
				}
				else{
					found.setText("not found:(");
					details.setText("Not available :(");
				}
			}
		});
		
		
			
	}

}
