//JTable,JScrollPane
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Student{
	int rno;
	String name;
	int m1,m2,m3;
	Student(int rno,String name,int m1,int m2,int m3){
		this.rno=rno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}	
}

class StudentDemo{
	JFrame jf;
	JPanel jp;
	JScrollPane js;
	JTable jt;
	JLabel lrno,lname,lm1,lm2,lm3;
	JTextField trno,name,m1,m2,m3;
	JButton badd;
	FileOutputStream fout;
	ObjectOutputStream out;
	StudentDemo(){
		try{
		fout=new FileOutputStream("student.dat");
		out=new ObjectOutputStream(fout);	
		}catch(Exception e){}
		jf=new JFrame("Student");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setLayout(new GridLayout(1,2));
		jp=new JPanel();
		jp.setLayout(new GridLayout(6,2,10,50));
		lrno=new JLabel("RNO :");jp.add(lrno);
		trno=new JTextField(10);jp.add(trno);

		lname=new JLabel("NAME :");jp.add(lname);
		name=new JTextField(10);jp.add(name);

		lm1=new JLabel("MARK 1 :");jp.add(lm1);
		m1=new JTextField(10);jp.add(m1);

		lm2=new JLabel("MARK 2 :");jp.add(lm2);
		m2=new JTextField(10);jp.add(m2);

		lm3=new JLabel("MARK 3 :");jp.add(lm3);
		m3=new JTextField(10);jp.add(m3);
		
		badd=new JButton("ADD");jp.add(badd);

		jf.add(jp);

		DefaultTableModel model=new DefaultTableModel();//all col and row handlinh
		jt=new JTable(5,5);
		model.addColumn("RNO");
		model.addColumn("Name");
		model.addColumn("Mark1");
		model.addColumn("Mark2");
		model.addColumn("Mark3");
		model.addColumn("Average"); //model is an invisible component 
		
		jt=new JTable(model);
		js=new JScrollPane(jt);
		jf.add(js);
		js=new JScrollPane(jt);
		jf.add(js);
		badd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
				out.writeObject(new Student(Integer.parseInt(trno.getText()),name.getText(),Integer.parseInt(m1.getText()),Integer.parseInt(m2.getText()),Integer.parseInt(m3.getText())));
				}catch(Exception e){}
				model.addRow(new Object[]{trno.getText(),name.getText(),m1.getText(),m2.getText(),m3.getText(),(Integer.parseInt(m1.getText())+Integer.parseInt(m2.getText())+Integer.parseInt(m3.getText()))/3.0});
				jf.getContentPane().repaint();
			}
		});
	}
	public static void main(String args[])throws Exception{
		new StudentDemo();
	}
}
