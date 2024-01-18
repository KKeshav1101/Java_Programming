import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class Customer{
	String name;
	int no;
	String city;
	Customer(String name,int no,String city){
		this.name=name;
		this.no=no;
		this.city=city;
	}
	public String toString(){
		return name+","+","+city;
	}
}
class CustomerGUI{
	JFrame jf;
	JPanel jp1,jp2,jp3;
 	JTextField txtname,txtno,txtcity;
	JLabel lblname,lblno,lblcity;
	JButton btnadd;
	ArrayList<Customer> ar;
	CustomerGUI(){
		ar=new ArrayList<Customer>();
		jf=new JFrame("CustomerGUI");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setLayout(new GridLayout(1,3));
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jf.add(jp1);
		jf.add(jp2);
		jf.add(jp3);

		jp1.setLayout(new GridLayout(4,2,0,20));  //last two attr are vertical spacing and horizontal spacing
		lblname=new JLabel("Name :",JLabel.RIGHT);
		jp1.add(lblname);
		txtname=new JTextField(15);
		jp1.add(txtname);
		lblno=new JLabel("Number :",JLabel.RIGHT);
		jp1.add(lblno);
		txtno=new JTextField(15);
		jp1.add(txtno);
		lblcity=new JLabel("City :",JLabel.RIGHT);
		jp1.add(lblcity);
		txtcity=new JTextField(15);
		jp1.add(txtcity);
		btnadd=new JButton("Add");
		jp1.add(btnadd);
		
		btnadd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ar.add(new Customer(txtname.getText(),Integer.parseInt(txtno.getText()),txtcity.getText()));
				txtname.setText("");
				txtno.setText("");
				txtcity.setText("");
				jf.getContentPane().repaint();
				System.out.println(ar);
				//JOptionPane.showMessageDialog(jf,'WARNING','ERROR',JOptionPane.WARNING_MESSAGE); use to show exception msg in gui
			}
		});
		
		jf.getContentPane().repaint();
		
	}
	
	public static void main(String args[]){
		new CustomerGUI();
	}
}