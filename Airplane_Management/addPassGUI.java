//addPassGUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class addPassGUI{
	JFrame jf;
	JTextField name,id,fno,src,dest;
	JLabel nlbl,idlbl,flbl,srclbl,destlbl;
	JButton save;
	int pno;
	
	addPassGUI(AirlinesManagement am){
		jf=new JFrame("Add Passenger");
		jf.setVisible(true);
		jf.setSize(400,300);
		jf.setLayout(new GridLayout(6,2,0,20));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nlbl=new JLabel("Name :",JLabel.RIGHT);
		idlbl=new JLabel("Passenger ID :",JLabel.RIGHT);
		flbl=new JLabel("Flight No. :",JLabel.RIGHT);
		srclbl=new JLabel("Source :",JLabel.RIGHT);
		destlbl=new JLabel("Destination :",JLabel.RIGHT);

		name=new JTextField(15);
		id=new JTextField(15);
		fno=new JTextField(15);
		src=new JTextField(15);	
		dest=new JTextField(15);
		
		save=new JButton("Save");
		pno=1;
		
		
		jf.add(nlbl);
		jf.add(name);
		jf.add(idlbl);
		jf.add(id);
		jf.add(flbl);
		jf.add(fno);
		jf.add(srclbl);
		jf.add(src);
		jf.add(destlbl);
		jf.add(dest);	
		jf.add(save);
		
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				am.addDetail(new Airlines(name.getText(),id.getText(),fno.getText(),src.getText(),dest.getText()));
				name.setText("");
				id.setText("");
				fno.setText("");
				src.setText("");
				dest.setText("");
			}
		});
	}
}