//Innerwindows
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class addframe{
	JFrame jf;
	JButton confirm;
	JLabel id,name,bp;
	JTextField tid,tname,tbp;
	addframe(){
		jf=new JFrame("Add Employee");
		jf.setVisible(true);
		jf.setSize(400,300);
		jf.setLayout(new GridLayout(4,2,5,10));
		
		id=new JLabel("Employee ID :",JLabel.RIGHT);
		tid=new JTextField(15);
		jf.add(id);
		jf.add(tid);
		
		name=new JLabel("Name :",JLabel.RIGHT);
		tname=new JTextField(15);
		jf.add(name);
		jf.add(tname);
		
		bp=new JLabel("Basic Pay:",JLabel.RIGHT);
		tbp=new JTextField(15);
		jf.add(bp);
		jf.add(tbp);

		confirm=new JButton("Submit");
		jf.add(confirm);
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				EmpWin.el.addEmployee(Integer.parseInt(tid.getText()),tname.getText(),Double.parseDouble(tbp.getText()));
			}
		});
	}
}
class remframe{
	JFrame jf;
	JButton confirm;
	JLabel id;
	JTextField tid;
	JTextArea jta;
	remframe(){
		jf=new JFrame("Remove Employee");
		jf.setVisible(true);
		jf.setSize(400,300);
		jf.setLayout(new FlowLayout());
		
		jta=new JTextArea("");
		id=new JLabel("Enter Employee ID:",JLabel.RIGHT);
		tid=new JTextField(10);
		jf.add(id);
		jf.add(tid);
		jf.add(jta);

		confirm=new JButton("CONFIRM");
		confirm.setForeground(Color.RED);
		jf.add(confirm);
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(EmpWin.el.removeEmployee(Integer.parseInt(tid.getText()))){
					jta.setText("Removed Successfully :)");
				}
				else
					jta.setText("Employee not found :(");
				jf.getContentPane().repaint();
			}
		});
	}
}
class updframe{
	JFrame jf;
	JButton confirm;
	JLabel id,name,bp,succ;
	JTextField tid,tname,tbp;
	updframe(){
		jf=new JFrame("Update Employee");
		jf.setVisible(true);
		jf.setSize(400,300);
		jf.setLayout(new GridLayout(4,2,5,10));

		succ=new JLabel("");
		
		id=new JLabel("Employee ID :",JLabel.RIGHT);
		tid=new JTextField(15);
		jf.add(id);
		jf.add(tid);
		
		name=new JLabel("Name :",JLabel.RIGHT);
		tname=new JTextField(15);
		jf.add(name);
		jf.add(tname);
		
		bp=new JLabel("Basic Pay:",JLabel.RIGHT);
		tbp=new JTextField(15);
		jf.add(bp);
		jf.add(tbp);

		confirm=new JButton("Submit");
		jf.add(confirm);
		jf.add(succ);
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(EmpWin.el.update(Integer.parseInt(tid.getText()),new Employee(Integer.parseInt(tid.getText()),tname.getText(),Double.parseDouble(tbp.getText()))))
					succ.setText("Success :)");	
				else
					succ.setText("Employee not found :(");
			}
		});
	}
}

class srchframe{
	JFrame jf;
	JButton confirm;
	JLabel id;
	JTextField tid;
	JTextArea jta;
	srchframe(){
		jf=new JFrame("Search Employee");
		jf.setVisible(true);
		jf.setSize(400,300);
		jf.setLayout(new FlowLayout());
		
		jta=new JTextArea("");
		id=new JLabel("Enter Employee ID:",JLabel.RIGHT);
		tid=new JTextField(10);
		jf.add(id);
		jf.add(tid);
		jf.add(jta);

		confirm=new JButton("Search");
		jf.add(confirm);
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(EmpWin.el.search(Integer.parseInt(tid.getText()))){
					jta.setText("Employee Found Successfully :)");
				}
				else
					jta.setText("Employee not found :(");
				jf.getContentPane().repaint();
			}
		});
	}
}
